
import java.util.*;


public class QueueandStack 
{
    Stack<Character> s=new Stack<>();
    Queue<Character> q=new LinkedList<>();
    public void pushCharacter(char ch)
    {
        s.push(ch);
    }
    public char popCharacter()
    {
        char x=s.pop();
        return x;
    }
    public void enqueueCharacter(char cha)
    {
        q.add(cha);
    }
    public char dequeueCharacter()
    {
        char y=q.remove();
        return y;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();


        char[] s = input.toCharArray();

        Solution p = new Solution();

        for (char c : s) {
            p.pushCharacter(c);
            p.pushCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.popCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}