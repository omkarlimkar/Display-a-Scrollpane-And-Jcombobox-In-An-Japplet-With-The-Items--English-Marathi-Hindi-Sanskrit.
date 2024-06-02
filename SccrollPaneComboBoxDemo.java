import javax.swing.*;
import java.awt.*;

public class ScrollPaneComboBoxDemo extends JApplet {
    public void init() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }

    private void createGUI() {
        setLayout(new BorderLayout());

        // Create JComboBox with items
        String[] languages = {"English", "Marathi", "Hindi", "Sanskrit"};
        JComboBox<String> languageComboBox = new JComboBox<>(languages);

        // Create JScrollPane and add JComboBox to it
        JScrollPane scrollPane = new JScrollPane(languageComboBox);

        // Add JScrollPane to JApplet
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Create JFrame to test the applet
        JFrame frame = new JFrame("ScrollPane and JComboBox Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an instance of the applet
        JApplet applet = new ScrollPaneComboBoxDemo();
        applet.init();

        // Add the applet to the frame
        frame.getContentPane().add(applet);

        // Set frame size and visibility
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}