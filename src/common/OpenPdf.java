
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author AK
 */
public class OpenPdf {
    public static void openById(String id) {
        try {
            if ((new File("D:\\" + id + ".pdf").exists())) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler D:\\" + id + ".pdf");

            } else
                JOptionPane.showMessageDialog(null, "File Does not Exists...");

        } catch (Exception e

        ) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
