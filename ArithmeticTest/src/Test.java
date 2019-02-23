//
//
//public class Test {
//
//    public static void main(String[] args) {
//    	Runnable ra=new Runnable() {
//    		@Override
//    		public void run() {
//    			System.out.println( "运行111  :  " );   		
//    		}  		
//    	};
//    	Thread th=new Thread(ra);
//    	th.start();
//    	System.out.println( "运行2222  :  " ); 
//    }   
//}
//
//class Thread2 implements Runnable{
//	private String name;
// 
//	public Thread2(String name) {
//		this.name=name;
//	}
// 
//	@Override
//	public void run() {
//		  for (int i = 0; i < 5; i++) {
//	            System.out.println(name + "运行  :  " + i);
////	            try {
////	            	Thread.sleep((int) Math.random() * 10);
////	            } catch (InterruptedException e) {
////	                e.printStackTrace();
////	            }
//	        }		
//	}
//	
//}
