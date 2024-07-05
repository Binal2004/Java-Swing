import javax.swing.*;
import java.awt.*;

public class TabbedPaneExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This is panel 1"));
        tabbedPane.addTab("Tab 1", panel1);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("This is panel 2"));
        tabbedPane.addTab("Tab 2", panel2);

        frame.add(tabbedPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
