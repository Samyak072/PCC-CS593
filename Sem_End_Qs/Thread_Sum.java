/*WAP IN JAVA, to illustrate multi-threading where sum of an array has to be calculated now, thread1 will calculate even indexes sum and thread2 will calculate thread2 sum. Finally we will get the final sum of an array.
*/

class ArraySum {
    private int[] array;
    private int evenSum = 0;
    private int oddSum = 0;
    public ArraySum(int[] array) {
        this.array = array;
    }
    public synchronized void calculateEvenSum() {
        for (int i = 0; i < array.length; i += 2) {
            evenSum += array[i];
        }
    }
    public synchronized void calculateOddSum() {
        for (int i = 1; i < array.length; i += 2) {
            oddSum += array[i];
        }
    }
    public int getTotalSum() {
        return evenSum + oddSum;
    }
}
public class MultiThreadingArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArraySum arraySum = new ArraySum(array);
        Thread thread1 = new Thread(() -> {
            arraySum.calculateEvenSum();
        });
        Thread thread2 = new Thread(() -> {
            arraySum.calculateOddSum();
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Sum of Array: " + arraySum.getTotalSum());
    }
}
