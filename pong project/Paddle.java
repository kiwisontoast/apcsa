//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }

   public Paddle(int x, int y) {
		super(x, y);
		speed = 5;
	}

	public Paddle(int x, int y, int s) {
		super(x, y);
		speed = s;
	}

	public Paddle(int x, int y, int s, int w, int h) {
		super(x, y, w, h);
		speed = s;
	}

	public Paddle(int x, int y, int w, int h, Color c, int s)
	{
		super(x, y, w, h, c);
		speed = s;
	}


   //add the other Paddle constructors

   public void moveUpAndDraw(Graphics window)
   {
	this.draw(window, Color.WHITE);
	setY(getY() + speed);

	// draw the ball at its new location
	this.draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	this.draw(window, Color.WHITE);
	setY(getY() - speed);

	// draw the ball at its new location
	this.draw(window);
   }

   //add get methods
   
   
   //add a toString() method
}