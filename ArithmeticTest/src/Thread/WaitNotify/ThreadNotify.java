package Thread.WaitNotify;

public class ThreadNotify extends Thread {
    private Object lock;

    public ThreadNotify(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        RunLockedMethod service = new RunLockedMethod();
        service.NotifyMethod(lock);
    }
}