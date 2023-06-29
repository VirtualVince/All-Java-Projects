import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MathGUI implements ActionListener {
    private JFrame frame;
    private JTextField inputField;
    private JLabel outputLabel;

    public MathGUI() {
        frame = new JFrame("Math Methods");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        JLabel inputLabel = new JLabel("Enter a number:");
        inputField = new JTextField(10);
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        JPanel buttonPanel = new JPanel();
        JButton sqrtButton = new JButton("Square Root");
        sqrtButton.addActionListener(this);
        JButton absButton = new JButton("Absolute Value");
        absButton.addActionListener(this);
        JButton powButton = new JButton("Power");
        powButton.addActionListener(this);
        JButton sinButton = new JButton("Sine");
        sinButton.addActionListener(this);
        JButton logButton = new JButton("Logarithm");
        logButton.addActionListener(this);
        buttonPanel.add(sqrtButton);
        buttonPanel.add(absButton);
        buttonPanel.add(powButton);
        buttonPanel.add(sinButton);
        buttonPanel.add(logButton);

        outputLabel = new JLabel();

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(outputLabel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double input = Double.parseDouble(inputField.getText());
            if (e.getActionCommand().equals("Square Root")) {
                double result = Math.sqrt(input);
                outputLabel.setText("Square root: " + result);
            } else if (e.getActionCommand().equals("Absolute Value")) {
                double result = Math.abs(input);
                outputLabel.setText("Absolute value: " + result);
            } else if (e.getActionCommand().equals("Power")) {
                double result = Math.pow(input, 2);
                outputLabel.setText("Power: " + result);
            } else if (e.getActionCommand().equals("Sine")) {
                double result = Math.sin(input);
                outputLabel.setText("Sine: " + result);
            } else if (e.getActionCommand().equals("Logarithm")) {
                double result = Math.log(input);
                outputLabel.setText("Logarithm: " + result);
            }
        } catch (NumberFormatException ex) {
            outputLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new MathGUI();
    }
}