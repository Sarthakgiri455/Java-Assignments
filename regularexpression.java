import java.util.*;
import java.util.regex.*;

//registration number of length 9, and containing only alphanumeric values.. and phone number of length 10 contatining only numeric characters.

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Registration Number");
		String m=sc.next();
		System.out.println("Phone number");
		String n=sc.next();
		
		boolean x=Pattern.matches("[a-zA-Z0-9]{9}", m);
		boolean y=Pattern.matches("[0-9]{10}", n);
		if((x==false))
		{
		    if(m.length()==9)
		    {
		        System.out.println("Only Alphanumeric allowed in reg no, but different provided.");
		    }
		    else{
		        System.out.println("Registration number length is only 9, but "+m.length()+" provided");
		        boolean z=Pattern.matches("[a-zA-Z0-9]", m);
		        if((z==false))
		        {
		            System.out.println("Registration number also contains other than alpha numeric characters");
		        }
		        
		        
		    }
		}
		else{
		    System.out.println("Correct Registration Number");
		}
		if((y==false))
		{
		     if(n.length()==10)
		    {
		        System.out.println("Only Number  allowed in phone number, but different provided.");
		    }
		    else{
		        System.out.println("Phone  number length is only 10, but "+n.length()+" provided");
		        
		    }
		    boolean k=Pattern.matches("[0-9]", n);
		        if((k==false))
		        {
		            System.out.println("Phone  number also contains other than  numeric characters");
		        }
		    
		}
		else{
		    System.out.println("Correct phone number");
		}
		
	}
}
