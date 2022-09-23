package proc.core;

import java.io.*;
import java.util.*;
/**
 *
 * @author dkruger
 */
public abstract class ImageLoader {
    public abstract String[] extensions();
    public abstract PImage load(String filename);
}
