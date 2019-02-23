import java.util.Random;

import Thread.Data;
import Thread.SyncData;
import algorithm.HeapSort;
import algorithm.IArraySort;

public class ConcurrentThread {

	public static void main(String[] args) { 
		
		IArraySort test=new HeapSort();
		int[] sourceArray={9,4,7,1,8,2,3,10};
		int[] aaa=test.sort(sourceArray);
		for (int i : aaa) {
			System.out.print("  "+i);
		}
		
		
		int a=111;
		//
      //final Data data = new Data();  
      //final int a=1;
       // final SyncData data = new SyncData();  
//      final RwLockData data = new RwLockData();  
      
      //–¥»Î
//      for (int i = 0; i < 3; i++) {  
//          Thread t = new Thread(new Runnable() {  
//              @Override
//		public void run() {  
//                  for (int j = 0; j < 3; j++) {
//                	  int aaa=j;
//                      data.set(aaa);  
//                  }  
//              }  
//          });
//          t.setName("Thread-W" + i);
//          t.start();
//      }  
      //∂¡»°
//      for (int i = 0; i < 3; i++) {  
//      	Thread t = new Thread(new Runnable() {  
//              @Override
//		public void run() {  
//                  for (int j = 0; j < 3; j++) {  
//                      data.get();  
//                  }  
//              }  
//          });  
//      	t.setName("Thread-R" + i);
//      	t.start();
//      }  
  }  


}
