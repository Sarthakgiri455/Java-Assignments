import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<Integer>integers;
		integers=new ArrayList<>(); //We do not respecify the class InheritableThreadLocal
		ArrayList<String>fruits=new ArrayList<>(); //fruits 
		ArrayList<Double>doubles=new ArrayList<>();
		//we can store object, not a primitive type int 
		//use a wrapper class;
		//add method in ArrayList
		
		
		//Wrapper class 
		fruits.add("Apple");
		fruits.add("HELLO");
		fruits.add(0,"AtINDEX 0");
		System.out.println(fruits);
		System.out.println(fruits.get(0));
		fruits.set(2,"ORRANGE");
		System.out.println(fruits);
		
		//remove value from index and remove element from value
		
		fruits.remove(1);
		System.out.println(fruits);
		//remove by value ko laagi go through the array list and compare if each entry equals
		
		fruits.remove("Orange");
		System.out.println(fruits);
		//fruits.clear();
	//	System.out.println(fruits);
		
		// size of the elements in an ArrayList
		//System.out.println(fruits.size());
		//size
		for(String x:fruits)
		{
		    System.out.println(x);
		}
		ArrayList<Integer>hello=new ArrayList<>();
		for(int j=0;j<10;j++)
		{
		    hello.add(j);
		}
		for(Integer x: hello)
		{
		    System.out.print(x+" ");
		}
		ArrayList<ArrayList<Integer>>v1=new ArrayList<ArrayList<Integer>>();
		
		for(int j=0;j<5;j++)
		{
		    Scanner sc=new Scanner(System.in);
		    int m=sc.nextInt();
		    ArrayList<Integer>m1=new ArrayList<>();
		    for(int k=0;k<m;k++)
		    {
		        m1.add(k);
		        
		    }
		    v1.add(m1);
		}
		for(ArrayList<Integer>x: v1)
		{
		    for(Integer y: x)
		    {
		        System.out.print(y+" ");
		    }
		    System.out.println();
		}
	}
}
