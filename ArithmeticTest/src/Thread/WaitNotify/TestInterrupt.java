package Thread.WaitNotify;

public class TestInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Object lock = new Object();

	            ThreadWait a = new ThreadWait(lock);
	            a.start();

	            Thread.sleep(1000);

	            a.interrupt();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}

}
