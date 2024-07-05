import javax.swing.*;

public class ListBoxExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("List Box Example");

        // Array of options for the JList
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5"};

        // Create a JList with options
        JList<String> listBox = new JList<>(options);

        // Set selection mode to single selection
        listBox.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Create a JScrollPane to hold the JList
        JScrollPane scrollPane = new JScrollPane(listBox);

        // Create a JPanel to hold the JScrollPane
        JPanel panel = new JPanel();
        panel.add(scrollPane);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
