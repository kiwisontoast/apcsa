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
    public void paint(Graphics g){
        drawSquare(g, 0, 100, 200);
    }
    public void drawSquare(Graphics g, int x, int y, int size)
    { 
        g.fillRect(x, y, size, size);

        g.fillRect(1000 - x - size, 100+size+y, size, size);


        int newsize = (int) (size*.8);

        if (1000 > x+size+10+newsize  && newsize > 4)
            drawSquare(g, x+size+10, y+size-newsize, newsize);
    }
    

}
