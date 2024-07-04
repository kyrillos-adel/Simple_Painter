
package painter;

import java.awt.Graphics;


public class Line extends Shape {

    @Override
    public void draw(Graphics g) {
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }

   
    @Override
    public Shape get(){
    return new Line();
    }
}
