import java.io.IOException;

import javax.swing.JFrame;


public class PictureSpace  {

    public static void main(String[] args) throws IOException {
            
            GUIPicture guiPicture = new GUIPicture();
            
            guiPicture.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            guiPicture.setSize(300,300);
            
            guiPicture.setVisible(true);

        }
    }