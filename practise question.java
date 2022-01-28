/*
)Create an inheritance hierarchy in java using following information given below that a bank 
might use to represent customers’ bank accounts. 
Base class Account should include one data member of type double to represent account balance. 
The class should provide constructor that receives an initial balance and uses it to initialize the 
data member. The constructor should validate the initial balance to ensure that it is greater than 
or equal to 0.If not the balance is set to 0.0 and the constructor should display an error message 
indicating that the initial balance was invalid. The class also provides three member functions 
credit, debit (debit amount should not exceed the account balance) and enquiry. Derived class 
SavingsAccount should inherit the functionality of an Account, but also include data member of 
type double indicating the interest rate assigned to the Account. SavingsAccount constructor 
should receive the initial balance, as well as an initial value for SavingsAccount’s interest rate. 
SavingsAccount should provide public member function calculateInterest that returns double 
indicating the amount of interest earned by an account. The method calculateInterest should 
determine this amount by multiplying the interest rate by the account balance. SavingsAccount 
function should inherit member functions credit, debit and enquiry without redefining them. 
Derived class CheckingAccount should inherit the functionality of an Account, but also include 
data member of type double that represents the fee charged per transaction. CheckingAccount 
constructor should receive the initial balance, as well as parameter indicating fee amount. Class 
CheckingAccount should redefine credit and debit function so that they subtract the fee from 
account balance whenever either transaction is performed. CheckingAccount’s debit function 
should charge a fee only if the money is actually withdrawn (debit amount should not exceed the 
account balance).
*/





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
