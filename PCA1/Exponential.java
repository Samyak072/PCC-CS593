/*Q1. Write a Program in JAVA, to calculate the Exponential Series (e^x). Also handle error cases and restrict the answer to 4 decimal places.*/
/* Maximum Marks: 10  */

import java.util.Scanner;

public class ExponentialSeries {
    public static double calculateExponential(double x, int terms) {
        double sum = 1.0; 
        double term = 1.0; 

        for (int i = 1; i < terms; i++) {
            term *= x / i; 
            sum += term;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x (real number): ");
        try {
            double x = scanner.nextDouble();

            if (Double.isNaN(x) || Double.isInfinite(x)) {
                throw new IllegalArgumentException("Invalid input: x must be a finite number.");
            }

            int terms = 100; 
            double result = calculateExponential(x, terms);
            System.out.printf("e^%.2f = %.4f%n", x, result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
