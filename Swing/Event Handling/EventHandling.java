import javax.swing.*;
import java.awt.event.*;

public class BasicEventHandlingExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Basic Event Handling Example");
        
        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
