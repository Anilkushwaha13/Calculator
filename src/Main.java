
import LayoutText.FrontPage;


import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
         Frame frame = new FrontPage();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        frame.setResizable(false);

        // Calculate window position to center on screen
        int x = (screenWidth - frame.getWidth()) / 2;
        int y = (screenHeight - frame.getHeight()) / 2;

        // Set window position
        frame.setLocation(x, y);




    }
    }
