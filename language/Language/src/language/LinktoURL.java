package language;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author dkruger
 */
public class LinktoURL {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("http://www.nytimes.com");
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            desktop.browse(uri);
        }
    }
}
