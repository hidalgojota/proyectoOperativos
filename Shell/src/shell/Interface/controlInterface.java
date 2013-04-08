/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shell.Interface;

/**
 *
 * @author Josué
 */

        
public class controlInterface {
    viewFileManager viewFile = new viewFileManager();
    viewFileManager viewProcess = new viewFileManager();
    
    public void ShowFileView(){
        if(viewFile.isShowing())
            viewFile.show(false);
        else
            viewFile.show(true);
    }
    
    public void ShowProcessView(){
        if(viewProcess.isShowing())
            viewProcess.show(false);
        else
            viewProcess.show(true);
    }
}
