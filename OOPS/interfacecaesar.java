import java.util.*;
interface EncryptDecrypt{      
    
	void encrypt(String m);
	void decrypt(String n);
}
class SpaceElimination{
	static Scanner sc=new Scanner(System.in);
	
	String text;
	SpaceElimination(String m)
	{
		String n=m.replaceAll(" ","");
		this.text=n;
	}
	SpaceElimination()
	{
		String m=sc.next();
		String n=m.replaceAll(" ","");
		this.text=n;		
	}	
}
class CaeserCipher extends SpaceElimination implements EncryptDecrypt{
	
	String encryptedtext=new String();
	String decryptedtext=new String();
	
	CaeserCipher(String m)
	{
		super(m);
	}
	CaeserCipher()
	{
		super();
	}
	public void encrypt(String m)
	{
		String qqq=m.replaceAll(" ","");
		char[] ch=qqq.toCharArray();
		
		for(int j=0;j<ch.length;j++)
		{
			int nn=ch[j];
			int n=nn+3;
			char x =(char)n;
			ch[j]=x;
		}
		String string=encryptedtext.valueOf(ch);
		System.out.println(string);		
	}
	public void decrypt(String n)
	{
		char[]ch2=n.toCharArray();
		for(int k=0;k<ch2.length;k++)
		{
			int q=ch2[k];
			int r=q-3;
			char x2 =(char)r;
			ch2[k]=x2;
		}
		String string=encryptedtext.valueOf(ch2);
		System.out.println(string);
	}
}
public class Main
{
	public static void main(String[] args)
	{
		
		CaeserCipher d=new CaeserCipher("hello");
		d.encrypt("I am giri");
	}
}

		
		
			
		
			
			
			
			
			
		
	
	
	


    
 	



		
		
            	




