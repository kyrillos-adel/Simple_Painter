
package painter;

import java.awt.Graphics;


public class Eraser extends Pen{

    @Override
    public void draw(Graphics g) {
        g.clearRect(getX2(), getY2(), 15, 15);
    }

    @Override
    public Shape get() {
        return new Eraser();
    }
    
    
}
