import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageT extends JFrame {
    
    private JLabel label1;
    private JLabel label2;
    private JButton button1;

    public ImageT() throws IOException {
        super("JLabel");
        setLayout(new FlowLayout());

        label1 = new JLabel("Heres an image");
        label1.setToolTipText("This is label1");
     

        Image img = null;
        img = ImageIO.read(new File("image.jpg"));
        label2 = new JLabel(new ImageIcon(img));

        button1 = new JButton("Exit");

        add(label1);
        add(button1);
        add(label2);
    }
}
