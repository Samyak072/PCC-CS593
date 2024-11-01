import javax.swing.*;
import java.awt.event.*;

public class GUIReverse implements ActionListener {
    JFrame frame;
    JTextField input;
    JLabel result;
    GUIReverse() {
        frame = new JFrame("GUI Reverse");

        frame.add(new JLabel("Enter the whole number:")).setBounds(50, 50, 200, 20);
        input = new JTextField();
        input.setBounds(50, 80, 200, 25);
        frame.add(input);

        JButton submit = new JButton("Submit");
        submit.setBounds(50, 120, 100, 30);
        submit.addActionListener(this);
        frame.add(submit);

        result = new JLabel("Result: ");
        result.setBounds(50, 160, 300, 25);
        frame.add(result);

        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
        String inputText = input.getText();
        try {
            int num = Integer.parseInt(inputText);
            if (num < 0) throw new NumberFormatException(); // Handle negative input
            String reversed = new StringBuilder(inputText).reverse().toString();
            result.setText("Result: " + reversed);
        } catch (NumberFormatException ex) {
            result.setText("ERROR: Invalid input.");
        }
    }

    public static void main(String[] args) {
        new GUIReverse();
    }
}