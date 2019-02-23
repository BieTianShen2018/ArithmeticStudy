package Thread.WaitNotify;

public class Add {

    private String lock;
    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add() throws InterruptedException {
        synchronized (lock) {
            ValueObject.list.add(99);
            ValueObject.list.add(88);
            System.out.println("notify is ready. ThreadName= "
                    + Thread.currentThread().getName());
            Thread.sleep(1000);
            lock.notifyAll();
            //Thread.sleep(5000);
            System.out.println("notify is runing. ThreadName= "
                    + Thread.currentThread().getName());
        }
    }
}