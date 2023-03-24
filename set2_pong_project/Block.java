//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block
{
	protected int xPos;
	protected int yPos;
	protected int width;
	protected int height;

	protected Color color;

	public Block()
	{
      xPos=100;
      yPos=150;
      width=10;
      height=10;
      color=Color.BLACK;  
	}

	//add other Block constructors - x , y , width, height, color	
   public Block(int x, int y){
      xPos=x;
      yPos=y;
   }
   public Block(int x, int y,int w){
      xPos=x;
      yPos=y;
      width=w;
   }
   public Block(int x,int y, int w, int h)
	{
      xPos=x;
      yPos=y;
      width=w;
      height=h;
      color=Color.BLACK;  
	}
   public Block(int x,int y, int w, int h, Color col)
	{
      xPos=x;
      yPos=y;
      width=w;
      height=h;
      color=col;  
	}
	
   //add the other set methods
   

   public void setColor(Color col)
   {
      color=col;
   }
   public void setX(int x)
   {
      xPos=x;
   }
   public void setY(int y)
   {
      yPos=y;
   }
   public void setWidth(int w)
   {
      width=w;
   }
   public void setHeight(int h)
   {
      height=h;
   }
  

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		if((xPos==((Block) obj).getX())&&(yPos==((Block) obj).getY())){
            return true;
      }
      return false;
	}   

   //add the other get methods
   public Color getColor()
   {
      return color;
   }
   public int getX()
   {
      return xPos;
   }
   public int getY()
   {
      return yPos;
   }
   public int getWidth()
   {
      return width;
   }
   public int getHeight()
   {
      return height;
   }

   //add a toString() method  - x , y , width, height, color
   public String toString()
   {
      return ""+xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}