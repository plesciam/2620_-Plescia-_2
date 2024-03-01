import javax.swing.JFrame;
import java.awt.GridLayout;

public class Canvas extends JFrame{
    
    private Canvas graphicsPanel;

    public Canvas() {
        super("Graphics");
        this.setLayout(new GridLayout(1,1));

        graphicsPanel = new Canvas();
        this.add(graphicsPanel);
    }
}
