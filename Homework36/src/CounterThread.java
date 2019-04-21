import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThread extends Thread {
    private int[] arr;
    private int start;
    private int end;
    private static Object MUTEX = new Object();

    public CounterThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            synchronized (MUTEX){
                Main.mainSum += arr[i];
            }
        }
    }
}