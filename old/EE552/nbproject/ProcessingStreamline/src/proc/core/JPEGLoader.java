package proc.core;

import java.util.HashMap;
import java.awt.Image;
import java.io.InputStream;
import javax.swing.ImageIcon;

/**
 *
 * @author dkruger
 */
public class JPEGLoader extends ImageLoader {
    public final String[] extensions() {
        return new String[] {"jpg", "jpeg"};
    }
    @Override
    public PImage load(String filename) {
        byte[] bytes = FileBase.loadBytes(filename);
        Image awtImage = new ImageIcon(bytes).getImage();
        PImage image = new PImage(awtImage);
        if (image.width == -1) {
            throw new RuntimeException("The file " + filename +
                               " contains bad image data, or may not be an image.");
        }
        return image;
    }
}
