# Java-Assignments
Create an inheritance hierarchy in java using following information given below that a bank 
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
account balance).After defining the class hierarchy, write program that creates object of each 
class and tests their member functions. Add interest to SavingAccount object by first invoking its 
calculateInterest function, then passing the returned interest amount to object’s credit function


Solution to this problem in Java program
