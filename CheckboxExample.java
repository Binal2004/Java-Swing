import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckboxExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Checkbox Example");

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("Enable Feature");

        // Create a label to display the checkbox state
        JLabel label = new JLabel("Feature is disabled");

        // Add an action listener to the checkbox
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    label.setText("Feature is enabled");
					System.out.println("selected");
                } else {
                    label.setText("Feature is disabled");
                }
            }
        });

        // Set layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add checkbox and label to the frame
        frame.add(checkBox);
        frame.add(label);

        // Set frame size, default close operation, and visibility
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
