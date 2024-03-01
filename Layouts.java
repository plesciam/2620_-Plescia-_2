import java.awt.*;
import javax.swing.*;

public class Layouts extends JFrame {
    
    private JLabel[] labels = { new JLabel("This is Label1"),
        new JLabel("This is Label2"), new JLabel("This is Label3"), 
        new JLabel("This is Label4"), new JLabel("This is Label5"), 
        new JLabel("This is Label6") 
    };
private GridLayout gridLayout1 = new GridLayout(0,2,5,5);

public Layouts() {
    super("GridLayout Demo");
    setLayout(gridLayout1);
    for(int i = 0; i < labels.length; i++)
    add(labels[i]);
    
    }
}
