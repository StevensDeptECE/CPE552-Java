package proc.core;

import java.awt.Image;
import java.io.*;
import java.util.HashMap;
import javax.swing.ImageIcon;
/**
 *
 * @author dkruger
 */
public class PNGLoader extends ImageLoader {
    public final String[] extensions() { 
        return new String[] {"png"};
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
