package Thread.WaitNotify;

public class TestWaitNotifyThread {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        ThreadWait a = new ThreadWait(lock);
        a.start();

        //NotifyThread notifyThread = new NotifyThread(lock);
       // notifyThread.start();

        ThreadNotify c = new ThreadNotify(lock);
        c.start();
    }
}