import java.util.Scanner;  //scanner is imported from util package

public class retail_mart
{
	public static void main(String args[])
	{
		System.out.println("Hello Welcome to SRI Mart");  //to display data to user
		System.out.println("Available items"); //to display data to user
		System.out.println("1.SUGAR-1kg-Rs50"+"\n"+"2.RICE-1kg-Rs1500"+"\n"+"3.OIL-1kg-Rs500"+"\n"+"4.GROUNDNUTS-1kg-Rs100"+"\n"+"5.SALT-1kg-Rs30"+"\n"+"0.EXIT"); // to display data to user
		
		boolean isExit =false; // to exit from the while loop 
		int i=1;		//to intilaize i value
		int sum=0;	 //to get final bill sum is intialized
		while(i!=0)		//infinite while is initiated to avoid limited conditions 
		{

			Scanner sc=new Scanner(System.in); // to read user input values

			System.out.println("enter purchasing item code");	// to display msg to user
			int code=sc.nextInt(); // to read user input integer value as code
			
			i++;		// for while loop to continue iteration  is implemented

			switch(code)	//switch is used to check code entered by the user and to check different cases
			{
				case 1: {System.out.println("enter quantity"); // to display msg to user
					int qty=sc.nextInt();		 // to read user input integer value as quantity
					int price=50;			// price is intialized
					int sum1 =price*qty;		// Airthmetic operation is performed
					System.out.println("sugar"+"--"+price+"*"+qty+"="+sum1);
					sum=sum1;break;}  // sum is displayed to user and case break
				        

				case 2: {System.out.println("enter quantity");// to display msg to user
					int qty=sc.nextInt();		 //to read user input integer value as quantity
					int price=1500;			// price is intialized
					int sum2 =price*qty;		// Airthmetic operation is performed
					System.out.println("rice"+"--"+price+"*"+qty+"="+sum2);
					sum=sum+sum2;break;}	 //sum is displayed to user and case break
				        

				case 3: {System.out.println("enter quantity");// to display msg to user
					int qty=sc.nextInt();		 //to read user input integer value as quantity
					int price=500;			//price is intialized
					int sum3 =price*qty;		// Airthmetic operation is performed
					System.out.println("oil"+"--"+price+"*"+qty+"="+sum3);
					sum=sum+sum3;break;}	 // sum is displayed to user and case break
				        

				case 4: {System.out.println("enter quantity"); // to display msg to user
					int qty=sc.nextInt();		 // to read user input integer value as quantity
					int price=100;			// price is intialized
					int sum4 =price*qty;		// Airthmetic operation is performed
					System.out.println("groundnuts"+"--"+price+"*"+qty+"="+sum4);
					sum=sum+sum4;break;}	 // sum is displayed to user and case break
				        

				case 5: {System.out.println("enter quantity"); // to display msg to user
					int qty=sc.nextInt();		 // to read user input integer value as quantity
					int price=30;			// price is intialized
					int sum5 =price*qty;		//Airthmetic operation is performed
					System.out.println("salt"+"--"+price+"*"+qty+"="+sum5);
					sum=sum+sum5;break;}	 // sum is displayed to user and case break
				        

				case 0:{isExit = true;break;} //to break from switch cases and to check if condition 
				default:{System.out.println("Please enter available items");break;} //default case if user input code is not valid
			}
			if(isExit){		//to break while loop and to give final sum
					break;
				  }
			
		}
			System.out.println("your total amount is   "+sum);	// total bill is displayed to user		
	}
}