class A{
    public void show()
    {
        System.out.println("in a show");
    }
    public void empty()
    {
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    A obj=new A()
	       {
	        public void show()
	        {
	            System.out.println("i m the best");
	        }
	        public void empty()
	        {
	            System.out.println("empty");
	            
	        }
	        
	    };
	    obj.show();
	    obj.empty();
	}
}
