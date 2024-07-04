
package painter;

import java.awt.Graphics;


public class Oval extends Shape{
 
    @Override
    public void draw(Graphics g){
        if(isFilled()==false){
    g.drawOval(getX1(), getY1(),Math.abs(getX2()-getX1()), Math.abs(getY2()-getY1()));
        }else{
    g.fillOval(getX1(), getY1(),Math.abs(getX2()-getX1()), Math.abs(getY2()-getY1()));

        }
    }
  
    
    @Override
    public Shape get(){
    return new Oval();
    }
}
