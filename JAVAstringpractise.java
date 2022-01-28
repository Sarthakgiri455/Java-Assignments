//TAKE A STRING AND ADD LAST CHARACTER AT END AND FRONT
//RETURNING NEW STRING WHERE FIRST AND LAST CHARACTERS ARE INTERCHANGED

public class Main
{
 public static Scanner scanner=new Scanner(System.in);
public static void main(String[] args) {
 
 System.out.println("**********QUESTION NUMBER 1. A. ********");
 //get string from user
 System.out.println("Enter a string ");
 String s1=scanner.nextLine();
 int m=s1.length();
 String s2=s1.charAt(m-1)+s1+s1.charAt(m-1);
 System.out.println("Taking the last char and returning a new string with the last char 
added at the front and back:: "+s2);
 //CODE FOR QUESTION NUMBER 1B.
 char temp=s1.charAt(0);
 char mmm=s1.charAt(m-1);
 String mnop=s1.substring(1, m-1);
 String final2=mmm+mnop+temp;
 System.out.println("**********QUESTION NUMBER 1. B. ********");
 System.out.println("Returning a new string where the first and last chars have been 
exchanged "+final2); 
}
