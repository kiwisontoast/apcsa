import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
   private int xSpeed;
   private int ySpeed;

   public Ball()
   {
      super(200, 200, 10, 10);
      xSpeed = 3;
      ySpeed = 1;
   }

	//add the other Ball constructors
   public Ball(int x, int y)
   {
      super(x, y, 10, 10);
      xSpeed = 3;
      ySpeed = 1;
   }
	   
   public Ball(int x, int y, int w, int h)
   {
      super(x, y, w, h);
      xSpeed = 3;
      ySpeed = 1;
   }
   
   public Ball(int x, int y, int w, int h, Color col)
   {
      super(x, y, w, h, col);
      xSpeed = 3;
      ySpeed = 1;
   }
   
   public Ball(int x, int y, int w, int h, Color col, int xS, int yS)
   {
      super(x, y, w, h, col);
      xSpeed = xS;
      ySpeed = yS;
   }
   //add the set methods
   public void setXSpeed(int xS)
   {
      xSpeed = xS;   
   }
   
   public void setYSpeed(int yS)
   {
      ySpeed = yS;
   }
   
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
      draw(window, Color.WHITE);
      setX(getX() + xSpeed);
   	//setY
      setY(getY() + ySpeed);
   	//draw the ball at its new location
      draw(window, getColor());
   }
   
   public boolean equals(Object obj)
   {
      if(super.equals(obj))
      {Ball other = (Ball)obj;
         if(this.getXSpeed() == other.getXSpeed())
         {
            if(this.getYSpeed() == other.getYSpeed())
               return true;
         }
      }
      return false;
   }   

   //add the get methods
   public int getXSpeed()
   {
      return xSpeed;
   }
   
   public int getYSpeed()
   {
      return ySpeed;
   }
   //add a toString() method
   
   public String toString()
   {
      return "" + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed() + " " + getYSpeed();
   }
}