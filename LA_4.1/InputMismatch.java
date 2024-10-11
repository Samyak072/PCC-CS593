import java.util.*;
import java.util.InputMismatchException;
public class InputMismatch {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n,num,sum=0;
        n=sc.nextInt();
        for (int i=1;i<=n;i++) {
            try {
                num=sc.nextInt();
                sum+=num;
            }
            catch (InputMismatchException e) {
                System.out.println("ERROR");
                System.exit(0);
            }
        }
        System.out.println(sum);
   }
}
