import javax.swing.*;  // Import Swing library
import java.awt.event.*;  // For handling events

public class SimpleSwingExample {
    public static void main(String[] args) {
        // 1️⃣ Create a JFrame (main window)
        JFrame frame = new JFrame("My First Swing App");

        // 2️⃣ Create a JButton (button)
        JButton button = new JButton("Click Me");

        // 3️⃣ Set button position and size
        button.setBounds(100, 100, 150, 40);

        // 4️⃣ Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // 5️⃣ Add button to frame
        frame.add(button);

        // 6️⃣ Set frame properties
        frame.setSize(400, 300);      // Width x Height
        frame.setLayout(null);       // No layout manager
        frame.setVisible(true);      // Make window visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
