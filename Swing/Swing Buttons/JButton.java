import javax.swing.*;

public class JButtonExample{
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello JButton");
        JButton button = new JButton("Click Me!");

        frame.add(button);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Explanation: JButton is a standard button that can trigger an action event.
