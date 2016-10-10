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
        // ...

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

        
        for (int i = random.nextInt(30); i > -10; i--) {
            RandomTree tree = new RandomTree(400,300);
            randomShapes.add(tree);
            RandomSquare square = new RandomSquare(400,300);
            randomShapes.add(square);
            RandomCircle circle = new RandomCircle(400,300);
            randomShapes.add(circle);
            RandomOval oval = new RandomOval(400,300);
            randomShapes.add(oval);
            RandomRectangle rectangle = new RandomRectangle(400,300);
            randomShapes.add(rectangle);
        }
    }
 }
