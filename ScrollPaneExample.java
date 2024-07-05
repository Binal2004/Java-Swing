	
		
import javax.swing.*;
import java.awt.*;

public class ScrollPaneExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Scroll Pane Example");

        // Create a JTextArea
        JTextArea textArea = new JTextArea(100, 20);
        textArea.setText("This is a JTextArea inside a JScrollPane.\n"
                + "You can use this to display a large amount of text.\n"
                + "You can also type text here.");

        // Create a JScrollPane and add the JTextArea to it
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the JScrollPane to the frame
        frame.add(scrollPane);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
