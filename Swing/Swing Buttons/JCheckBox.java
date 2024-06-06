import javax.swing.*;

public class JCheckBoxExample{
    public static void main(String[] args){
        JFrame frame = new JFrame("JCheckBox Example");
        JCheckBox checkbox = new JCheckBox("Check Me!");

        frame.add(checkbox);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Explanation: JCheckBox is a component that can be in either an on (true) or off (false) state.