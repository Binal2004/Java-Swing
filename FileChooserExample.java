import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileChooserExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("File Chooser Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JButton button = new JButton("Choose File");
        button.setBounds(50, 50, 150, 30);
        frame.add(button);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 100, 300, 50);
        frame.add(textArea);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
			
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
                    textArea.setText(selectedFile);
                }
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
