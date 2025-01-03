
import java.util.Scanner; // Import should be at the top of the file

class ConvertSentencetoCamelCase 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Read the number of test cases
        sc.nextLine();        // Consume the newline character after reading the integer

        while (t-- > 0) {
            String s = sc.nextLine(); // Read the input string

            // Remove surrounding quotes from the string
            String str = s.substring(1, s.length() - 1);

            Solution obj = new Solution(); // Create an object of the Solution class
            String ans =
                obj.convertToCamelCase(str); // Convert the sentence to Camel Case

            // Print the result with surrounding quotes
            System.out.println("\"" + ans + "\"");
            System.out.println("~");
        }
        sc.close();
    }
}

class Solution 
{
    
    public String convertToCamelCase(String s) 
    {
       
        StringBuilder sb=new StringBuilder();
        
        boolean x=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                x=true;
            }
            else if(x)
            {
                 sb.append(Character.toUpperCase(s.charAt(i)));
                 x=false;
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        
        
    }
}