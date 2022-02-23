
import java.util.*;

class Multithread implements Runnable{
	
	public void run()//run lai explicitly invoke garna mildaina
	{
		System.out.println(Thread.currentThread() + " says hello");
		for(int j=0;j<5;j++)
		{
		    System.out.print(j+"  ");
		}
		System.out.println();
		System.out.println(Thread.currentThread() + " says hello");
	}
}
class Multithread2 implements Runnable{
	
	public void run()//run lai explicitly invoke garna mildaina
	{
		System.out.println(Thread.currentThread() + " says hello");
		System.out.println("VIT placements");
		for(int j=-20;j<5;j++)
		{
		    System.out.print(j+"  ");
		}
		System.out.println();
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Multithread());
		Multithread2 m=new Multithread2(); 
		Thread t2=new Thread(m);
		
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread() + " says hello");
	}
}

		
		
