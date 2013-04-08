/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shell;
import shell.Interface.*;
/**
 *
 * @author Josué
 */
public class Shell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        viewPrincipal principal = new viewPrincipal();
        principal.setVisible(true);
    }
}
