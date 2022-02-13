//Java Assignmnet Caeser Cipher in Interface



import java.util.*;

interface mathoperation{
    void add();
    void sub();
    void multiply();
    void divide();
}

class FloatValues implements mathoperation{
    float a;
    float b;     
    FloatValues(float a , float b)
    {
        this.a=a;
        this.b=b;
    }
    FloatValues()
    {
        
    }
    public void add()
    {
        System.out.println(returning(a+b));
        
    }
    public void sub()
    {
       System.out.println(returning(a-b));
        
        
    }
    public void multiply()
    {
        System.out.println(returning(a*b));
    }
    public void divide()
    {
        System.out.println(returning(a/b));
    }
    float returning(float m)
    {
        return m;
        
    }
    
    
}
class IntegerValues implements mathoperation{
    int a;
    int b;
    
    
    IntegerValues(int a , int b)
    {
        this.a=a;
        this.b=b;
    }
    IntegerValues()
    {
        
    }
    public void add()
    {
        System.out.println(returning(a+b));
        
    }
    public void sub()
    {
        System.out.println(returning(a-b));
        
        
    }
    public void multiply()
    {
        System.out.println(returning(a*b));
    }
    public void divide()
    {
        System.out.println(returning(a/b));
    }
    int returning(int m)
    {
        return m;
        
    }
    
    
}

public class Main
{
	public static void main(String[] args) {
		FloatValues s= new FloatValues(4.2f, 5.7f);
		IntegerValues m=new IntegerValues(5,6);
		System.out.println("Invoking Floating function");
		System.out.print(" Addditon of "+ s.a +" and "+s.b+" is :");s.add();
		System.out.print(" Subtraction of  "+ s.a +" and "+s.b+" is :");s.sub();
		System.out.print(" Multiplication of "+ s.a +" and "+s.b+" is :");s.multiply();
		System.out.print(" Division of "+ s.a +" and "+s.b+" is :");s.divide();
		
		System.out.println();
		
		System.out.println("Invoking IntegerValues function");
		System.out.print(" Addditon of "+ m.a +" and "+m.b+" is :");m.add();
		System.out.print(" Subtraction of  "+ m.a +" and "+m.b+" is :");m.sub();
		System.out.print(" Multiplication of "+ m.a +" and "+m.b+" is :");m.multiply();
		System.out.print(" Division of "+ m.a +" and "+m.b+" is :");m.divide();
		
	}
}
