import java.util.Scanner;
class MyThread implements Runnable {
    private String s;
    private int n;
    MyThread(String s, int n) {
        this.s = s;
        this.n = n;
    }
    public void run() {
        System.out.println("Factorial Thread: Started");
        if(n<0) {
        System.out.println("Factorial Thread: ERROR");
        }
        else {
              int fact = 1;
               for (int i = 1; i <= n; i++) {
               fact *= i;
                }
                System.out.println(s + " Thread: " + fact);
        }
        System.out.println(s + " Thread: Ended");
    }
}

class ThreadFactorial {
    public static void main(String[] args) {
        System.out.println("Main Thread: Started");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        MyThread mt1 = new MyThread("Factorial", n);

        Thread nt1 = new Thread(mt1);
        nt1.start();

        System.out.println("Main Thread: Ended");
    }
}
