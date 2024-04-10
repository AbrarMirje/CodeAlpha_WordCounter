package Swing;

import javax.swing.*;
import java.awt.event.*;

public class JavaSwing extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton countButton;
    private JLabel countLabel;

    public JavaSwing() {
        textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        countButton = new JButton("Count Words");

        countLabel = new JLabel("Word count: 0");

        JPanel panel = new JPanel();
        panel.add(scrollPane);
        panel.add(countButton);
        panel.add(countLabel);
        add(panel);

        countButton.addActionListener(this);

        // Set frame properties
        setTitle("Word Count Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        String[] words = text.split("\\s+");
        countLabel.setText("Word count: " + words.length);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JavaSwing());
    }
}
