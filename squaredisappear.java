// Lab32ast.java
import java.awt.*;
import java.awt.event.*;
public class squaredisappear
{
public static void main(String args[])
{
Windows win = new Windows();
win.setSize(1000,750);
win.addWindowListener(new WindowAdapter() {public void
windowClosing(WindowEvent e) {System.exit(0);}});
win.show();
}
}
class Windows extends Frame
{
public void paint(Graphics g)
drawSquare(g, 0, 100, 200);
}
public void drawSquare(Graphics g, int x, int y, int size)
{ }
}
