import java.util.Scanner;
public class ComputeAverage {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        float marks1 = sc.nextFloat();
        float marks2=sc.nextFloat();
        float marks3=sc.nextFloat();
        float marks4=sc.nextFloat();
        float marks5=sc.nextFloat();
        float sum=marks1+marks2+marks3+marks4+marks5;
        double avg = sum / 5.0;
        System.out.printf("%.2f\n", avg);
    }
}
