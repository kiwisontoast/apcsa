// // GraphicsLab1
// // The AWT Graphics Program
// // This is the student, starting version of GraphicsLab1


// import java.awt.*;
// import javax.swing.*;

// public class GraphicsLab1
// {
// 	public static void main(String...args)
// 	{
// 		JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
// 		MyPanel m = new MyPanel();
// 		j.setSize(m.getSize());
// 		j.add(m); //adds the panel to the frame so that the picture will be drawn
// 			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

// 		j.setVisible(true); //allows the frame to be shown.

// 		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
// 	}

// }

// class MyPanel extends JPanel 
// {
// 	MyPanel()
// 	{
// 		setSize(800, 600);
// 		setVisible(true); //it's like calling the repaint method.
// 	}
	
// 	public void paintComponent(Graphics g)
// 	{
// 		// DRAW CUBE
// 		g.drawRect(20,20,100,100);
// 		g.drawRect(50,50,100,100);

// 		g.drawLine(120, 120, 150, 150);
// 		g.drawLine(20, 20, 50, 50);
// 		g.drawLine(20, 120, 50, 150);
// 		g.drawLine(120, 20, 150, 50);

// 		// DRAW SPHERE
// 		g.drawArc(35, 35, 100, 100, 0, 360);
// 		g.drawOval(35, 40, 100, 90);
// 		g.drawOval(35, 45, 100, 80);
// 		g.drawOval(35, 50, 100, 70);
// 		g.drawOval(35, 55, 100, 60);
// 		g.drawOval(35, 60, 100, 50);
// 		g.drawOval(35, 65, 100, 40);
// 		g.drawOval(35, 70, 100, 30);
// 		g.drawOval(35, 75, 100, 20);
// 		g.drawOval(35, 80, 100, 10);

// 		g.drawOval(40, 35, 90, 100);
// 		g.drawOval(45, 35, 80, 100);
// 		g.drawOval(50, 35, 70, 100);
// 		g.drawOval(55, 35, 60, 100);
// 		g.drawOval(60, 35, 50, 100);
// 		g.drawOval(65, 35, 40, 100);
// 		g.drawOval(70, 35, 30, 100);
// 		g.drawOval(75, 35, 20, 100);
// 		g.drawOval(80, 35, 10, 100);

// 		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

// 		g.drawArc(300, 100, 100, 100, 0, 360);
// 		g.drawLine(350, 100,310, 180);
// 		g.drawLine(350, 100,390, 180);
// 		g.drawLine(310, 180,390, 180);
// 		g.drawArc(325, 130, 50, 50, 0, 360);


// 		// DRAW APCS
// 		//DRAW A
// 		g.fillRect(300,300,30,10);
// 		g.fillRect(300,300,10,80);
// 		g.fillRect(300,340,30,10);
// 		g.fillRect(330,300,10,80);

// 		//DRAW P
// 		g.fillRect(350,300,10,80);
// 		g.fillRect(350,300,30,10);
// 		g.fillRect(350,340,30,10);
// 		g.fillRect(380,300,10,50);

// 		//DRAW C
// 		g.fillRect(400,300,10,80);
// 		g.fillRect(400,300,30,10);
// 		g.fillRect(400,370,30,10);

// 		//DRAW S
// 		g.fillRect(450,300,10,40);
// 		g.fillRect(450,300,30,10);
// 		g.fillRect(450,370,30,10);
// 		g.fillRect(470,340,10,40);
// 		g.fillRect(450,335,30,10);


// 		// DRAW PACMEN FLOWER
// 		g.fillArc(200,218,50,50,120,300);
// 		g.fillArc(230,250,50,50,30,300);
// 		g.fillArc(170,250,50,50,210,300);
// 		g.fillArc(200,278,50,50,300,300);
// 	}
// }

