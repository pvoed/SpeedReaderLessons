/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author DaVo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                ReadHelper view = null;
                //SpeedReadVerticle view = null;
                //ReadingPassageQuiz view = null;
                //try {
                //Quiz view = null;
                //view = new ReadingPassageQuiz();
                view = new ReadHelper();

                //} catch (FileNotFoundException ex) {
                //    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                //}
             
                frame.setContentPane(view);

                frame.pack();
                frame.setVisible(true);

            }
            
        });

    }
    
}


