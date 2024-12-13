//4.1 The following code results in compile time error. Identify the error. 

public static void display()
{
	int x = 123456;
	float f = 100.12; 
	System.out.println("Float Value = "+ f); 
}

A)Every float value should be intiliazed along with f like 10.52f
public static void display()
{
	int x = 123456;
	float f = 100.12f;
	System.out.println("Float Value = "+ f); 
}


//4.2 The following code results in compile time error. Identify the error. 

public static void display(x)
{ 
	int y;
	if (x > 10)
	{
		Y = X;
	}
	System.out.println("Val ue of Y = " + y);
}

A)Java is a case sensitive language so that must check cases while intilizing and calling
public static void display(int x)
{ 
	int y=0;
	if (x > 10)
	{
		y = x;
	}
	System.out.println("Val ue of Y = " + y);
}




//4.3 What modification should be done to the following code so that the value of the variable pie is not modifiable? 

public static void calculate() 
{  
float pie = 3.14f; 
System.out.println("Value of Pie = " + pie); 
}

A) final keyword is used 
public static void calculate() 
{  
final float pie=3.14f;
System.out.println("Value of Pie = " + pie); 
}


//4.4 The following code results in compile time error while storing the values of int variable to a byte variable. Identify the problem with the code and provide the solution.

public static void convert()
{
int i = 1245;
byte b = i ;
System.out.println("Value of Byte Variable b = " + b);
}
 
A)type casting is used
public static void convert()
{
int i = 1245;
byte b = byte(i);
System.out.println("Value of Byte Variable b = " + b);
}
 

//4.5 Identify the error in the following code.

Class Scope
{
	public static void main (string args[ ])
	{
		int m = 10;
			{
				int m = 20;
			} 
	}
}

A) string should have capital s String
