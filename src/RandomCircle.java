/**
 * RandomCircle -- part of HA RandomArtist
 * example of a very simple RandomShape 
 * @author huub
 */

import java.awt.Graphics;

/**
 *
 * @author huub
 */
class RandomCircle extends RandomShape {
    protected int radius;
    protected boolean fill; //true: filled
    
    public RandomCircle(int maxX, int maxY) {
        super(maxX, maxY);
        radius = random.nextInt(maxX/4);
        fill = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        if (fill)
            g.fillArc(x, y, radius, radius,0, 360);
        else 
            g.drawArc(x, y, radius, radius,0, 360);
    }    
}
