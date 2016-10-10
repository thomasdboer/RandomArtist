/**
 * RandomSquare
 *
 * @author Thomas den Boer, Thomas Willems
 */


import java.awt.Graphics;

class RandomOval extends RandomShape {
    protected int width;
    protected int height;
    protected boolean fill; //true: filled

    public RandomOval(int maxX, int maxY) {
        super(maxX, maxY);
        width = random.nextInt(maxX/4);
        height = random.nextInt(maxY/4);
        fill = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        if (fill)
            g.fillOval(x, y, width, height);
        else
            g.drawOval(x, y, width, height);
    }
}
