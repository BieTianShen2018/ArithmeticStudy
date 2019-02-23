package Thread.WaitNotify;

import java.util.List;

public class Subtract {
	   private String lock;

	    public Subtract(String lock) {
	        super();
	        this.lock = lock;
	    }

	    public void subtract() throws InterruptedException {
	        synchronized (lock) {
//	                while(ValueObject.list.size() == 0) {//将这里的if改成while即可保证不出现越界异常!!!!
//	                    System.out.println("wait is ready to begin. ThreadName= "
//	                            + Thread.currentThread().getName());
//	                    Thread.sleep(2000);
//	                    lock.wait();
//	                    //Thread.sleep(5000);
//	                    System.out.println("wait is ended. ThreadName= "
//	                            + Thread.currentThread().getName());
//	                }
				while (ValueObject.list.size()>0) {	            		
					 System.out.println("ThreadName= "
			                    + Thread.currentThread().getName()+":"+ValueObject.list.get(0));
					 ValueObject.list.remove(0);
					 if(ValueObject.list.size()%2==0){
						 lock.notify();
						 System.out.println("ThreadName= "
				                    + Thread.currentThread().getName()+": wo kai shi notify" );
					 }
					 Thread.sleep(1000);
					 System.out.println("ThreadName= "
			                    + Thread.currentThread().getName()+": wo jin ru le wait" );
					 lock.wait();
					 System.out.println("ThreadName= "
			                    + Thread.currentThread().getName()+":   wait hou" );
					 Thread.sleep(1000);
					 if(ValueObject.list.size()%2==0){
						 lock.notify();
						 System.out.println("ThreadName= "
				                    + Thread.currentThread().getName()+": wo kai shi notify hou mian de" );
					 }
					 
				}
//	                System.out.println(ValueObject.list.toString());
//	                ValueObject.list.remove(0);
//	                System.out.println(Thread.currentThread().getName()+" list size=" + ValueObject.list.size());
			}
	    }
}
