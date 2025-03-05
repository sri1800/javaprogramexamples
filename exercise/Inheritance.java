
import java.util.*;

class Person 
{
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	Person(String firstName, String lastName, int identification)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	public void printPerson()
	{
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person
{
	private int[] testScores;

    public Student(String firstName,String lastName,int idNumber,int[] testScores)
	{
        
        super(firstName,lastName,idNumber);
        this.testScores=testScores;
        
    }
    public char calculate()
    {
        char O='O',E='E',A='A',P='P',D='D',T='T';
        int sum=0;
        for(int i=0;i<this.testScores.length;i++)
        {
            sum+=this.testScores[i];
        }
        int avg=sum/this.testScores.length;
        if(90<=avg && avg<=100){return O;}
        else if(80<=avg && avg<90){return E;}
        else if(70<=avg && avg<80){return A;}
        else if(55<=avg && avg<70){return P;}
        else if(40<=avg && avg<55){return D;}
        else{return T;}
        
    }
}

class Inheritance 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++)
		{
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
		scan.close();
	}
}