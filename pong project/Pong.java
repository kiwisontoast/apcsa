//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;

	public boolean withinRange(Paddle pad, Ball b)
	{
		double midPadX = pad.getX() + pad.getWidth()/2.0;
		double midPadY = pad.getY() + pad.getHeight()/2.0;

		double midBallX = ball.getX() + ball.getWidth()/2.0;
		double midBallY = ball.getY() + ball.getHeight()/2.0;

		return (Math.abs(midPadY - midBallY) < (b.getHeight() + pad.getHeight())/2.0 &&
			Math.abs(midPadX - midBallX) < (b.getWidth() + pad.getWidth())/2.0);
	}

	public Pong()
	{
		//set up all variables related to the game


		ball = new Ball(50, 50);
		
		
		//instantiate a left Paddle
		leftPaddle = new Paddle(30, 70, 5, 20, 100);
		rightPaddle = new Paddle(750, 70, 5, 20, 100);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			// ball.setX(50);
			// ball.setY(50);
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=20 && ball.getY()<=570))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		if(keys[0] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
			//move left paddle up and draw it on the window
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}



		//see if the ball hits the left paddle
		
		if (withinRange(leftPaddle, ball))
		{
			ball.setXSpeed(Math.abs(ball.getXSpeed()));
		}

		if (withinRange(rightPaddle, ball))
		{
			ball.setXSpeed(-Math.abs(ball.getXSpeed()));
		}
		
		//see if the ball hits the right paddle
		
		
		


		//see if the paddles need to be moved















		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}