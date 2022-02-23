
import java.util.*;
class Factorial extends Thread
{
    int n;
    Factorial(int n)
    {
        this.n=n;
        start();
        
    }
    public void run()
    {
        int fact=1;
        for(int j=1;j<=this.n;j++)
        {
            fact=fact*j;
            
            
        }
        for(int j=1;j<=this.n;j++)
        {
            System.out.println(j);
            
            
        }
        
        System.out.println("Result of :"+ Thread.currentThread() +" is: "+ fact);
    }
}
class EvenOddchecker implements Runnable
{
    Thread t1;
    
    EvenOddchecker()
    {
        t1=new Thread(this);
        t1.start();
        
        
        
    }
    public void run()
    {
        System.out.println("Enter the input , we are woven inside the thread: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%2==1))
        {
            System.out.println("ODD NUMBER");
        }
        else{
            System.out.println("Even number");
        }
        
    }
    
    
}

public class Main
{
	public static void main(String[] args) {
	    EvenOddchecker m=new EvenOddchecker();
	    Factorial t2=new Factorial(6);
		
	}
}

