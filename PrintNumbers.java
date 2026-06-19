class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}

public class PrintNumbers {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
} 
