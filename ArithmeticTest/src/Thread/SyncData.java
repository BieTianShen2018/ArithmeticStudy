package Thread;

public class SyncData {      
    private int data;// ��������      
    public synchronized  void set(int data) {  
        //System.out.println(Thread.currentThread().getName() + "׼��д������");  
//        try {  
//            Thread.sleep(20);  
//        } catch (InterruptedException e) {  
//            e.printStackTrace();  
//        }  
        this.data = data;  
        System.out.println(Thread.currentThread().getName() + "д��" + this.data);  
    }     
    public synchronized  void get() {  
        //System.out.println(Thread.currentThread().getName() + "׼����ȡ����");  
//        try {  
//            Thread.sleep(20);  
//        } catch (InterruptedException e) {  
//            e.printStackTrace();  
//        }  
        System.out.println(Thread.currentThread().getName() + "��ȡ" + this.data);  
    }  
}  

