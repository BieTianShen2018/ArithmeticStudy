package Thread.WaitNotify;

public class ThreadSubtract extends Thread {
	private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        try {
			r.subtract();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
