import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoadButton extends JFrame {


    public LoadButton() {
        super("Events");

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonHandler());
        
        add(exitButton);
    }
    private class ExitButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
        
    }

}






