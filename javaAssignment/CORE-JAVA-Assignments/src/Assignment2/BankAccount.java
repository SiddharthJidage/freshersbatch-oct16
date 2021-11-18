package Assignment2;

class Bank{

    void totalMoneyInBank()
    {
        System.out.println("Employee's incremented salary is :" );

    }
}
class SavingAcoount extends Bank{
    float fixedDeposits =50000;
	public float cashCredit;
    void totalMoneyInBank()
    {
        System.out.println("Balance in savings account :" +((fixedDeposits)));
    }
}
class CurrentAcccount extends SavingAcoount{
    double cashCredit=1000;
    void totalMoneyInBank()
    {
        System.out.println("The  balance in current account "+(cashCredit));


    }
}
public class BankAccount
{
    public static void main(String args[]){

        CurrentAcccount CA=new CurrentAcccount();
        SavingAcoount SA=new SavingAcoount();


        // based on an object it decides which class account method to be execute
        CA.totalMoneyInBank(); 
        SA.totalMoneyInBank(); 
        
        //displays total salary 
        System.out.println("Total money in the bank  is "+( CA.fixedDeposits+SA.cashCredit)); 

    }
}