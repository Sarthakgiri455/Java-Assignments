import java.util.*;
import java.text.DecimalFormat;
class Box{
    private double length;
    private double breadth;
    private double height;
    Box(Box m)
    {
        length=m.length;
        breadth=m.breadth;
        height=m.height;
    }
    Box(double length, double breadth, double height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
       
        
        
    }
    Box()
    {
        length=-1;
        breadth=-1;
        height=-1;
        
    }
    Box(double length)
    {
        this.length=length;
        this.breadth=length;
        this.height=length;
    }
    Box(double length, double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public double volume()
    {
        double volume=length*breadth*height;
        DecimalFormat df=new DecimalFormat("#.#");
        String mn=df.format(volume);
        double final2=Double.parseDouble(mn);
        return final2;
        
    }
    double lengthgetter()
    {
        return length;
    }
    double breadthgetter()
    {
        return breadth;
        
    }
    double heightgetter()
    {
        return height;
    }
    
}
class Boxbmi extends Box{
    private double weight;
    Boxbmi()
    {
        super();
        weight=1;
    }
    
    Boxbmi(double length, double breadth, double height, double weight)
    {
        super(length, breadth, height);
        this.weight=weight;
    }
    Boxbmi(double length, double weight)
    {
        super(length);
        this.weight=weight;
        
    }
    double bmicompute()
    {
        double volume=this.lengthgetter()* this.breadthgetter()* this.heightgetter();
        double bmi=volume/weight;
        DecimalFormat df=new DecimalFormat("#.#");
        String hello=df.format(bmi);
        double result=Double.parseDouble(hello);
        return result;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Boxbmi w1=new Boxbmi(5.5,2.0);  //prob1
	    Boxbmi w2=new Boxbmi(5,7,8.5,28.9); //prob2
	    Box w3=new Box();
	    Box w4=new Box(8.5);//prob3
	    Box w5=new Boxbmi(10, 7, 5,8); 
	    System.out.println("BOX volime of w1 is  "+w1.volume()+"  and BMI is "+ w1.bmicompute());
	    System.out.println("BOX volime of w2 is  "+w2.volume()+"  and BMI is "+ w2.bmicompute());
	    System.out.println("BOX volime of w3 is  "+w3.volume()+"  and no BMI because of base class ");
	    System.out.println("BOX volime of w4 is  "+w4.volume()+"  and no BMI because of base class ");
	    System.out.println("BOX volime of w5 is  "+w5.volume()+"  and no BMI because of base class ");
	}
}
