import javax.swing.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me!");

        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Explanation: JPanel is a generic container that can store a group of components.