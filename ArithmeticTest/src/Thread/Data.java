package Thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public  class Data {      
    private int data;// ��������  
    private ReadWriteLock rwl = new ReentrantReadWriteLock();     
    public void set(int data) {  
        rwl.writeLock().lock();// ȡ��д��  
        try {  
//            System.out.println(Thread.currentThread().getName() + "׼��д������");  
//            try {  
//                Thread.sleep(20);  
//            } catch (InterruptedException e) {  
//                e.printStackTrace();  
//            }  
            this.data = data;  
            System.out.println(Thread.currentThread().getName() + "д��" + this.data);  
        } finally {  
            rwl.writeLock().unlock();// �ͷ�д��  
        }  
    }     

    public void get() {  
        rwl.readLock().lock();// ȡ������  
        try {  
//            System.out.println(Thread.currentThread().getName() + "׼����ȡ����");  
//            try {  
//                Thread.sleep(20);  
//            } catch (InterruptedException e) {  
//                e.printStackTrace();  
//            }  
            System.out.println(Thread.currentThread().getName() + "��ȡ" + this.data);  
        } finally {  
            rwl.readLock().unlock();// �ͷŶ���  
        }  
    }  
}  

