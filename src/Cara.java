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
    ArrayList<RandomShape> randomShapes = new ArrayList<>();

    public Cara() {
        setPreferredSize(new Dimension(400,300)); // make panel 400 by 300 pixels
        // ...
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);     // clears the background
        // draw all shapes
        for(int i = 0; i < randomShapes.size(); i++){
            RandomShape shape = randomShapes.get(i);
            shape.draw(g);
        }
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
        randomShapes.clear();
        // create random shapes
        // ...
        int x = 400;
        int y = 300;
        for (int i = random.nextInt(30); i > -10; i--) {

            RandomAbstractFlag flag = new RandomAbstractFlag(x,y);
            randomShapes.add(flag);
        }
    }
 }
