import java.util.*;
import java.io.*;
public class Main
{

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String x=sc.next();
int[] arr=new int[x.length()];
String[]hexa=new String[x.length()];
String[]binary=new String[x.length()];
for(int j=0;j<x.length();j++)
{
int m=x.charAt(j);
arr[0]=m;
String hexa2=Integer.toHexString(m);
String binary2=Integer.toBinaryString(m);
hexa[j]=hexa2;
binary[j]=binary2;
}

System.out.println("BINARY REPRESENTATION OF EACH CHARACTER OF STRING");
System.out.println(Arrays.toString(binary));
System.out.println("HEXADECIMAL REPRESENTATION OF EACH CHARACTER OF STRING");
System.out.println(Arrays.toString(hexa));






}
}
