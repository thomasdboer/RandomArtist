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
        for(RandomShape shape : randomShapes){
            shape.draw(g);
        }
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
        randomShapes.clear();
        // create random shapes
        // ...
        RandomTree tree = new RandomTree(300, 400);
        RandomSquare square = new RandomSquare(200, 100);
        RandomCircle circle = new RandomCircle(300,400);
        RandomOval oval = new RandomOval (300,400);
        RandomRectangle rectangle = new RandomRectangle (300,400);
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        while(i < random.nextInt(20)) {
            randomShapes.add(tree);
            i++;
        }
        while(j < random.nextInt(20)){
            randomShapes.add(square);
            j++;
        }
        while(k < random.nextInt(20)) {
            randomShapes.add(circle);
            k++;
        }
        while(l < random.nextInt(20)) {
            randomShapes.add(oval);
            l++;
        }
        while(m < random.nextInt(20)) {
            randomShapes.add(rectangle);
            m++;
        }
    }
 }
