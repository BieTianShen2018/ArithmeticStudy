package Thread.WaitNotify;

public class RunLockedMethod {

    public void waitMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("Begin wait() ThreadName="
                        + Thread.currentThread().getName());
                lock.wait();
                System.out.println("End wait() ThreadName="
                        + Thread.currentThread().getName());
            }
            //lock.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void NotifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("Begin notify() ThreadName="
                        + Thread.currentThread().getName() + " time="
                        + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(1000);
                System.out.println("End notify() ThreadName="
                        + Thread.currentThread().getName() + " time="
                        + System.currentTimeMillis());
            }
            //lock.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
