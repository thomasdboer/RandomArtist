/**
 * RandomTree - part of HA RandomArtist
 * a little bit more advanced example of a shape
 *
 * @author huub
 */

import java.awt.Graphics;
import java.awt.Color;

class RandomTree extends RandomShape {
    private int crownRadius;   
    private int trunkHeight;
    private int trunkWidth;
    private boolean fill; // true: filled
    
    public RandomTree(int maxX, int maxY) {
        super(maxX, maxY);

        crownRadius = random.nextInt(maxX/4); // or something more sophisticated
        trunkHeight = random.nextInt((maxY-2*crownRadius)/2);
        trunkWidth = crownRadius/3 + 1;
        fill = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        // draw crown
        g.setColor(color);
        if (fill) {
            // more general way to draw an oval
            g.fillArc(x, y, 2*crownRadius, 2*crownRadius, 0, 360);
        } else { 
            g.drawArc(x, y, 2*crownRadius, 2*crownRadius, 0, 360);
        }
        
        // draw trunk
        g.setColor(color);
        int xx = x + crownRadius - trunkWidth/2;
        int yy = y + 2*crownRadius;
        if (fill) {
            g.fillRect(xx, yy, trunkWidth, trunkHeight);
        } else { 
            g.fillRect(xx, yy, trunkWidth, trunkHeight);
        }
    }    
}
