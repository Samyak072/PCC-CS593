import java.util.Scanner;

public class PaintingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cost per square meter
        final double costPerSquareMeter = 4.5;

        // Get the side length of the square from the user
        System.out.print("Enter the side length of the square (in meters): ");
        double side = scanner.nextDouble();

        // Calculate the area of one side of the square
        double areaOfOneSide = side * side;

        // Since both sides are to be painted, multiply the area by 2
        double totalArea = 2 * areaOfOneSide;

        // Calculate the total cost
        double totalCost = totalArea * costPerSquareMeter;

        // Print the total cost
        System.out.printf("The total cost of painting the square on both sides is: $%.2f%n", totalCost);

        scanner.close();
    }
}
