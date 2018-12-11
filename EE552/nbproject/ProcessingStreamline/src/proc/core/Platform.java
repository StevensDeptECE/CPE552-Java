/**
	 Encapsulate everything about each platform


 */

package processing.core;

public abstract class Platform {

	/**
	 * Return the complete shell command needed to run on this platform
	 */
	public abstract String shell();

	/**
	 * Perform any modifications on this platform to correct errors or make it look
	 * better, more uniform
	 */
	public abstract void lookAndFeel();
}
