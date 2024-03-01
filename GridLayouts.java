import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;

public class GridLayouts extends JFrame {
    
    private JLabel[] labels = { new JLabel("This is Label1"),
        new JLabel("This is Label2"), new JLabel("This is Label3"), 
        new JLabel("This is Label4"), new JLabel("This is Label5"), 
        new JLabel("This is Label6") 
    };
private GridLayout gridLayout1 = new GridLayout(0,2,5,5);

public GridLayouts() {
    super("GridLayout Demo");
    setLayout(gridLayout1);
    for(int i = 0; i < labels.length; i++)
    add(labels[i]);
    
    JPanel tinyPanel = new JPanel(new GridLayout(0,2,5,5));
    setLayout(new GridLayout(0,2,5,5));

    tinyPanel.add(new JLabel("inside the panel! 0,0"));
    tinyPanel.add(new JLabel("inside the panel! 0,1"));
    tinyPanel.add(new JLabel("inside the panel! 1.0"));
    tinyPanel.add(new JLabel("inside the panel! 1,1"));

    tinyPanel.setBackground(Color.RED);
    this.add(tinyPanel);

    for (int i = 0; i < labels.length; i++) {
    add(labels[i]);
    }
}
}
