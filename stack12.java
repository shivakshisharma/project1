package june;

import java.util.*;

public class Stack12 {
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		PriorityQueue<student> ss=new PriorityQueue<>();
		
		student s1=new student('s',50,49,53);
		student s2=new student('a',60,62,58);
		student s3=new student('b',78,90,95);
		student s4=new student('r',33,58,76);
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		while(ss.size()>4)
		{
			ss.remove();
		}
		while(ss.size()>0)
		{
			student rem=ss.remove();
			System.out.println(rem.name+"---"+rem.chem);
		}
		
}
      public static class student implements Comparable<student>{
    	  char name;
    	  int phy;
    	  int chem;
    	  int maths;
    	  public student(char cc,int p,int c,int m)
    	  {
    		  this.name=cc;
    		  this.phy=p;
    		  this.chem=c;
    		  this.maths=m;
    	  }
    	  public  int compareTo(student ob)
    	  {
    		  return this.chem-ob.chem;
    	  }
    	  
      }
}
