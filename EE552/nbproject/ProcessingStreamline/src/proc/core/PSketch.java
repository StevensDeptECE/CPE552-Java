package proc.core;

/**
 * PSketch holds all state global to the sketch that is not properly assigned to
 * a single window.
 * String with the current directory for the sketch
 *
 * All I/O static functions which can be used by any class (such as PApplet2) 
 * Global debug facility
 * Java version and operating system
 *
 */

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.util.concurrent.ExecutorService;


public class PSketch implements PConstants {
  /**
   * Path to sketch folder.
   * There is now a single, static shared directory so that the sketch has a single
   * directory, even though there might be multiple PApplets sharing.
   * Use: sketchPath() method to ensure this is initialized properly.
   * Call sketchPath() once to set the default.
   */
  private static String path;
  private static int DEBUGLEVEL;
  // Default width and height for sketch when not specified
  static public final int DEFAULT_WIDTH = 100;
  static public final int DEFAULT_HEIGHT = 100;
  static public int platform;
  static public final String javaVersionName;//Full Java version (i.e. 1.5.0_11) 
  static public final int javaPlatform;
  protected static GraphicsDevice[] displayDevices;
  static public int displayWidth;
  static public int displayHeight;
  static private int numLoaderThreads;
  static private ExecutorService requestImagePool;

  static Throwable uncaughtThrowable;

  static {
    javaVersionName = System.getProperty("java.version");
    String version = javaVersionName;
    if (javaVersionName.startsWith("1.")) {
      version = version.substring(2);
    }
    javaPlatform = Integer.parseInt(version.substring(0, version.indexOf('.')));
    String osname = System.getProperty("os.name");
    platform = (osname.indexOf("Mac") != -1) ? MACOSX :
                    (osname.indexOf("Windows") != -1) ? WINDOWS :
                     (osname.equals("Linux")) ? LINUX : OTHER;
    DEBUGLEVEL = 0;
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = ge.getDefaultScreenDevice();
    displayDevices = ge.getScreenDevices();

    numLoaderThreads = 4;
    // create n background threads for asynchronous loading work
    ThreadFactory factory = new ThreadFactory() {
      public Thread newThread(Runnable r) {
        return new Thread(r, "loader thread");
      }
    };
    requestImagePool = Executors.newFixedThreadPool(numLoaderThreads, factory);

  }

  static public void debug(String msg) {
    if (DEBUGLEVEL > 0) System.out.println(msg);
  }
  
  static public final String getExtension(String filename) {
    String lower = filename.toLowerCase();
    int dot = filename.lastIndexOf('.');
    if (dot == -1) {
      return null;
    } else {
      return lower.substring(dot + 1);
    }
  }
  
  /**
   * @param extension type of image to load, for example "png", "gif", "jpg"
   */
/*  public PImage loadImage(String filename) throws IOException {
    String extension = getExtension(filename);
    if (extension.equals("tga")) {
      return loadImageTGA(filename);
    else if (extension.equals("tif") || extension.equals("tiff")) {
      return loadTIFF(filename);
    } if (extension.equals("jpg") || extension.equals("jpeg") ||
          extension.equals("gif") || extension.equals("png") ||
          extension.equals("unknown")) {
        byte bytes[] = loadBytes(filename);
        if (bytes == null) {
          return null;
        } else {
          Image awtImage = new ImageIcon(bytes).getImage();

          if (awtImage instanceof BufferedImage) {
            BufferedImage buffImage = (BufferedImage) awtImage;
            int space = buffImage.getColorModel().getColorSpace().getType();
            if (space == ColorSpace.TYPE_CMYK) {
              System.err.println(filename + " is a CMYK image, " +
                                 "only RGB images are supported.");
              return null;
            }
          }

          PImage image = new PImage(awtImage);
          if (image.width == -1) {
            System.err.println("The file " + filename +
                               " contains bad image data, or may not be an image.");
          }

          // if it's a .gif image, test to see if it has transparency
          if (extension.equals("gif") || extension.equals("png") ||
              extension.equals("unknown")) {
            image.checkAlpha();
          }
          image.parent = this;
          return image;
        }
      }
    } catch (Exception e) {
      // show error, but move on to the stuff below, see if it'll work
      printStackTrace(e);
    }

    if (loadImageFormats == null) {
      loadImageFormats = ImageIO.getReaderFormatNames();
    }
    if (loadImageFormats != null) {
      for (int i = 0; i < loadImageFormats.length; i++) {
        if (extension.equals(loadImageFormats[i])) {
          return loadImageIO(filename);
        }
      }
    }

    // failed, could not load image after all those attempts
    System.err.println("Could not find a method to load " + filename);
    return null;
  }
*/

  //////////////////////////////////////////////////////////////

  // FONT I/O

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
   * Used by PGraphics to remove the requirement for loading a font!
   */
  protected PFont createDefaultFont(float size) {
    return createFont("Lucida Sans", size, true, null);
  }


  public PFont createFont(String name, float size) {
    return createFont(name, size, true, null);
  }


  public PFont createFont(String name, float size, boolean smooth) {
    return createFont(name, size, smooth, null);
  }


  /**
   * ( begin auto-generated from createFont.xml )
   *
   * Dynamically converts a font to the format used by Processing from either
   * a font name that's installed on the computer, or from a .ttf or .otf
   * file inside the sketches "data" folder. This function is an advanced
   * feature for precise control. On most occasions you should create fonts
   * through selecting "Create Font..." from the Tools menu.
   * <br /><br />
   * Use the <b>PFont.list()</b> method to first determine the names for the
   * fonts recognized by the computer and are compatible with this function.
   * Because of limitations in Java, not all fonts can be used and some might
   * work with one operating system and not others. When sharing a sketch
   * with other people or posting it on the web, you may need to include a
   * .ttf or .otf version of your font in the data directory of the sketch
   * because other people might not have the font installed on their
   * computer. Only fonts that can legally be distributed should be included
   * with a sketch.
   * <br /><br />
   * The <b>size</b> parameter states the font size you want to generate. The
   * <b>smooth</b> parameter specifies if the font should be antialiased or
   * not, and the <b>charset</b> parameter is an array of chars that
   * specifies the characters to generate.
   * <br /><br />
   * This function creates a bitmapped version of a font in the same manner
   * as the Create Font tool. It loads a font by name, and converts it to a
   * series of images based on the size of the font. When possible, the
   * <b>text()</b> function will use a native font rather than the bitmapped
   * version created behind the scenes with <b>createFont()</b>. For
   * instance, when using P2D, the actual native version of the font will be
   * employed by the sketch, improving drawing quality and performance. With
   * the P3D renderer, the bitmapped version will be used. While this can
   * drastically improve speed and appearance, results are poor when
   * exporting if the sketch does not include the .otf or .ttf file, and the
   * requested font is not available on the machine running the sketch.
   *
   * ( end auto-generated )
   * @webref typography:loading_displaying
   * @param name name of the font to load
   * @param size point size of the font
   * @param smooth true for an antialiased font, false for aliased
   * @param charset array containing characters to be generated
   * @see PFont
   * @see PGraphics#textFont(PFont, float)
   * @see PGraphics#text(String, float, float, float, float)
   * @see PApplet#loadFont(String)
   */
  public PFont createFont(String name, float size,
                          boolean smooth, char[] charset) {
    if (g == null) {
      throw new RuntimeException("createFont() can only be used inside setup() or after setup() has been called.");
    }
    return g.createFont(name, size, smooth, charset);
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


  public String sketchPath() {
    if (sketchPath == null) {
      sketchPath = calcSketchPath();
    }
    return sketchPath;
  }


  /**
   * Prepend the sketch folder path to the filename (or path) that is
   * passed in. External libraries should use this function to save to
   * the sketch folder.
   * <p/>
   * Note that when running as an applet inside a web browser,
   * the sketchPath will be set to null, because security restrictions
   * prevent applets from accessing that information.
   * <p/>
   * This will also cause an error if the sketch is not inited properly,
   * meaning that init() was never called on the PApplet when hosted
   * my some other main() or by other code. For proper use of init(),
   * see the examples in the main description text for PApplet.
   */
  public String sketchPath(String where) {
    if (sketchPath() == null) {
      return where;
    }
    // isAbsolute() could throw an access exception, but so will writing
    // to the local disk using the sketch path, so this is safe here.
    // for 0120, added a try/catch anyways.
    try {
      if (new File(where).isAbsolute()) return where;
    } catch (Exception e) { }

    return sketchPath() + File.separator + where;
  }


  public File sketchFile(String where) {
    return new File(sketchPath(where));
  }


  /**
   * Returns a path inside the applet folder to save to. Like sketchPath(),
   * but creates any in-between folders so that things save properly.
   * <p/>
   * All saveXxxx() functions use the path to the sketch folder, rather than
   * its data folder. Once exported, the data folder will be found inside the
   * jar file of the exported application or applet. In this case, it's not
   * possible to save data into the jar file, because it will often be running
   * from a server, or marked in-use if running from a local file system.
   * With this in mind, saving to the data path doesn't make sense anyway.
   * If you know you're running locally, and want to save to the data folder,
   * use <TT>saveXxxx("data/blah.dat")</TT>.
   */
  public String savePath(String where) {
    if (where == null) return null;
    String filename = sketchPath(where);
    createPath(filename);
    return filename;
  }


  /**
   * Identical to savePath(), but returns a File object.
   */
  public File saveFile(String where) {
    return new File(savePath(where));
  }


  static File desktopFolder;

  /** Not a supported function. For testing use only. */
  static public File desktopFile(String what) {
    if (desktopFolder == null) {
      // Should work on Linux and OS X (on OS X, even with the localized version).
      desktopFolder = new File(System.getProperty("user.home"), "Desktop");
      if (!desktopFolder.exists()) {
        if (platform == WINDOWS) {
          FileSystemView filesys = FileSystemView.getFileSystemView();
          desktopFolder = filesys.getHomeDirectory();
        } else {
          throw new UnsupportedOperationException("Could not find a suitable desktop foldder");
        }
      }
    }
    return new File(desktopFolder, what);
  }


  /** Not a supported function. For testing use only. */
  static public String desktopPath(String what) {
    return desktopFile(what).getAbsolutePath();
  }


  /**
   * <b>This function almost certainly does not do the thing you want it to.</b>
   * The data path is handled differently on each platform, and should not be
   * considered a location to write files. It should also not be assumed that
   * this location can be read from or listed. This function is used internally
   * as a possible location for reading files. It's still "public" as a
   * holdover from earlier code.
   * <p>
   * Libraries should use createInput() to get an InputStream or createOutput()
   * to get an OutputStream. sketchPath() can be used to get a location
   * relative to the sketch. Again, <b>do not</b> use this to get relative
   * locations of files. You'll be disappointed when your app runs on different
   * platforms.
   */
  public String dataPath(String where) {
    return dataFile(where).getAbsolutePath();
  }


  /**
   * Return a full path to an item in the data folder as a File object.
   * See the dataPath() method for more information.
   */
  public File dataFile(String where) {
    // isAbsolute() could throw an access exception, but so will writing
    // to the local disk using the sketch path, so this is safe here.
    File why = new File(where);
    if (why.isAbsolute()) return why;

    URL jarURL = getClass().getProtectionDomain().getCodeSource().getLocation();
    // Decode URL
    String jarPath;
    try {
      jarPath = jarURL.toURI().getPath();
    } catch (URISyntaxException e) {
      e.printStackTrace();
      return null;
    }
    if (jarPath.contains("Contents/Java/")) {
      File containingFolder = new File(jarPath).getParentFile();
      File dataFolder = new File(containingFolder, "data");
      return new File(dataFolder, where);
    }
    // Windows, Linux, or when not using a Mac OS X .app file
    File workingDirItem =
      new File(sketchPath + File.separator + "data" + File.separator + where);
    return workingDirItem;
  }

  /**
   * Takes a path and creates any in-between folders if they don't
   * already exist. Useful when trying to save to a subfolder that
   * may not actually exist.
   */
  static public void createPath(String path) {
    createPath(new File(path));
  }


  static public void createPath(File file) {
    try {
      String parent = file.getParent();
      if (parent != null) {
        File unit = new File(parent);
        if (!unit.exists()) unit.mkdirs();
      }
    } catch (SecurityException se) {
      System.err.println("You don't have permissions to create " +
                         file.getAbsolutePath());
    }
  }


  static public String getExtension(String filename) {
    String extension;

    String lower = filename.toLowerCase();
    int dot = filename.lastIndexOf('.');
    if (dot == -1) {
      return "";  // no extension found
    }
    extension = lower.substring(dot + 1);

    // check for, and strip any parameters on the url, i.e.
    // filename.jpg?blah=blah&something=that
    int question = extension.indexOf('?');
    if (question != -1) {
      extension = extension.substring(0, question);
    }

    return extension;
  }


  //////////////////////////////////////////////////////////////

  // URL ENCODING


  static public String urlEncode(String str) {
    try {
      return URLEncoder.encode(str, "UTF-8");
    } catch (UnsupportedEncodingException e) {  // oh c'mon
      return null;
    }
  }


  // DO NOT use for file paths, URLDecoder can't handle RFC2396
  // "The recommended way to manage the encoding and decoding of
  // URLs is to use URI, and to convert between these two classes
  // using toURI() and URI.toURL()."
  // https://docs.oracle.com/javase/8/docs/api/java/net/URL.html
  static public String urlDecode(String str) {
    try {
      return URLDecoder.decode(str, "UTF-8");
    } catch (UnsupportedEncodingException e) {  // safe per the JDK source
      return null;
    }
  }

  void handleSettings() {
    insideSettings = true;

    // Need the list of display devices to be queried already for usage below.
    // https://github.com/processing/processing/issues/3295
    // https://github.com/processing/processing/issues/3296
    // Not doing this from a static initializer because it may cause
    // PApplet to cache and the values to stick through subsequent runs.
    // Instead make it a runtime thing and a local variable.

    // Default or unparsed will be -1, spanning will be 0, actual displays will
    // be numbered from 1 because it's too weird to say "display 0" in prefs.
    if (display > 0 && display <= displayDevices.length) {
      device = displayDevices[display-1];
    }
    // Set displayWidth and displayHeight for people still using those.
    DisplayMode displayMode = device.getDisplayMode();
    displayWidth = displayMode.getWidth();
    displayHeight = displayMode.getHeight();

    // Here's where size(), fullScreen(), smooth(N) and noSmooth() might
    // be called, conjuring up the demons of various rendering configurations.
    settings();

    if (display == SPAN && platform == MACOSX) {
      // Make sure "Displays have separate Spaces" is unchecked
      // in System Preferences > Mission Control
      Process p = exec("defaults", "read", "com.apple.spaces", "spans-displays");
      BufferedReader outReader = createReader(p.getInputStream());
      BufferedReader errReader = createReader(p.getErrorStream());
      StringBuilder stdout = new StringBuilder();
      StringBuilder stderr = new StringBuilder();
      String line = null;
      try {
        while ((line = outReader.readLine()) != null) {
          stdout.append(line);
        }
        while ((line = errReader.readLine()) != null) {
          stderr.append(line);
        }
      } catch (IOException e) {
        printStackTrace(e);
      }

      int resultCode = -1;
      try {
        resultCode = p.waitFor();
      } catch (InterruptedException e) { }

      String result = trim(stdout.toString());
      if ("0".equals(result)) {
        EventQueue.invokeLater(new Runnable() {
          public void run() {
            checkLookAndFeel();
            final String msg =
              "To use fullScreen(SPAN), first turn off “Displays have separate spaces”\n" +
              "in System Preferences \u2192 Mission Control. Then log out and log back in.";
            JOptionPane.showMessageDialog(null, msg, "Apple's Defaults Stink",
                                          JOptionPane.WARNING_MESSAGE);
          }
        });
      } else if (!"1".equals(result)) {
        System.err.println("Could not check the status of “Displays have separate spaces.”");
        System.err.format("Received message '%s' and result code %d.%n", trim(stderr.toString()), resultCode);
      }
    }

    insideSettings = false;
  }


	  /**
   * Better way of handling e.printStackTrace() calls so that they can be
   * handled by subclasses as necessary.
   */
  protected void printStackTrace(Throwable t) {
    t.printStackTrace();
  }


  /**
   * Function for an applet/application to kill itself and
   * display an error. Mostly this is here to be improved later.
   */
  public void die(String what) {
    dispose();
    throw new RuntimeException(what);
  }


  /**
   * Same as above but with an exception. Also needs work.
   */
  public void die(String what, Exception e) {
    if (e != null) e.printStackTrace();
    die(what);
  }

}
