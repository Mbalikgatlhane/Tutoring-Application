
package ac.za.cput.userprojectgui;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Motlalepula Kgatlhane
 * 221684212
 * 06 March 2023
 */
public class RunUserGui {
    public static void main(String[] args) {
        UserGui guiObject = new UserGui();
        //guiObject.setTitle("User Authentication");
        guiObject.pack(); //set frame
        guiObject.setSize(400, 150);
        guiObject.setVisible(true);
        guiObject.setDefaultCloseOperation(EXIT_ON_CLOSE);
        guiObject.setUserGui();
        
        
    }
}
