

import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("ComboBox Example");

        // Array of options for the JComboBox
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5"};

        // Create a JComboBox with options
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Set default selected item
        comboBox.setSelectedIndex(0);

        // Create a JButton to remove an item
        JButton removeButton = new JButton("Remove Item");
        removeButton.addActionListener(e -> {
            int selectedIndex = comboBox.getSelectedIndex();
            if (selectedIndex != -1) { // If an item is selected
                comboBox.removeItemAt(selectedIndex); // Remove the selected item
            }
        });

        // Create a JPanel to hold the JComboBox, JButton, and JLabel
        JPanel panel = new JPanel();
        panel.add(comboBox);
        panel.add(removeButton);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}


/*

import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("ComboBox Example");

        // Array of options for the JComboBox
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5"};

        // Create a JComboBox
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Set default selected item
        comboBox.setSelectedIndex(3);

        // Create a JLabel to display the selected item from the JComboBox
        JLabel label = new JLabel("Selected Option: " + options[0]);

        // Add an ActionListener to the JComboBox to update the JLabel when selection changes
        comboBox.addActionListener(e -> {
            String selectedOption = (String) comboBox.getSelectedItem();
            label.setText("Selected Option: " + selectedOption);
        });

        // Create a JPanel to hold the JComboBox and JLabel
        JPanel panel = new JPanel();
        panel.add(comboBox);
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}


*/