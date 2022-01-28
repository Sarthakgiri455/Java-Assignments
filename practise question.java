import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

class Account{
    private double balance;
    private ArrayList<String>enquire;
    Account(){
        balance=0;
    }
    Account(double balance)
    {
        if(balance<=0)
        {
            this.balance=0;
            System.out.println("Invalid balance details");
            
        }
        else{
            this.balance=balance;
            enquire=new ArrayList<String>();
        }
        
    }
    void credit(double amount)
    {
        this.balance+=amount;
        enquire.add("amount credited:"+amount);
        
        
    }
    void debit(double amount)
    {
        if(amount<=this.balance)
        {
            this.balance-=amount;
            enquire.add("debit successful");
        }
        else{
            System.out.println("Debit amount exceeded balance");
            enquire.add("Insufficient funds!");
        }
        
        
    }
    double getbalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
        enquire.add("Setting new balance as + "+balance);
    }
    public void enquiry()
    {
        for(String s:enquire)
        {
            System.out.println(s);
        }
    }
    
    
    
}
class SavingsAccount extends Account{
    private double rate;
    SavingsAccount(double balance, double rate)
    {
        super(balance);
        this.rate=rate;
    }
    SavingsAccount()
    {
        super();
    }
    SavingsAccount(double balance)
    {
        super(balance);
        
    }
    
    public double calculateInterest()
    {
        double a= this.getbalance();
        double rate=this.rate;
        return a*rate;
    }
}
class CheckingAccount extends Account{
    private double  fee;
    CheckingAccount(double balance, double fee)
    {
        super(balance);
        this.fee=fee;
    }
    public void debit(double amount){
        if((amount+this.fee)<=this.getbalance())
        {
            this.setBalance(this.getbalance()-this.fee);
        }
        else{
            System.out.println("Insufficient Funds");
            
        }
    }
    public void credit(double amount)
    {
           
        double a= this.getbalance()+amount-this.fee;
        this.setBalance(a);
        
    }
}


public class Main {

    public static void main(String[] args)
    {
        SavingsAccount Ram=new SavingsAccount(-7, 0.5);
        SavingsAccount Shyam=new SavingsAccount(10000, 0.02);
        Shyam.credit(5000);
        Shyam.debit(1000000);
        Shyam.enquiry();
        
    }
    
    
}
