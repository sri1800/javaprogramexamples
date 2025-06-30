package Email_Application;

import java.util.Scanner;

public class New_employee extends Email {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Sri.It.Solutions");
		
		Scanner sc=new Scanner(System.in);
		Email e1=new Email();
		
		System.out.println("Enter your firstname");
		String firstname=sc.nextLine();
		e1.firstname(firstname);
		
		System.out.println("Enter your lastname");
		String lastname= sc.nextLine();
		e1.lastname(lastname);
		
		System.out.println("Select your department \n 1.Sales \n 2.Development \n 3.Accounting \n 0.None");
		int deptCode=sc.nextInt();
		String department=e1.departments(deptCode);
		System.out.println("Your choice of department is:"+department);
		
		String EmpEmail=e1.newemail();
		System.out.println("Your Company email id is:"+EmpEmail);
		String password=e1.randpassword(10);
		System.out.println("Your password is:"+password);
		
		System.out.println("Set your MailCapacity");
		int mailcap=sc.nextInt();
		e1.mailcap(mailcap);
		
		sc.nextLine();
		System.out.println("Enter your new password to change old password");
		String userpwd= sc.nextLine();
		String NewPwd=e1.altpwd(userpwd);
		System.out.println("Your new password is:"+NewPwd);
		
		System.out.println("Enter your alternate Email");
		String altemail= sc.nextLine();
		String NewEmail=e1.altEmail(altemail);
		System.out.println("Your new email id is:"+NewEmail);
	
		sc.close();
		
	}

}
