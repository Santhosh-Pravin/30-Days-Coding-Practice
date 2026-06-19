class Hello extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i ++) {
            System.out.println("Hello!");
            try { 
			    Thread.sleep(500); 
			} 
			catch (InterruptedException e) { 
			    e.printStackTrace(); 
			}
        }
    }
}
class Welcome extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i ++) {
            System.out.println("Welcome!");
            try { 
			    Thread.sleep(500); 
			} 
			catch (InterruptedException e) { 
			    e.printStackTrace(); 
			}
        }
    }
}
public class HelloHowAreYou {
    public static void main(String[] args) {
        Hello t1 = new Hello();
        Welcome t2 = new Welcome();
        t1.start();
        t2.start();
    }
}
