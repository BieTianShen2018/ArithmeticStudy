package Thread.WaitNotify;

public class RunAddSubtrack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 String lock = new String("aaa");

	        //Add add = new Add(lock);
	        Subtract subtract = new Subtract(lock);
	        ValueObject.getList();
	        ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
	        subtract1Thread.setName(" subtract 1 ");
	        subtract1Thread.start();
Thread.sleep(2000);
	        ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
	        subtract2Thread.setName(" subtract 2 ");
	        subtract2Thread.start();

//	        Thread.sleep(6000);
//
//	        ThreadAdd addThread = new ThreadAdd(add);
//	        addThread.setName(" add Thread");
//	        addThread.start();
	}

}
