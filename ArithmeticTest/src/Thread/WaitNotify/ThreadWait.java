package Thread.WaitNotify;

public class ThreadWait extends Thread {
    private Object lock;

    public ThreadWait(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        RunLockedMethod service = new RunLockedMethod();
        service.waitMethod(lock);
    }
}