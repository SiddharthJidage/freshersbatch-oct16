package Assignment4;

import java.util.Scanner;
class SavingAcc
{
    static void Excep() throws IllegalAccessException
    {
        double balance = 0, depositAmount, withdrawAmount;

        Scanner Depos=new Scanner(System.in);
        System.out.println("Enter Deposit an amount");
        depositAmount =Depos.nextInt();
        balance += depositAmount;

        Scanner Wd=new Scanner(System.in);
        System.out.println("Enter Withdraw an amount ");
        withdrawAmount=Wd.nextInt();
        balance -= withdrawAmount;

        if (balance<0&&withdrawAmount>balance)
        {
            throw new IllegalAccessException();
        }
        else
            System.out.println("SUCCESSFULLY WITHDRAWN : "+withdrawAmount);
        System.out.println("ACCOUNT FINAL BALANCE: "+balance);
    }

    public static void main(String args[])
    {

        try {
            Excep();
        }
        catch(IllegalAccessException e) {
            System.out.println("INSUFFICIENT BALANCE  ");
        }
    }
}