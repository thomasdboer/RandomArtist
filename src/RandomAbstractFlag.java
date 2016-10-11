/**
 * RandomTree - part of HA RandomArtist
 * a little bit more advanced example of a shape
 *
 * @author huub
 */

import java.awt.Graphics;
import java.awt.Color;

class RandomAbstractFlag extends RandomShape {
    private int poleHeight;
    private int poleWidth;
    private int flagWidth;
    private int flagHeight;
    private boolean fill; // true: filled

    public RandomAbstractFlag(int maxX, int maxY) {
        super(maxX, maxY);
        flagHeight = maxY/(random.nextInt(4)+1);
        flagWidth = flagHeight * 2;
        poleHeight = flagHeight * 4;
        poleWidth = flagHeight/3 + 1;
        fill = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        // draw flag
        g.setColor(color);
        if (fill) {
            g.fillRect((2*x), y, flagWidth, flagHeight);
        } else {
            g.drawRect((2*x), y, flagWidth, flagHeight);
        }

        // draw pole
        g.setColor(color);
        int xx = x + flagHeight - poleWidth/2;
        int yy = y + 2*flagHeight;
        if (fill) {
            g.fillRect(xx, yy, poleWidth, poleHeight);
        } else {
            g.fillRect(xx, yy, poleWidth, poleHeight);
        }
    }
}
