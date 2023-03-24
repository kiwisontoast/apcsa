
import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
      super(10,10,10,10);
      speed = 5;
   }

   public Paddle(int x, int y)
   {
      super(x,y,10,10);
      speed = 5;
   }

   public Paddle(int x, int y, int s)
   {
      super(x, y, 10, 10);
      speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, int s)
   {
      super(x,y,w,h);
      speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, Color col, int s)
   {
      super(x,y,w,h,col);
      speed = s;
   }
   
   public void setSpeed(int s)
   {
      speed = s;
   }
   
   //add the other Paddle constructors

   public void moveUpAndDraw(Graphics window)
   {
      draw(window,Color.WHITE);
      setY(getY()-speed);
      draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
      draw(window,Color.WHITE);
      setY(getY()+speed);
      draw(window);
   }

   //add get methods
   
   public boolean equals(Object obj)
   {
      if(super.equals(obj))
      {
         Paddle other = (Paddle)obj;
         if(this.getSpeed() == other.getSpeed())
         {
            return true;
         }
      }
      return false;
   }
   
   public int getSpeed()
   {
      return speed;
   }
   //add a toString() method
   public String toString()
   {
      return " " + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + speed;
   }
}