import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPicture extends JPanel {
    
    public MyPicture() {


    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        System.out.println("Hello");


        g.setColor(Color.BLUE);
        g.drawRect(100, 100, 100, 100);
        g.setColor(Color.RED);
        g.draw3DRect(50,50,50,50, false);
        g.setColor(Color.BLACK);
        g.fillRect(50,100,50,100);

    }
}
