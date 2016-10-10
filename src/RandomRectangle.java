/**
 * RandomSquare
 *
 * @author Thomas den Boer, Thomas Willems
 */


import java.awt.Graphics;

class RandomRectangle extends RandomShape {
    protected int width;
    protected int height;
    protected boolean fill; //true: filled

    public RandomRectangle(int maxX, int maxY) {
        super(maxX, maxY);
        width = random.nextInt(maxX/4);
        height = random.nextInt(maxY/4);
        fill = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        if (fill)
            g.fillRect(x, y, width, height);
        else
            g.drawRect(x, y, width, height);
    }
}
