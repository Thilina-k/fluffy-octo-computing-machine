import java.util.Scanner;

//tutorial 6 question 2

public class account{
    String holderName;
    int accountNumber;
    double currentBalance;
    String accountType;

    public account() {
        accountNumber = 1565;
        currentBalance = 100000;
        accountType = "current account";
        holderName = "Mr.Perera";
    }

    void depositMoney() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("enter the amount you want to deposit: ");
        int depositamount = myScanner.nextInt();
        System.out.println("Current account balance is: "+(currentBalance+depositamount));
        currentBalance = currentBalance+depositamount;
    }

    void withdrawMoney() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("enter the amount you want to withdraw: ");
        int withdrawamount = myScanner.nextInt();
        System.out.println("Current account balance is: "+(currentBalance-withdrawamount));
    }

    void displayAccountDetails() {
        System.out.println("account holder's name is "+ holderName);
        System.out.println("account type is "+ accountType);
        System.out.println("account number is "+ accountNumber);
    }


    public static void main(String []args){
        account myAcc = new account();
        myAcc.depositMoney();
        myAcc.withdrawMoney();
        myAcc.displayAccountDetails();
    }
}
