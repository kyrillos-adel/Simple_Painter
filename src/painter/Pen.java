
package painter;

import java.awt.Graphics;


public class Pen extends Shape{

    @Override
    public void draw(Graphics g) {
        g.fillOval(getX2(), getY2(), 15, 15);
    }

    @Override
    public Shape get() {
        return new Pen();
    }
    
    
    
}
