import javax.swing.*;
import java.awt.*;

public class JavaSwingAssignment extends JFrame {

    private final JPanel mainPanel = new JPanel();
    private final JLabel welcomeLabel = new JLabel(
            "<html>Welcome to Java Swing First Individual<br>"
            + "Assignment by Ibrahim Sorie Jalloh</html>");

    private final String[] messages = {
        "<html>Welcome to Java Swing First Individual<br>Assignment by Ibrahim Sorie Jalloh</html>",
        "<html>Text changed!<br>Java Swing is fun</html>",
        "<html>Event handling works<br>when a button is clicked</html>"
    };
    private final Color[] colors = {
        Color.WHITE, new Color(204, 229, 255), new Color(212, 237, 218),
        new Color(255, 243, 205), new Color(248, 215, 218)
    };

    private int messageIndex = 0;
    private int colorIndex = 0;

    public JavaSwingAssignment() {
        super("Java Swing Assignment");

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        mainPanel.setBackground(colors[0]);

        welcomeLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        welcomeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton changeTextBtn = new JButton("Change Text");
        changeTextBtn.setAlignmentX(Component.LEFT_ALIGNMENT);
        changeTextBtn.addActionListener(e -> {
            messageIndex = (messageIndex + 1) % messages.length;
            welcomeLabel.setText(messages[messageIndex]);
        });

        JButton changeBgBtn = new JButton("Change Background");
        changeBgBtn.setAlignmentX(Component.LEFT_ALIGNMENT);
        changeBgBtn.addActionListener(e -> {
            colorIndex = (colorIndex + 1) % colors.length;
            mainPanel.setBackground(colors[colorIndex]);
        });

        mainPanel.add(welcomeLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 25)));
        mainPanel.add(changeTextBtn);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        mainPanel.add(changeBgBtn);

        add(mainPanel);
        setSize(480, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JavaSwingAssignment().setVisible(true));
    }
}
