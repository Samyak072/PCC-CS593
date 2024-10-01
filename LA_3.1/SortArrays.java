import java.util.Arrays;
import java.util.Scanner;
public class SortArrays {
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double[] nums=new double[100];
int i=0;
int size=0;
    	while (sc.hasNextDouble())
            nums[i++] = sc.nextDouble();
        size = i;
        Arrays.sort(nums,0,size);
        for (int j=0;j<size;j++) {
                System.out.printf("%.2f ",nums[j]);
          }
            System.out.println();
    }
}
