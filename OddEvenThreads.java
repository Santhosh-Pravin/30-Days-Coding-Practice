class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try { 
			    Thread.sleep(500); 
			} 
			catch (InterruptedException e) { 
			    e.printStackTrace(); 
			}
        }
    }
}
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try { 
			    Thread.sleep(500); 
			} 
			catch (InterruptedException e) { 
			    e.printStackTrace(); 
			}
        }
    }
}
public class OddEvenThreads {
    public static void main(String[] args) {
        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();
        t1.start();
        t2.start();
    }
}
