import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();

        // Generate and print Pascal's Triangle
        System.out.println("Pascal's Triangle:");
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Calculate and print each element in the row
            int number = 1; // The first number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Calculate the next number
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
