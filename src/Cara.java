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
    RandomTree tree = new RandomTree(30, 40);
    //...
    ArrayList<RandomShape> randomShapes = new ArrayList<>();
    public Cara() {
        setPreferredSize(new Dimension(400,300)); // make panel 400 by 300 pixels
        // ...
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);     // clears the background
        // draw all shapes
        for(RandomShape shape : randomShapes){
            shape.draw(g);
        }
        g.fillOval(40, 20, 50, 50);
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
        randomShapes.add(tree);
    }
 }
