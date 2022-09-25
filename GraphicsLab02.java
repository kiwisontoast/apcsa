// GraphicsLab02.java
// Student starting version of the GraphicsLab02 assignment.
// Resave this program as GraphicsLab0280 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.
// 80 Point Version. Your program has one class with three or more methods.
// 90 Point Version. Your program has one class with three or more methods.It has a second class with two or more methods.
// 100 Point Version. Your program has one class with three or more methods.It has a second class with two or more methods.
//                    It has a third class with one or more methods.



import java.awt.*;
import javax.swing.*;

public class GraphicsLab02
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		MyPanel m = new MyPanel();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

		j.setVisible(true); //allows the frame to be shown.

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

}

class MyPanel extends JPanel 
{
	MyPanel()
	{
		setSize(400, 600);
		setVisible(true); //it's like calling the repaint method.
	}
	
	public void paintComponent(Graphics g)
	{	
		TableAndBackground.background(g);	
	  TableAndBackground.table(g);
	  Vase.vase(g);
	  Flowers.stem(g);
	  Flowers.RedFlower(g);
	  Flowers.MagentaFlower(g);
	  Flowers.OrangeFlower(g);
	  


	  
	}

}

class Flowers   
{
	
	public static void RedFlower (Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(153,162,20,20);
		g.fillOval(170,162,20,20);
		g.fillOval(153,180,20,20);
		g.fillOval(170,180,20,20);

		g.setColor(Color.YELLOW);
		g.fillOval(161,171,20,20);
	}
	public static void MagentaFlower (Graphics g)
	{
		g.setColor(Color.MAGENTA);
		g.fillOval(193,162,20,20);
		g.fillOval(210,162,20,20);
		g.fillOval(193,180,20,20);
		g.fillOval(210,180,20,20);

		g.setColor(Color.YELLOW);
		g.fillOval(201,171,20,20);
	}
	public static void OrangeFlower (Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.fillOval(173,132,20,20);
		g.fillOval(190,132,20,20);
		g.fillOval(173,150,20,20);
		g.fillOval(190,150,20,20);

		g.setColor(Color.YELLOW);
		g.fillOval(181,141,20,20);
	}
	public static void stem(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.fillRect(181,161,20,40);

	}

}

class TableAndBackground
{
	public static void table (Graphics g)
	{
	g.setColor(Color.darkGray);
	g.fillRect(0,500,400,30);
	g.fillRect(0, 500, 40, 140);
	g.fillRect(350, 500, 50, 140);

	}
	public static void background(Graphics g)
	{
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 400, 600);
		g.setColor(Color.lightGray);
		g.fillRect(20, 20, 345, 460);

	}

}


class Vase
{
	public static void vase(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(170, 200, 40, 60);
		g.fillOval(105, 230, 170, 250);
		g.fillRect(160, 450, 60, 60);

	}
}



