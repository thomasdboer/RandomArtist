/**
 * RandomSquare
 *
 * @author Thomas den Boer, Thomas Willems
 */

import java.awt.Graphics;

class RandomTriangle extends RandomShape {
    protected int[] arrayX = new int[3];
    protected int[] arrayY = new int[3];
    protected boolean fill; //true: filled

    public RandomTriangle(int maxX, int maxY) {
        super(maxX, maxY);
        for(int k = 0; k < 3; k++) {
            arrayX[k] = random.nextInt(maxX);
            arrayY[k] = random.nextInt(maxY);
        }
        fill = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        if (fill)
            g.fillPolygon(arrayX, arrayY, 3);
        else
            g.drawPolygon(arrayX, arrayY, 3);
    }
}
