public class PSketch {
	/**
   * Path to sketch folder.
   * There is now a single, static shared directory so that the sketch has a single
	 * directory, even though there might be multiple PApplets sharing.

	 * Use: sketchPath() method to ensure this is initialized properly.
   * Call sketchPath() once to set the default.
   */
  private static String sketchPath;
  static final boolean DEBUG = false;

  /** Default width and height for sketch when not specified */
  static public final int DEFAULT_WIDTH = 100;
  static public final int DEFAULT_HEIGHT = 100;

	/**
   * Current platform in use, one of the
   * PConstants WINDOWS, MACOSX, MACOS9, LINUX or OTHER.
   */
  static public int platform;
  /** Full name of the Java version (i.e. 1.5.0_11). */
  static public final String javaVersionName;

  static public final int javaPlatform;
  static {

    javaVersionName = System.getProperty("java.version");
		String version = javaVersionName;
    if (javaVersionName.startsWith("1.")) {
      version = version.substring(2);
    }
    javaPlatform = parseInt(version.substring(0, version.indexOf('.')));
    String osname = System.getProperty("os.name");
    if (osname.indexOf("Mac") != -1) {
      platform = MACOSX;

    } else if (osname.indexOf("Windows") != -1) {
      platform = WINDOWS;

    } else if (osname.equals("Linux")) {  // true for the ibm vm
      platform = LINUX;

    } else {
      platform = OTHER;
    }
  }

  /**
   * Whether to use native (AWT) dialogs for selectInput and selectOutput.
   * The native dialogs on some platforms can be ugly, buggy, or missing
   * features. For 3.3.5, this defaults to true on all platforms.
   */
  static public boolean useNativeSelect = true;

	
  /**
   * ( begin auto-generated from displayWidth.xml )
   *
   * System variable which stores the width of the computer screen. For
   * example, if the current screen resolution is 1024x768,
   * <b>displayWidth</b> is 1024 and <b>displayHeight</b> is 768. These
   * dimensions are useful when exporting full-screen applications.
   * <br /><br />
   * To ensure that the sketch takes over the entire screen, use "Present"
   * instead of "Run". Otherwise the window will still have a frame border
   * around it and not be placed in the upper corner of the screen. On Mac OS
   * X, the menu bar will remain present unless "Present" mode is used.
   *
   * ( end auto-generated )
   */
  public int displayWidth;

  /**
   * ( begin auto-generated from displayHeight.xml )
   *
   * System variable that stores the height of the computer screen. For
   * example, if the current screen resolution is 1024x768,
   * <b>displayWidth</b> is 1024 and <b>displayHeight</b> is 768. These
   * dimensions are useful when exporting full-screen applications.
   * <br /><br />
   * To ensure that the sketch takes over the entire screen, use "Present"
   * instead of "Run". Otherwise the window will still have a frame border
   * around it and not be placed in the upper corner of the screen. On Mac OS
   * X, the menu bar will remain present unless "Present" mode is used.
   *
   * ( end auto-generated )
   */
  public int displayHeight;

  /**
   * Command line options passed in from main().
   * This does not include the arguments passed in to PApplet itself.
   * @see PApplet#main
   */
  public static String[] args;

	/** used by the UncaughtExceptionHandler, so has to be static */
  static Throwable uncaughtThrowable;

	  /**
   * Position of the upper-lefthand corner of the editor window
   * that launched this applet.
   */
  static public final String ARGS_EDITOR_LOCATION = "--editor-location";

  static public final String ARGS_EXTERNAL = "--external";

  /**
   * Location for where to position the applet window on screen.
   * <p>
   * This is used by the editor to when saving the previous applet
   * location, or could be used by other classes to launch at a
   * specific position on-screen.
   */
  static public final String ARGS_LOCATION = "--location";

  /** Used by the PDE to suggest a display (set in prefs, passed on Run) */
  static public final String ARGS_DISPLAY = "--display";

//  static public final String ARGS_SPAN_DISPLAYS = "--span";

  static public final String ARGS_WINDOW_COLOR = "--window-color";

  static public final String ARGS_PRESENT = "--present";

  static public final String ARGS_STOP_COLOR = "--stop-color";

  static public final String ARGS_HIDE_STOP = "--hide-stop";
