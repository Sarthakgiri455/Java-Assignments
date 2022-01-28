import java.util.*;
import java.util.Scanner;
public class Main
{
 public static Scanner scanner=new Scanner(System.in);
public static void main(String[] args) {
 
 System.out.println("**********QUESTION NUMBER 2 A. ********");
 System.out.println("Number of items in an array:: ");
 int a=scanner.nextInt();
 int[]array=new int[a];
 System.out.println("Enter array elements");
 
 for(int i=0;i<a;i++)
 {
 array[i]=scanner.nextInt(); 
 
 }
 int odd=0;
 int even=0;
 System.out.println("Entered Array is: "+Arrays.toString(array));
 for(int i=0;i<a;i++)
 {
 int mn=array[i];
 if((mn%2)==0)
 {
 even+=1;
 
 }
 else{
 odd+=1;
 
 }
 
 }
 System.out.println("Number of odd elements is: "+odd);
 System.out.println("Number of odd elements is: "+even);
 
}
}
