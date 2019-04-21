public class Main {
    public static int mainSum = 0;
    public static int threadSum = 0;

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000 - 100);
        }

        CounterThread Thread1 = new CounterThread(arr,0,250);
        CounterThread Thread2 = new CounterThread(arr,250,500);
        CounterThread Thread3 = new CounterThread(arr,500,750);
        CounterThread Thread4 = new CounterThread(arr,750,1000);
        Thread1.start();
        Thread2.start();
        Thread3.start();
        Thread4.start();

        Thread1.join();
        Thread2.join();
        Thread3.join();
        Thread4.join();

        for (int i = 0; i < arr.length; i++) {
            threadSum += arr[i];
        }
        
        System.out.println(mainSum + " = " + threadSum);
    }
}
