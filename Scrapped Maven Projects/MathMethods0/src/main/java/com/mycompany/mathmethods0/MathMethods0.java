/**
 * A simple GUI program that performs various math operations on a user-entered number.
 * The program displays a text field for the user to enter a number and several buttons
 * for the user to choose which math operation to perform. The program then displays the
 * result of the operation in a label at the bottom of the window.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author c0d3x
 */
public class MathGUI implements ActionListener {
    
    // instance variables for the JFrame, text field, and output label
    private JFrame frame;
    private JTextField inputField;
    private JLabel outputLabel;

    /**
     * Constructs a new MathGUI object and sets up the GUI window with the input field,
     * math operation buttons, and output label.
     */
    public MathGUI() {
        frame = new JFrame("Math Methods");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        // panel for the input field and label
        JPanel inputPanel = new JPanel();
        JLabel inputLabel = new JLabel("Enter a number:");
        inputField = new JTextField(10);
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        // panel for the math operation buttons
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

        // label for displaying the output of the math operation
        outputLabel = new JLabel();

        // add the components to the frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(outputLabel, BorderLayout.SOUTH);

        // make the frame visible
        frame.setVisible(true);
    }

    /**
     * Performs the selected math operation when a button is pressed.
     * Gets the number entered by the user from the input field and updates
     * the output label with the result of the operation.
     */
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

    /**
     * Main method that creates a new MathGUI object.
     */
    public static void main(String[] args) {
    new MathGUI();