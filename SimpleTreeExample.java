import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class SimpleTreeExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Creating child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        // Adding child nodes to the root node
        root.add(child1);
        root.add(child2);

        // Creating the tree with the root node
        JTree tree = new JTree(root);

        // Adding the tree to a scroll pane
        JScrollPane scrollPane = new JScrollPane(tree);

        // Adding the scroll pane to the frame
        frame.add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
