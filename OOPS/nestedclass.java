import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    faculty[]m=new faculty[5];
	    for(int j=0;j<5;j++)
	    {
	        m[j]=new faculty();
	        m[j].set_facultydetails();
	    }
	    for(int j=0;j<5;j++)
	    {
	        m[j].get_facultydetails();
	        
	    }
		
	}
}
class faculty{
    private String emid;
    private String name;
    degree[]d=new degree[3];
    public static  class degree{
        static Scanner sc=new Scanner(System.in);
        private String degreename;
        private String degree_awardedYear;
        public void set_degreedetails(){
            System.out.println("Degree name ");
            degreename=sc.next();
            System.out.println("Degree Awarded Year");
            degree_awardedYear=sc.next();
        }
        public void printdegreedetails(){
            System.out.print("Degree name  ");
            System.out.println(this.degreename);
            System.out.println();
            System.out.print("Degree Awarded Year  ");
            System.out.println(this.degree_awardedYear);
            System.out.println();
        }
    }
    
    public void set_facultydetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name=sc.next();
        System.out.println("Enter emid: ");
        this.emid=sc.next();
        for(int j=0;j<3;j++)
        {
           d[j]=new degree();
           d[j].set_degreedetails();
         }
        
    }
    public void get_facultydetails()
    {
        System.out.print("Your name is: ");
        System.out.println(this.name);
        System.out.print("Your id is: ");
        System.out.println(this.emid);
        for(int j=0;j<3;j++)
        {
            d[j].printdegreedetails();
            
        }
    }
}
