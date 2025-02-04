import java.util.Random;

class SumCalculator extends Thread {
    private int[] arr;
    private int startIdx, endIdx;
    private int sum;

    public SumCalculator(int[] arr, int startIdx, int endIdx) {
        this.arr = arr;
        this.startIdx = startIdx;
        this.endIdx = endIdx;
    }

    public void run() {
        sum = 0;
        for (int i = startIdx; i < endIdx; i++) {
            sum += arr[i];
        }
    }

    public int getSum() {
        return sum;
    }
}

public class setb1 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        Random random = new Random();
        
        for (int i = 0; i < 1000; i++) {
            numbers[i] = random.nextInt(100); // Generating random numbers from 0 to 99
        }
        
        SumCalculator[] threads = new SumCalculator[10];
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            threads[i] = new SumCalculator(numbers, i * 100, (i + 1) * 100);
            threads[i].start();
        }
        
        try {
            for (int i = 0; i < 10; i++) {
                threads[i].join();
                sum += threads[i].getSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        double average = sum / 1000.0;
        System.out.println("Total Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
