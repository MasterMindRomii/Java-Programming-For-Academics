import javax.swing.*;

public class JToggleButtonExample{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JToggleButton togglebutton = new JToggleButton("Toggle Me!");

        frame.add(togglebutton);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Explanation: JToggleButton is a button that can be selected or deselected.