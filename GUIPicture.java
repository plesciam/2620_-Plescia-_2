import java.awt.FlowLayout;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUIPicture extends JFrame {
    
    private JLabel label1;
    private JButton loadButton;
    private MyPicture mypicture;
  

    public GUIPicture() throws IOException  
    {
        super("Label");
        this.setLayout(new FlowLayout());

        label1 = new JLabel("This is a label");
        add(label1);
       
        loadButton = new JButton("Exits");
        add(loadButton);

        mypicture = new MyPicture();
        add(mypicture);
     }

    public class GUIPicture2 extends JFrame {
    
        JLabel label1  = new JLabel("This is a label");
        JButton button1 = new JButton("Exit");
    
    
        public GUIPicture2() {
            super("Label");
    
            add(label1);
        }
     }
    }

