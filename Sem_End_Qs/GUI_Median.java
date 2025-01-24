/*WAP IN JAVA WHICH WILL IMPLEMENT GUI and calculate Median. create a input field and a submit button now when user enters the numbers calculate button will calculate the median. Apply exception handling as well.
*/



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MedianCalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Median Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        JLabel inputLabel = new JLabel("Enter numbers (comma-separated):");
        JTextField inputField = new JTextField(20);
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Median: ");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 5, 5));
        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultLabel);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = inputField.getText();
                    if (input.isEmpty()) {
                        throw new IllegalArgumentException("Input cannot be empty.");
                    }
                    String[] numberStrings = input.split(",");
                    double[] numbers = new double[numberStrings.length];
                    for (int i = 0; i < numberStrings.length; i++) {
                        numbers[i] = Double.parseDouble(numberStrings[i].trim());
                    }
                    Arrays.sort(numbers);
                    double median;
                    int n = numbers.length;
                    if (n % 2 == 0) {
                        median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
                    } else {
                        median = numbers[n / 2];
                    }
                    resultLabel.setText("Median: " + median);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Please enter valid numbers.");
                } catch (IllegalArgumentException ex) {
                    resultLabel.setText("Error: " + ex.getMessage());
                } catch (Exception ex) {
                    resultLabel.setText("Error: An unexpected error occurred.");
                }
            }
        });
        frame.add(panel);
        frame.setVisible(true);
    }
}
