//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x, y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c, int sx, int sy)
	{
		super(x, y, w, h, c);
		xSpeed = sx;
		ySpeed = sy;
	}

	public int getXSpeed() {return xSpeed;}
	public int getYSpeed() {return ySpeed;}
	public void setXSpeed(int newSpeed) {xSpeed = newSpeed;}
	public void setYSpeed(int newSpeed) {ySpeed = newSpeed;}

	// add the other Ball constructors

	// add the set methods

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		this.draw(window, Color.WHITE);
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);

		// draw the ball at its new location
		this.draw(window);
	}

	public boolean equals(Object obj) {
		Ball b = (Ball) obj;
		return super.equals((Block) obj) && b.xSpeed == xSpeed && b.ySpeed == ySpeed;
	}

	public String toString()
	{
		return super.toString() + " "+xSpeed + " "+ySpeed;
	}
}