import java.awt.*;
import javax.swing.*;

public class Application extends JFrame {

    // Constructor
    public Application(){
        initUI();
    }

    // Initializes the user interface by adding JPanel to JFrame, setting size, title, and default close operation
    private void initUI(){

        // Adds Board component to the center of the JFrame container
        add(new Board(60,20,20));

        // Width, height, and title
        setSize(500, 500);
        setTitle("Memory Game");
        
        // Specifies that the application will close on exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sets frame in the middle of the screen
        setLocationRelativeTo(null);
    }

    // ** MAIN METHOD ** //
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            // Creates Application (extends JFrame) and sets to visible
            Application ex = new Application();
            ex.setVisible(true);
        });
    }
}
