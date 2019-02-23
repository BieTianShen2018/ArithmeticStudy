package Thread.WaitNotify;

public class ThreadAdd extends Thread {

    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        try {
			p.add();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}