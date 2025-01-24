/*The centre of a circle is given as A(x1,y1) and B is a point on its circumference and B(x2,y2). The program will take 2 values as input A and B . there will be a distance function which will take A,B from user . 
NOW WAP in java that will calculate the distance between the points and will print it.
*/

import java.util.Scanner;
public class DistanceCalculator {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-coordinate of point A: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of point A: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter the x-coordinate of point B: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of point B: ");
        double y2 = scanner.nextDouble();
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("The distance between points A(%.2f, %.2f) and B(%.2f, %.2f) is: %.2f%n", x1, y1, x2, y2, distance);
        scanner.close();
    }
}
