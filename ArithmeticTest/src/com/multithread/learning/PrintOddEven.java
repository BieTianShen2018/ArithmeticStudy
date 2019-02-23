package com.multithread.learning;

/**
 * wait�÷�
 * @author DreamSea 
 * @time 2015.3.9 
 */

public class PrintOddEven implements Runnable {   
	  
    private String name;   
    private Object prev;   
    private Object self;   
  
    private PrintOddEven(String name, Object prev, Object self) {   
        this.name = name;   
        this.prev = prev;   
        this.self = self;   
    }   
  
    @Override  
    public void run() {   
        int count = 3;   
        while (count > 0) {   
            synchronized (prev) {   
                synchronized (self) {   
                    System.out.print(name);   
                    count--;  
                   
                    self.notify();   
                }   
                try {   
                	 //this.wait();
                	// this.notify();
                    prev.wait();   
                } catch (Exception e) {   
                    e.printStackTrace();   
                }   
            }   
  
        }   
    }   
  
    public static void main(String[] args) throws Exception {   
        Object a = new Object();   
        Object b = new Object();   
        Object c = new Object();   
        PrintOddEven pa = new PrintOddEven("A", b, a);   
        PrintOddEven pb = new PrintOddEven("B", a, b);   
        //PrintOddEven pc = new PrintOddEven("C", b, c);   
           
           
        new Thread(pa).start();
        Thread.sleep(100);  //ȷ����˳��A��B��Cִ��
        new Thread(pb).start();
        Thread.sleep(100);  
        //new Thread(pc).start();   
       // Thread.sleep(100);  
        }   
}  
 
