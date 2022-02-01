import java.util.*;
abstract class Themepark
{
    int childfee=300;
    int adultfee=500;
    int cost;
    
    Themepark()
    {
        cost=0;
        
    }
    Themepark(int m, int n)
    {
        
        cost=childfee*m+adultfee*n;
    }
    int totalcost()
    {
         
         return cost;
    }
    abstract void playgame();
    abstract void gameplayinfo();
    
}
class Queensland extends Themepark{
    boolean[]x=new boolean[30];
    Queensland(int a, int b)
    {
        super(a, b);
    }
    Queensland()
    {
        super();
        
    }
    
    
    public void playgame()
    {
        System.out.println("You are in Queensland of Themepark");
        System.out.println("You want to start gaming yes/no");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
       
        while((s.equalsIgnoreCase("yes")) &&(count<=30))
        {
            System.out.println("enter the game number, 1 to 30");
            
            int m=sc.nextInt();
            if((x[m-1]==false))
            {
                x[m-1]=true;
                System.out.println("Game play successful");
                
                System.out.println("Continue the game Yes/No");
                s=sc.next();
                count++;
                
            }
            else{
                System.out.println("Game already played, can't play again");
                
                System.out.println("Continue the game Yes/No");
                s=sc.next();
            }
        }
        
        
        
    }
    public void gameplayinfo()
    {
        int play=0;
        int notplay=0;
        for(boolean s:this.x)
        {
            if((s))
            {
                play++;
            }
            else{
                notplay++;
            }
        }
        System.out.println("Games Played : "+play + " out of 30");
        System.out.println("Games Not Played : "+notplay);
        
    }
    
    
    
}
class Wonderla extends Themepark{
    boolean[]x=new boolean[40];
    Wonderla()
    {
        super();
    }
    Wonderla(int a, int b)
    {
        super(a, b);
        
        
    }
    
    
    void playgame()
    {
        System.out.println("You are in Queensland of Themepark");
        System.out.println("You want to start gaming yes/no");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
       
        while((s.equalsIgnoreCase("yes")) &&(count<=40))
        {
            System.out.println("enter the game number, 1 to 30");
            
            int m=sc.nextInt();
            if((x[m-1]==false))
            {
                x[m-1]=true;
                System.out.println("Game play successful");
                
                System.out.println("Continue the game Yes/No");
                s=sc.next();
                count++;
                
            }
            else{
                System.out.println("Game already played, can't play again");
                
                System.out.println("Continue the game Yes/No");
                s=sc.next();
            }
        }
        
    }
    public void gameplayinfo()
    {
        int play=0;
        int notplay=0;
        for(boolean s:this.x)
        {
            if((s))
            {
                play++;
            }
            else{
                notplay++;
            }
        }
        System.out.println("Games Played : "+play + " out of 30");
        System.out.println("Games Not Played : "+notplay);
        
    }
    
}

public class Main
{
	public static void main(String[] args) {
	    Queensland s= new Queensland(5,9);
	    s.playgame();
	    s.gameplayinfo();
	    
	    
	    
	    
		
	}
}
