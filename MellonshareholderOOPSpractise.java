//Java program to implement shareholder service account OOPS practise
import java.util.*;
class shareholder{
 String tranID;
 String share_holder_name;
 String bankaccount_number;
 String dateofopen;
 double dividend_amount;
 double totalamount;
 double dividendrate=0.3;
 double shareBuy=100.0; double sharesell=150.0;
 double initialbankbalance;
 double finalbankbalance;
 int numberofshares;
 shareholder(String name, String bankaccount_number2, String date, double 
balance, int sharenumber){
 initialbankbalance=balance;
 dividend_amount=0;
 totalamount=balance;
 share_holder_name=name;
 dateofopen=date;
 bankaccount_number=bankaccount_number2;
 numberofshares=sharenumber;
 finalbankbalance=balance;
 }
 void sellshare(String ID, int number, double sellvalue, double buyvaule)
 {
 tranID=ID;
 shareBuy=buyvaule;
 sharesell=sellvalue;
 if((numberofshares)>=number)
 {
 numberofshares-=number;
 }
 finalbankbalance=finalbankbalance+Math.abs((sharesell-shareBuy))*number;
 
 
 }
 void sharebuy(String ID, int number, double sellvalue, double buyvaule)
 {
 tranID=ID;
 tranID=ID;
 shareBuy=buyvaule;
 sharesell=sellvalue;
 double x=Math.abs((sharesell-shareBuy))*number;
 if(finalbankbalance>=x)
 {
 numberofshares+=number;
 
 }
 finalbankbalance=finalbankbalance-Math.abs((sharesell-shareBuy))*number;
 }
 void dividendupdate(String presentdate)
 {
 String s=dateofopen;
 String[]arr=presentdate.split("/");
int x=Integer.parseInt(arr[2]);
String[]arr2=s.split("/");
int y=Integer.parseInt(arr2[2]);
int time=x-y;
double z=Math.pow(1.3, time);
double totaldividendsofar=initialbankbalance*z;
dividend_amount=totaldividendsofar;
finalbankbalance+=dividend_amount;
 }
 void bankstatus(){
 System.out.print("TranID ");
 System.out.print("ShholderName ");
 System.out.print("accountNumber ");
 System.out.print("accountopendate ");
 System.out.print("Sharesell Value ");
 System.out.print("Share buy value ");
 System.out.print("Dividendtotal ");
 System.out.println(" Account balance ");
 System.out.print(tranID+" ");
 System.out.print(share_holder_name+" ");
 System.out.print(bankaccount_number+" ");
 System.out.print(dateofopen+ " ");
 System.out.print(sharesell+" ");
 System.out.print(shareBuy+" ");
 
 System.out.print(String.format("%.2f",dividend_amount)+" ");
 System.out.println(String.format("%.2f",finalbankbalance)+ " ");
 
 }
}
public class Main
{
 public static void main(String[] args)
 {
 System.out.println("*******************MELON SHARE 
FIRM*******************");
 System.out.println();
 System.out.println();
 
 shareholder c=new shareholder("Ram ", "01002200", " 1/26/2022",50000.23, 
20);
 System.out.println("********initial status**********");
 System.out.println();
 
 c.bankstatus();
 System.out.println();
 c.sellshare("12", 5, 150.0, 200.0);
 System.out.println("*******final status after selling the share**********");
 System.out.println();
 c.bankstatus();
 
 System.out.println("******final status after buying the share********");
 System.out.println();
 c.sharebuy("15", 5, 150.0, 200.0);
 c.bankstatus();
 System.out.println();
 System.out.println("Adding dividend amount to 10 years from bank account 
opening");
 c.dividendupdate("1/26/2033");
 System.out.println();
 
 c.bankstatus(); 
}
}
