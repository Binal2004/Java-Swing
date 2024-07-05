import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Radio Button Example");

        // Create radio buttons
        JRadioButton radioBtn1 = new JRadioButton("Option 1");
        JRadioButton radioBtn2 = new JRadioButton("Option 2");
        JRadioButton radioBtn3 = new JRadioButton("Option 3");

        // Create a button group and add radio buttons to the group
        ButtonGroup group = new ButtonGroup();
        group.add(radioBtn1);
        group.add(radioBtn2);
        group.add(radioBtn3);

        // Create a label to display selected option
        JLabel label = new JLabel("Selected option: None");

        // Add an action listener to the radio buttons
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioBtn1.isSelected()) {
                    label.setText("Selected option: Option 1");
                } else if (radioBtn2.isSelected()) {
                    label.setText("Selected option: Option 2");
                } else if (radioBtn3.isSelected()) {
                    label.setText("Selected option: Option 3");
                }
            }
        };
        radioBtn1.addActionListener(listener);
        radioBtn2.addActionListener(listener);
        radioBtn3.addActionListener(listener);

        // Set layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add radio buttons and label to the frame
        frame.add(radioBtn1);
        frame.add(radioBtn2);
        frame.add(radioBtn3);
        frame.add(label);

        // Set frame size, default close operation, and visibility
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
