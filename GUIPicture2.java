import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUIPicture2 extends JFrame {
    
    JLabel label1  = new JLabel("This is a label");
    JButton button1 = new JButton("Exit");


    public GUIPicture2() {
        super("Label");

        add(label1);
    }


}
