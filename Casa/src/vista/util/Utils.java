/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.util;
import java.io.File;
import javax.swing.ImageIcon;

/* Utils.java is used by FileChooserDemo2.java. */
public class Utils {
    public final static String mp3 = "mp3";
//    public final static String jpg = "jpg";
//    public final static String gif = "gif";
//    public final static String tiff = "tiff";
//    public final static String tif = "tif";
//    public final static String png = "png";

    /*
     * Get the extension of a file.
     */
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Utils.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public String agregarBarra(String cadena)
    {
        String path = cadena.replace('*', '\\');
        return path;
    }

    public String reemplazarAzterisco(String path)
    {
        String n = path.replace('\\', '*');
        return n;
    }
}
