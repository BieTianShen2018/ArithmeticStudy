package com.multithread.learning;

public class RunnableThread implements Runnable{
	private String name;
    public RunnableThread(String name) {
       this.name=name;
    }
	public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "ÔËÐÐ  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }       
	}
}
