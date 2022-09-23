package proc.core;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.zip.*;
import static proc.core.PApplet.platform;
/**
 *
 * @author dkruger
 */
public class FileBase {
    private static File baseDir; // base directory containing all files in the program
    private static File data;    // data directory containing data of any type
    private static int bufferSize;
    private static HashMap<String, ImageLoader> imgLoader;
    static {
       bufferSize = 8192;
       baseDir = new File("."); // TODO: get base directory of this package
       data = new File(baseDir, "data"); // relative to base, data
       imgLoader = registerLoaders(imgLoader, "JPEG", "PNG", "Targa", "TIFF");
    }
    
    private static HashMap<String,ImageLoader> registerLoaders(HashMap<String,ImageLoader> map, String... names) {
       for (String name : names) { 
           try {
               Class loaderClass = Class.forName(name);
               ImageLoader loader = (ImageLoader)loaderClass.newInstance();
               for (String ext : loader.extensions())
                   map.put(ext, loader);
           } catch(Exception e) {
               System.err.println("Error loading ImageLoader " + name);
           }
       }
       return map;
    }

      static protected String calcSketchPath() {
    // try to get the user folder. if running under java web start,
    // this may cause a security exception if the code is not signed.
    // http://processing.org/discourse/yabb_beta/YaBB.cgi?board=Integrate;action=display;num=1159386274
    String folder = null;
    try {
      folder = System.getProperty("user.dir");

      URL jarURL =
          PApplet.class.getProtectionDomain().getCodeSource().getLocation();
      // Decode URL
      String jarPath = jarURL.toURI().getSchemeSpecificPart();

      // Workaround for bug in Java for OS X from Oracle (7u51)
      // https://github.com/processing/processing/issues/2181
      if (platform == MACOSX) {
        if (jarPath.contains("Contents/Java/")) {
          String appPath = jarPath.substring(0, jarPath.indexOf(".app") + 4);
          File containingFolder = new File(appPath).getParentFile();
          folder = containingFolder.getAbsolutePath();
        }
      } else {
        // Working directory may not be set properly, try some options
        // https://github.com/processing/processing/issues/2195
        if (jarPath.contains("/lib/")) {
          // Windows or Linux, back up a directory to get the executable
          folder = new File(jarPath, "../..").getCanonicalPath();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return folder;
  }

    public static byte[] loadBytes(String filename) {
        return null;
    }
    
    public static String getExtension(String filename) {
        String lower = filename.toLowerCase();
        int dot = filename.lastIndexOf('.');
        if (dot == -1) {
            return "";  // no extension found
        }
        return lower.substring(dot + 1);
    }

    public static InputStream createInputStream(String filename) throws IOException {
        File f = new File(data, filename);
        String ext = getExtension(filename);
        if (ext.equals(".gz")) {
            return new BufferedInputStream
                (new GZIPInputStream(new FileInputStream(f)), bufferSize);
        }
        return new BufferedInputStream(new FileInputStream(filename), bufferSize);
    }

    public static OutputStream createOutputStream(String filename) throws IOException {
        File f = new File(data, filename);
        String ext = getExtension(filename);
        if (ext.equals(".gz")) {
            return new BufferedOutputStream
                (new GZIPOutputStream(new FileOutputStream(f)), bufferSize);
        }
        return new BufferedOutputStream(new FileOutputStream(filename), bufferSize);
    }
    
    public static PrintWriter createWriter(String filename) throws IOException {
        return new PrintWriter(createOutputStream(filename));
    }
    public static void createPath(File dir, String filename) throws IOException {
      // TODO: Create directory   
    }
    
    public static PrintWriter createWriterWithDirs(String filename)
                throws IOException {
      createPath(baseDir, filename);  // make sure in-between folders exist
      return createWriter(filename);
    }

   public static PrintWriter createWriter(OutputStream output) {
    BufferedOutputStream bos = new BufferedOutputStream(output, 8192);
    OutputStreamWriter osw =
      new OutputStreamWriter(bos, StandardCharsets.UTF_8);
    return new PrintWriter(osw);
  }

  /**
   * @nowebref
   * I want to read lines from a stream. If I have to type the
   * following lines any more I'm gonna send Sun my medical bills.
   */
  static public BufferedReader createReader(InputStream input) {
    InputStreamReader isr =
      new InputStreamReader(input, StandardCharsets.UTF_8);

    BufferedReader reader = new BufferedReader(isr);
    // consume the Unicode BOM (byte order marker) if present
    try {
      reader.mark(1);
      int c = reader.read();
      // if not the BOM, back up to the beginning again
      if (c != '\uFEFF') {
        reader.reset();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return reader;
  }
  PImage loadImage(String filename) {
    return imgLoader.get(getExtension(filename)).load(filename);
  }
  
    /**
   * ( begin auto-generated from loadFont.xml )
   *
   * Loads a font into a variable of type <b>PFont</b>. To load correctly,
   * fonts must be located in the data directory of the current sketch. To
   * create a font to use with Processing, select "Create Font..." from the
   * Tools menu. This will create a font in the format Processing requires
   * and also adds it to the current sketch's data directory.<br />
   * <br />
   * Like <b>loadImage()</b> and other functions that load data, the
   * <b>loadFont()</b> function should not be used inside <b>draw()</b>,
   * because it will slow down the sketch considerably, as the font will be
   * re-loaded from the disk (or network) on each frame.<br />
   * <br />
   * For most renderers, Processing displays fonts using the .vlw font
   * format, which uses images for each letter, rather than defining them
   * through vector data. When <b>hint(ENABLE_NATIVE_FONTS)</b> is used with
   * the JAVA2D renderer, the native version of a font will be used if it is
   * installed on the user's machine.<br />
   * <br />
   * Using <b>createFont()</b> (instead of loadFont) enables vector data to
   * be used with the JAVA2D (default) renderer setting. This can be helpful
   * when many font sizes are needed, or when using any renderer based on
   * JAVA2D, such as the PDF library.
   *
   * ( end auto-generated )
  * @webref typography:loading_displaying
  * @param filename name of the font to load
  * @see PFont
  * @see PGraphics#textFont(PFont, float)
  * @see PApplet#createFont(String, float, boolean, char[])
  */
  public PFont loadFont(String filename) {
    if (!filename.toLowerCase().endsWith(".vlw")) {
      throw new IllegalArgumentException("loadFont() is for .vlw files, try createFont()");
    }
    try {
      InputStream input = createInput(filename);
      return new PFont(input);

    } catch (Exception e) {
      die("Could not load font " + filename + ". " +
          "Make sure that the font has been copied " +
          "to the data folder of your sketch.", e);
    }
    return null;
  }

    /**
   * ( begin auto-generated from requestImage.xml )
   *
   * This function load images on a separate thread so that your sketch does
   * not freeze while images load during <b>setup()</b>. While the image is
   * loading, its width and height will be 0. If an error occurs while
   * loading the image, its width and height will be set to -1. You'll know
   * when the image has loaded properly because its width and height will be
   * greater than 0. Asynchronous image loading (particularly when
   * downloading from a server) can dramatically improve performance.<br />
   * <br/> <b>extension</b> parameter is used to determine the image type in
   * cases where the image filename does not end with a proper extension.
   * Specify the extension as the second parameter to <b>requestImage()</b>.
   *
   * ( end auto-generated )
   *
   * @webref image:loading_displaying
   * @param filename name of the file to load, can be .gif, .jpg, .tga, or a handful of other image types depending on your platform
   * @param extension the type of image to load, for example "png", "gif", "jpg"
   * @see PImage
   * @see PApplet#loadImage(String, String)
   */
  public static PImage asynchLoadImage(String filename) {
    // Make sure saving to this file completes before trying to load it
    PImage vessel = createImage(0, 0, ARGB);

    requestImagePool.execute(() -> {
      PImage actual = loadImage(filename, extension);

      // An error message should have already printed
      if (actual == null) {
        vessel.width = -1;
        vessel.height = -1;

      } else {
        vessel.width = actual.width;
        vessel.height = actual.height;
        vessel.format = actual.format;
        vessel.pixels = actual.pixels;

        vessel.pixelWidth = actual.width;
        vessel.pixelHeight = actual.height;
        vessel.pixelDensity = 1;
      }
    });
    return vessel;
  }


}
