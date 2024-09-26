import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private JFrame frame;
    private JTextField displayField;
    private CalculatorLogic logic;
    private Display display;
    private double firstNum = 0;
    private String operator = "";
    private boolean operatorPressed = false;

    public CalculatorGUI() {
        logic = new CalculatorLogic();
        display = new Display();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        
        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(displayField, BorderLayout.NORTH);
        frame.add(panel);

        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                // Number buttons
                if (operatorPressed) {
                    display.clearDisplay();  // Clear the display for new number input
                    operatorPressed = false;
                }
                display.updateDisplay(command);
                displayField.setText(display.getDisplay());
            } else if (command.equals("C")) {
                // Clear button
                display.clearDisplay();
                displayField.setText("");
                firstNum = 0;
                operator = "";
            } else if (command.equals("=")) {
                // Equal button
                double secondNum = Double.parseDouble(display.getDisplay());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = logic.add(firstNum, secondNum);
                        break;
                    case "-":
                        result = logic.subtract(firstNum, secondNum);
                        break;
                    case "*":
                        result = logic.multiply(firstNum, secondNum);
                        break;
                    case "/":
                        result = logic.divide(firstNum, secondNum);
                        break;
                }

                display.clearDisplay();
                display.updateDisplay(String.valueOf(result));
                displayField.setText(display.getDisplay());
                operator = "";  // Reset operator after calculation
            } else {
                // Operator buttons (+, -, *, /)
                firstNum = Double.parseDouble(display.getDisplay());  // Store the first number
                operator = command;
                operatorPressed = true;  // Flag to indicate operator was pressed
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorGUI::new);
    }
}
