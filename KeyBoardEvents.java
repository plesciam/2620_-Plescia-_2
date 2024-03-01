import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class KeyBoardEvents extends JFrame implements KeyListener {
    public KeyBoardEvents() {
    super("keyboard");

    Object textArea = new JTextArea(10,15);
    textArea = setText("Press any key");
    ((Component) textArea).setEnabled(false);
    ((JTextComponent) textArea).setDisabledTextColor(Color.BLACK);

    addKeyListener(this);
}
    private Object setText(String string) {
        return string;
    }
    public void keyTyped(KeyEvent e) {
    String.format("Key Typed %c", e.getKeyChar());
    setLines2And3(e);
    }
    private void setLines2And3(KeyEvent e) {
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
       
    }
    @Override
    public void keyReleased(KeyEvent e) {
    
    }
}