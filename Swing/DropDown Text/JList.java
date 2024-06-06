import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        String[] data = {"Item1","Item2","Item3","Item4"};
        JList<String> list = new JList<>(data);

        frame.add(new JScrollPane(list));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Explanation: JList is a component that displays a list of objects and allows the user to select one or more items