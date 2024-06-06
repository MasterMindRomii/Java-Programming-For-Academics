import javax.swing.*;

public class JDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JDialog Example");
        JDialog dialog = new JDialog(frame, "Dialog", true);
        dialog.setSize(200, 100);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Close");
        button.addActionListener(e -> dialog.dispose());
        dialog.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        dialog.setVisible(true);
    }
}
