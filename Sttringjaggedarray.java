import java.util.*;

public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Number of Semesters' mark you'd wish to enter");
	 int m=sc.nextInt();
	 int[][]jagged=new int[m][];
	 for(int j=0;j<m;j++)
	 {
	     System.out.println("How many subjects in sem "+ (j+1));
	     int mn=sc.nextInt();
	     jagged[j]=new int[mn];
	     System.out.println("Enter marks subject wise");
	     for(int k=0;k<mn;k++)
	     {
	         jagged[j][k]=sc.nextInt();
	         
	         
	     }
	     
	 }
	 jaggedmethod(jagged);
	}
	public static void jaggedmethod(int[][]array)
	{
	    int m=array.length;
	    int[]passed=new int[m];
	    int[]failed=new int[m];
	    int count=0;
	    
	    for(int[] x:array)
	    {
	        int passed1=0;
	        int failed1=0;
	        for(int y:x)
	        {
	            if((y>=40))
	            {
	               passed1++;
	            }
	            else{
	                failed1++;
	            }
	            
	            
	            
	        }
	        passed[count]=passed1;
	        failed[count]=failed1;
	        count++;
	        
	    }
	    System.out.println("Given jagged array was");
	    for(int[]x:array)
	    {
	        for(int y:x)
	        {
	            System.out.print(y +" ");
	        }
	        System.out.println();
	    }
	    for(int j=0;j<m;j++)
	    {
	        System.out.println("Passed in "+passed[j]+" subjects  in Semester-"+(j+1));
	        System.out.println("Failed in "+failed[j]+" subjects  in Semester-"+(j+1));
	    }
	    
	    
	}
}
