import java.util.Arrays;
import java.util.Scanner;

public class ReadStringArray 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        String[] stringArray = new String[numStrings];

        for (int i = 0; i < numStrings; i++) 
        {
            System.out.print("Enter string " + (i + 1) + ": ");
            stringArray[i] = scanner.next();
        }
        System.out.println(Arrays.toString(stringArray));
    }
}