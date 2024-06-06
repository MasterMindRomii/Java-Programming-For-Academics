import javax.swing.*;

public class ImageIConExample{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hello ImageIcon...");
        ImageIcon icon = new ImageIcon("path");
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JLabel.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

// Explanation: ImageIcon is used to create an image icon from an image file