//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

   public Block()
	{
      color = Color.black;
      xPos = 100;
      yPos = 150;
      width = 10;
      height = 10;
	}

   public Block(int x, int y)
	{
      color = Color.black;
      width = 10;
      height = 10;
      xPos = x;
      yPos = y;
	}

   public Block(int x, int y, int w, int h)
	{
      color = Color.black;
      xPos = x;
      yPos = y;
      width = w;
      height = h;
	}

	public Block(int x, int y, int w, int h, Color c)
	{
      color = c;
      xPos = x;
      yPos = y;
      width = w;
      height = h;
	}

   public int getX() {return xPos;}
   public int getY() {return yPos;}
   public int getWidth() {return width;}
   public int getHeight() {return height;}
   public Color getColor() {return color;}

   public void setX(int newVal) {xPos = newVal;}
   public void setY(int newVal) {yPos = newVal;}
   public void setWidth(int newVal) {width = newVal;}
   public void setHeight(int newVal) {height = newVal;}

   public void setColor(Color col)
   {
      color = col;
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
      Block bl = (Block) obj;
		return bl.getWidth() == width && bl.getHeight() == height;
	}   

   //add the other get methods

   public String BlockToString()
   {
      String col = "java.awt.Color[r="+color.getRed()+",g="+color.getGreen()+",b="+color.getBlue()+"]";
      return ""+xPos+" "+yPos+" "+width+" "+height +" " + col;
   }
    
   public String toString()
   {
      // 100 150 10 10 java.awt.Color[r=0,g=0,b=0]
      String col = "java.awt.Color[r="+color.getRed()+",g="+color.getGreen()+",b="+color.getBlue()+"]";
      return ""+xPos+" "+yPos+" "+width+" "+height +" " + col;
   }

   //add a toString() method  - x , y , width, height, color
}