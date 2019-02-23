package com.multithread.learning;

public class TestType { 
	  String str = new String("good"); 

	  char[] ch = {'a','b','c'}; 
	  public static void main(String[] args) { 
	     TestType ex = new TestType(); 
		  //ex.str="bbb";
	     ex.change(ex.str, ex.ch); 
	     System.out.println(ex.str +"and"); 
	     System.out.println(ex.ch);
	     
	     int i=0;
	     Integer j = new Integer(0);
	     System.out.println(i==j);
	     System.out.println(j.equals(i));
	     
	     int a=257;
	     Integer b=257;
	     Integer c=257;
	     Integer b2=57;
	     Integer c2=57;
	     System.out.println(a==b);
	     //System.out.println(a.equals(b));  编译出错，基本型不能调用equals()
	     System.out.println(b.equals(257.0));
	     System.out.println(b==c);
	     System.out.println(b2==c2);
	     
	  } 
	    
	  public void change(String str, char ch[]){ 
		  System.out.print(str.hashCode()); 
	     str= "test ok"; 
	     System.out.print(str.hashCode());
	     ch[0]= 'g'; 
	  } 
	} 