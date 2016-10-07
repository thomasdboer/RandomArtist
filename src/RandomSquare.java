/**
 * RandomSquare
 *
 * @author Thomas den Boer, Thomas Willems
 */

import java.awt.Graphics;

class RandomSquare extends RandomShape {
    protected int radius;
    protected boolean fill; //true: filled

    public RandomSquare(int maxX, int maxY) {
        super(maxX, maxY);
        radius = random.nextInt(maxX/4);
        fill = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        if (fill)
            g.fillRect(x, y, radius, radius);
        else
            g.drawRect(x, y, radius, radius);
    }
}
