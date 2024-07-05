import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SimpleTableExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Table data
        Object[][] data = {
                {"John", "Doe", 30},
                {"Jane", "Smith", 25},
                {"Tom", "Brown", 40}
        };

        // Table column names
        String[] columns = {"First Name", "Last Name", "Age"};

        // Creating a table model
        DefaultTableModel model = new DefaultTableModel(data, columns);

        // Creating a JTable with the model
        JTable table = new JTable(model);

        // Adding the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Adding the scroll pane to the frame
        frame.add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
