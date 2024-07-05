import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
		
        // Create a JFrame
        JFrame frame = new JFrame("FlowLayout Example");

        // Set the layout manager to FlowLayout
        //frame.setLayout(new FlowLayout());
		//frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

		// create a button object 
        JButton btn = new JButton("Button4");

        // Create and add buttons to the frame
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
		frame.add(btn);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the behavior of the frame when the close button is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
