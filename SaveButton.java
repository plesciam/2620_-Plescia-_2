import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String string = "";

            if(event.getSource() == button1) {
                string = String.format("buttonField1 was pressed");
            }
            JOptionPane.showMessageDialog(null, string);
        }
    }
}
