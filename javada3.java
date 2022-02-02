/*
Hyundai car show room sells the cars in weekly basis. It has a sales module to perform the sale of a car. The functionality of the sales module are
New sale order function performs the input activity like getting the details of car( Model, Color, Engine Type, Fuel Type, Price)
Authorize function check the payment (Should be greater than 50 percent of unit price) made by the user and approves the sale order and calls the other function called order processing.
Order processing function check the stock for availability of the car and prints the delivery order(format given below) or other wise it will prints the production order (format given below).







*/

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class salesofcar{
 private String Model;
 private String Color;
 private String Enginetype;
 private String FuelType;
 private double unitPrice;
 private double payment;
 private String Ownername;
 private String Branchname="Sipradi Tradings";
 private String showroom="balkumari";
 int stockleft;
 
 //USE OF CONSSTRUCTORS
 //storing record of car, its unit price and all the info 
 salesofcar(String Model, String Color, String Enginetype, 
String FuelType,double unitPrice)
 {
 System.out.println("ENter Branch and Showroom 
address");
 Scanner sc=new Scanner(System.in);
 this.Branchname=sc.next();
 System.out.println("branch address ");
 
 this.showroom=sc.next();
 this.Model=Model;
 this.Color=Color;
 this.Enginetype=Enginetype;
 this.FuelType=FuelType;
 this.unitPrice=unitPrice;
 System.out.println("ENter stock left");
 
 
 this.stockleft=sc.nextInt();
 
 
 
 }
 salesofcar()
 {
 System.out.println("ENter Branch and Showroom 
address");
 Scanner sc=new Scanner(System.in);
 this.Branchname=sc.next();
 System.out.println("branch address ");
 
 this.showroom=sc.next();
 
 
 }
 void saleorder()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("ENTER THE FEATURES OF CAR 
THAT YOU WOULD WANT TO PURCHASE");
 System.out.println("MODEL:");
 this.Model=sc.next();
 System.out.println("COLOR:");
 this.Color=sc.next();
 System.out.println("ENGINE:");
 this.Enginetype=sc.next();
 System.out.println("FUEL:");
 this.FuelType=sc.next();
 System.out.println("PRICE:");
 this.unitPrice=sc.nextDouble();
 System.out.println("ENter stock left");
 
 this.stockleft=sc.nextInt();
 }
 void authorize(double payment)
 {
 double a=unitPrice/2.0;
 if((payment>a))
 {
 System.out.println("Initial Payment approved");
 orderprocessing();
 }else{
 System.out.println("Not Sufficient Payment");
 }
 
 
 }
 void orderprocessing()
 {
 if((stockleft>0))
 {
 
 System.out.println("DELIVERY ORDER DONE");
 System.out.println("ENter owner name");
 Scanner sc=new Scanner(System.in);
 Ownername=sc.next();
 System.out.println();
 System.out.println();
 System.out.println("***************DELIVERY 
ORDER ************** ");
 System.out.print("Owner Name ");
 System.out.print("Car Model ");
 System.out.print("Color ");
 System.out.print("FuelType ");
 System.out.println("DeliveryDate ");
 System.out.print(Ownername+" ");
 System.out.print(Model+" ");
 System.out.print(Color+" ");
 
 System.out.print(FuelType+" ");
 DateFormat dateFormat = new 
SimpleDateFormat("dd/MM/yyyy");
 Date date = new Date(); 
 String dateToStr = dateFormat.format(date);
 System.out.println(dateToStr+" ");
 stockleft--;
 
 }
 else{
 System.out.println();
 System.out.println();
 System.out.println("***************Processing Order 
************** ");
 System.out.print("ProductionBranchName ");
 System.out.print("Showroomaddress ");
 System.out.print("Car Model ");
 System.out.print("EngineType ");
 System.out.println("DeliveryDate ");
 System.out.print(Branchname+" ");
 System.out.print(showroom+" ");
 System.out.print(Model+" ");
 
 System.out.print(Enginetype+" ");
 DateFormat dateFormat = new 
SimpleDateFormat("dd/MM/yyyy");
 Date date = new Date(); 
 String dateToStr = dateFormat.format(date);
 System.out.println(dateToStr+" ");
 stockleft--;
 
 }
 }
 
 
}
 
 
 
public class Main
{
public static void main(String[] args) {
 salesofcar i20=new salesofcar();
 i20.saleorder();
 i20.authorize(2000000);
 
 
 
 
}
}
