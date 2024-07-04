
package painter;

import java.awt.Graphics;


public class Rectangle extends Shape{
    
    @Override
    public void draw(Graphics g){
        if(isFilled()==false){
    g.drawRect(getX1(), getY1(),Math.abs(getX2()-getX1()), Math.abs(getY2()-getY1()));
        }else{
        g.fillRect(getX1(), getY1(),Math.abs(getX2()-getX1()), Math.abs(getY2()-getY1()));
        }
    }

    
   @Override
    public Shape get(){
    return new Rectangle();
    }
}


