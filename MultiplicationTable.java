class Multi5 extends Thread {
	public void run() {
		for(int i=0;i<10;i++){
			int multiple = (i+1)*5;
			System.out.println((i+1)+" x 5 = "+multiple);
			try { 
			    Thread.sleep(500); 
			} 
			catch (InterruptedException e) { 
			    e.printStackTrace(); 
			}
		}
	}
}
class Multi10 extends Thread {
	public void run() {
		for(int i=0;i<10;i++){
			int multiple = (i+1)*10;
			System.out.println((i+1)+" x 10 = "+multiple);
			try { 
			    Thread.sleep(500); 
			} 
			catch (InterruptedException e) { 
			    e.printStackTrace(); 
			}
		}
	}
}
public class MultiplicationTable {
	public static void main(String[] args) {
		Multi5 t1 = new Multi5();
		Multi10 t2 = new Multi10();
		t1.start();
		t2.start();
	}
}