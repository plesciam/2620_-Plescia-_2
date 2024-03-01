import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.EventObject;
import javax.swing.*;

public class Field extends JFrame {

    private JPanel inputPanel;
    private JTextField textField1;
    private JTextField textField2;

public Field() {
    super("ActionListener");
    setLayout(new FlowLayout());

    inputPanel = new JPanel(new GridLayout(2,1,5,5));


    textField1 = new JTextField("Name here", 15);
    textField2 = new JTextField("Name here", 15);
    inputPanel.add(textField1);
    inputPanel.add(textField2);
    add(inputPanel);

    TextFieldHandler handler = new TextFieldHandler();
    textField1.addActionListener(handler);
    textField1.addFocusListener(handler);
    textField2.addFocusListener(handler);
    textField2.addFocusListener(handler);
}
private class TextFieldHandler implements ActionListener, FocusListener {

    private EventObject event;
    public TextFieldHandler() {
    }
    public void actionPerformed(ActionEvent event) {

        String string = String.format("%s", event.getActionCommand());

        JOptionPane.showMessageDialog(null,string);
    }
    @Override
    public void focusGained(FocusEvent e) {
        ((JTextField) event.getSource()).setText("");
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (((JTextField) event.getSource()).getText().equals("")) 
    {
        ((JTextField) event.getSource()).setText("Enter name");
    }
    }
    
}
}    
