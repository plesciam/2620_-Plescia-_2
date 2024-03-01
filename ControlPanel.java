//import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ControlPanel extends JPanel {

    // public ControlPanel(GUIPicture guiPicture) {
    //     setLayout(new GridLayout(0,2,5,5)); 
        
    //     JButton button1 = new JButton();
        

    //     this.add(new LoadButton());
    //     this.add(new SaveButton());
    //     this.add(button1);
    
    
    // }
 public class LoadButton extends JFrame {       
    
        JLabel label1;
        JButton button1;

    public LoadButton() {
        super("JButton");
        setLayout(new FlowLayout());

        button1 = new JButton("Here's a Jlabel");
        button1.setToolTipText("This is label 1");
        this.add(button1);

        button1 = new JButton("Click here");
        this.add(button1);
    }
}
 public class SaveButton extends JFrame {
     
        private JLabel label1;
        private JButton button1;

    public SaveButton() {
        super("JButton");
        setLayout(new FlowLayout());

        label1 = new JLabel("Here's a Jlabel");
        label1.setToolTipText("This is label 1");
        this.add(label1);

        button1 = new JButton("Click here");
        this.add(button1);

        ButtonHandler buttonHandler = new ButtonHandler();
        button1.addActionListener(buttonHandler);
    }
}
    private class ButtonHandler implements ActionListener {

        private JButton button1;


        public void actionPerformed(ActionEvent event) {
            String string = "";

            if(event.getSource() == button1) {
                string = String.format("buttonField1 was pressed");
            }
                JOptionPane.showMessageDialog(null, string);
        }
    }
    }
