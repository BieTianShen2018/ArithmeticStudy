//package com.multithread.learning;
///**
// *@functon ���߳�ѧϰ
// *@author �ֱ���
// *@time 2015.3.9
// */
//class Thread1 extends Thread{
//	private String name;
//    public Thread1(String name) {
//       this.name=name;
//    }
//	public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(name + "����  :  " + i);
//            try {
//                sleep((int) Math.random() * 10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//       
//	}
//}
//public class Test1 {
// 
//	public static void main(String[] args) {
//		boolean b=true?false:true==true?true:false;
//		System.out.println(b);
////		Thread1 mTh1=new Thread1("A");
////		Thread1 mTh2=new Thread1("B");
////		mTh1.start();
////		mTh2.start();
// 
//	}
// 
//}
