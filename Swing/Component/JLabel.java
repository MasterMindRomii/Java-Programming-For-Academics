import javax.swing.*;

public class JLableExample{
    public static void main(){
        JFrame frame = new JFrame("Helllo Java..");
        JLabel label = new JLabel("JLable Example is here...");

        frame.add(label);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Explanation: JLabel is used to display a short text string or an image, or both.