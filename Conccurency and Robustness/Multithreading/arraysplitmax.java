import java.util.*;
class maxnumber extends Thread{
    int[]arr=new int[500];
    int max;
    Thread t;
    maxnumber(int[]arr2)
    {
        this.arr=arr2;
        t=new Thread(this);
        start();
        
        
    }
    public void run()
    {
        int max=0;
        for(int x: arr)
        {
            if(x>max)
            {
                max=x;
            }
            
        }
        this.max=max;
        System.out.println("the result of "+Thread.currentThread() +" is "+this.max);
    }
}

class maxnumber2 extends Thread{
    int[]arr=new int[500];
    int max;
    Thread t;
    maxnumber2(int[]arr2)
    {
        this.arr=arr2;
        t=new Thread(this);
        start();
        
        
    }
    public void run()
    {
        int max=0;
        for(int x: arr)
        {
            if(x>max)
            {
                max=x;
            }
            
        }
        this.max=max;
        System.out.println("the result of "+Thread.currentThread() +" is "+this.max);
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[]firsthalf=new int[500];
		int[]secondhalf=new int[500];
		for(int j=1;j<=500;j++)
		{
		    firsthalf[j-1]=j;
		    
		}
		for(int j=1;j<=500;j++)
		{
		    secondhalf[j-1]=j+500;
		    
		}
		maxnumber t1=new maxnumber(firsthalf) ;
		maxnumber2 t2=new maxnumber2(secondhalf) ;
		
		try{
		    t1.join();
		    t2.join();
		}
		catch(InterruptedException e){
		    System.out.println("hello");
		    
		    
		}
		
		if(t1.max>t2.max)
		{
		    System.out.println(t1.max);
		}
		else{
		    System.out.println(t2.max);
		}
		
		
		
	}
}
