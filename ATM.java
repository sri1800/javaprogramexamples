import java.util.*;
public class ATM

{
public static void main(String args[])
{
System.out.println("Welcome to SBI ATM");
System.out.println("Insert your DEBIT CARD");
System.out.println("Select the Option");
System.out.println("1. Balance Enquiry");
System.out.println("2. Change ATM Pin");
System.out.println("3. Deposit Money");
System.out.println("4. Withdraw Money");
System.out.println("5. Mini Statement");
System.out.println("0. EXIT");

boolean isExit = false;
int balance = 5000;
while(1!=0)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Option");
int Option = sc.nextInt();

switch(Option)
{
case 1:{
System.out.println("Enter yor PIN Number");
int PIN = sc.nextInt();
System.out.println("Display Balance : " + balance);
System.out.println("Transaction completed");
break; }

case 2:{ System.out.println("Enter Account Number");
int Account_Number = sc.nextInt();
System.out.println("Enter Recevied OTP to Mobile number");
int OTP = sc.nextInt();
System.out.println("Enter New PIN");
System.out.println("Transaction completed");
break;}


case 3:{ System.out.println("Enter your PIN Number");
int PIN= sc.nextInt();
System.out.print("Enter amount to deposit: ₹");
                    int depositAmount = sc.nextInt();
                    balance += depositAmount;
                    System.out.println("₹" + depositAmount + " has been deposited successfully.");
System.out.println("Your updated balance is: ₹" + balance);
System.out.println("Transaction completed");
break;}

case 4:{
System.out.println("Enter your PIN number");
int PIN = sc.nextInt();
System.out.print("Enter amount to withdraw: ₹");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Please collect your cash: ₹" + withdrawAmount);
                        System.out.println("Your updated balance is: ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
System.out.println("Collect the cash");
System.out.println("Transaction completed");
break;}

case 5:{ System.out.println("Enter your PIN number");
int PIN = sc.nextInt();
System.out.println("Print the statement");
System.out.println("Transaction completed");

break;}


case 0:{ isExit = true;break;}

default : { System.out.println("Select the listed options only");
break;}
}
if(isExit){
break;}
}

System.out.println("THANK YOU");
System.out.println("VISIT AGAIN");


}
}