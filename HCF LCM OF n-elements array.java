//Java program for HCF and LCM of n -elements array

import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Number of numbers");
int p=sc.nextInt();
int numbers[]=new int[p];
int smallest=99999;
int biggest=-9999;
for(int q=0;q<p;q++)
{
int m=sc.nextInt();
numbers[q]=m;
if(m<smallest)
{
smallest=m;
}
if(m>biggest)
{
biggest=m;
}
}
int hcf=1;
int [] divisors;
divisors= printDivisors(smallest);
for(int x : divisors)
{
int qq=1;
if((x==0))
{
break;
}
for(int q: numbers)
{

if( (q%x)!=0)
{
qq=0;
break;
}
}
if((qq==1))
{
System.out.println("HCF iS : "+x);
break;

}
}
boolean b=true;

for(int j=biggest;j<999999;j++)
{
int q=1;
for(int x:numbers)
{

if((j%x)!=0)
{
q=0;
break;


}
}
if((q==1))
{
System.out.println("LCM is"+ j);
break;
}

}
}
public static int[] printDivisors(int n)
{
int array[]=new int[30];
int count=0;

for(int i=1; i*i <= n; i++)
{
if(n % i == 0)
{
array[count]=i;
count++;



if(i != n / i)
array[count]=(n/i);
count++;

}
}
for(int m = 0; m< count; m++){
for(int j = 0; j < count - m- 1; j++){

if( array[j] <array[j + 1]){
// swapping
int temp = array[j];
array[j] = array[j+1];
array[j+1] = temp;

}
}
}
return array;

}


}
