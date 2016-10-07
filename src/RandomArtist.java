/** Main class for HA Random Artist 
  * can be used unchanged in most cases
  * 
  * @author kees
  */

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class RandomArtist {
    JFrame frame; 
    Cara cara; // panel that provides random painting 
    JButton button;
    
    RandomArtist() {
        // invokeLater: better way to create components
        // than the way shown so far
        SwingUtilities.invokeLater( new Runnable() {
            @Override
            public void run() {
                cara = new Cara();
                frame = new JFrame("Computer Assisted Random Artist");
                frame.add(cara, BorderLayout.CENTER);
                button = new JButton("regenerate");
                button.addActionListener(cara); // cara provides reaction on buttonclick
                frame.add(button, BorderLayout.SOUTH);
                frame.pack();
                cara.regenerate(); // can be done here since cara has a size!
                frame.setVisible(true);                
            }
        } );
    }
    
    public static void main(String[] arg) {
        new RandomArtist();    
    }
}













