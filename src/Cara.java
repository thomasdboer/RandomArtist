/**
 * starter file for Random Artist homework assignment
 * 
 * code has to be added by you 
 * 
 * @author huub & kees
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Cara extends JPanel implements ActionListener {
    Random random = new Random();
    //...
    
    public Cara() {
        setPreferredSize(new Dimension(400,300)); // make panel 400 by 300 pixels
        // ... 
    }

    @Override
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g);     // clears the background
        // draw all shapes       
        // ...
    }

    /**
     * redraws the Cara JPanel, when the button is pressed. 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        regenerate();
        repaint();
    }

    public void regenerate() {
        // clear the shapes list
        //...
        
        // create random shapes 
        // ... 
    }
 }
