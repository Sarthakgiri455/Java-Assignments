import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;
class MaxcreditEXCEPTION extends Exception{
    
    static maxcredit=100000;
    
    MaxcreditEXCEPTION()
    {
        
        System.out.println("Max credit is "+maxcredit+" your credit amount exceeds the macimum");
    }
    public String toString()
    {
        return "ERROR: MAX CREDIT ALREADY REACHED";
    }
}
class MaxLoanEXCEPTION extends Exception{
    static maxloan=5000000;
    MaxLoanEXCEPTION()
    {
        
        System.out.println("Max loant is "+maxloan+" your loan amount exceeds the maximum");
    }
    public String toString()
    {
        return "ERROR: MAX LOAN ALREADY REACHED";
    }
    
}
class INSUFFICIENTFUNDEXCEPTION extends Exception{
    static minimumbalance=100000;
    INSUFFICIENTFUND()
    {
        
        System.out.println("Minimum  balance in Bank should be "+minimumbalance+" your balance will be less than minimum");
    }
    public String toString()
    {
        return "ERROR: BALANCE LESS THAN MINIMUM BALANCE IF WITHDRAW PROCEEDS";
    }

}
class Account{
    private String account_name;
    static minimum_balance=10000;
    private String account_number;
    private double balance;
    public ArrayList<String>BankStatements;
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
            BankStatements=new ArrayList<String>();
        }
        
    }
    void credit(double amount)
    {
        this.balance+=amount;
        BankStatements.add("amount credited:"+amount);
        
        
    }
    void debit(double amount)
    {
        try{
            
            if(this.balance-amount<=minimum_balance)
            {
                System.out.println("Debit amount cause balance to be less than minimumbalance");
                BankStatements.add("Insufficient funds!");
                INSUFFICIENTFUNDEXCEPTION e=new INSUFFICIENTFUNDEXCEPTION();
                
                throw e;
            }
            this.balance-=amount;
            BankStatements.add("Withdraw  successful");
            
        }
        catch(INSUFFICIENTFUNDEXCEPTION m){
            System.out.println(m);
        }
        
    }
    double getbalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
        BankStatements.add("Setting new balance as + "+balance);
    }
    public void printstatements()
    {
        for(String s:BankStatements)
        {
            System.out.println(s);
        }
    }
    
}
class LoanAccount extends Account{
    double LoanAmount=0;
    static max_loan=5000000;
    private String LoanDate;
    private double interestrate;
    ArrayList<String>loanstatements;
    double LoanInterestAmount;
    LoanAccount(double balance, double rate)
    {
        super(balance);
        this.interestraterate=rate;
        loanstatements=new ArrayList<String>();
        LoanAmount=0;
    }
    LoanAccount()
    {
        super();
        loanstatements=new ArrayList<String>(); 
        LoanAmount=0;
    }
    Loan(double balance)
    {
        super(balance);
        loanstatements=new ArrayList<String>();
        LoanAmount=0;
        
    }
    void takeloan(double loanammount)
    {
        
        try{
            if(this.LoanAmount+loanAmount>max_loan)
           {
               MaxLoanEXCEPTION d=new MaxLoanEXCEPTION();
               System.out.println("LOAN EXCEEDS MAX LOAN");
               BankStatements.add("LOAN UNSUCCESFULL");
               loanstatements.add("LOAN UNSUCCESSFUL");
               
               throw d;
            
           }
           System.out.println("LOAN WITHDRAW SUCCESSFULL");
           loanstatements.add("Loan Taken: "+"Rs. "+loanammount);
           BankStatements.add("Loan Taken: "+"Rs. "+loanammount);
           this.LoanAmount+=loanammount;
           
           
        }
        catch(MaxLoanEXCEPTION m){
             System.out.println(m);
        }
        
        
        
    }
    void clearloan(double loanammount)
    {
        
        this.LoanAmount-=loanammount;
        loanstatements.add("Loan Clearance Payment : "+"Rs. "+loanammount+" made successfuly");
        BankStatements.add("Loan Clearance Payment : "+"Rs. "+loanammount+" made successfuly");
    }
    
    public double calculateLoanInterest()
    {
        double a= this.loanammount();
        double rate=this.rate;
        this.LoanInterestAmount= a*rate;
        return LoanInterestAmount;
        
    }
    void clearloanInterest(double amount )
    {
        this.LoanInterestAmount-=amount;
        loanstatements.add("Loan Interest  Clearance Payment : "+"Rs. "+amount+" made successfuly");
        BankStatements.add("Loan Interest  Clearance Payment : "+"Rs. "+amount+" made successfuly");
        
    }
}
class CreditCard extends Account{
    public double  fee;
    double creditedamount;
    static maxcredit=1000000;
    public<ArrayList>
    CreditCard(double balance, double fee)
    {
        super(balance);
        this.fee=fee;
    }
    public void takecredi(double amount){
        try{
            
            
            if(creditedamount+=amount>maxcredit)
            {
                
            }
        }
        creditedamount+=amount;
        creditedamount+=this.fee;
    }
    public void clearcredit(double amount)
    {
        creditedamount-=amount;
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
