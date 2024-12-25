
import java.io.*;
import java.util.*;

class Node
 {
    int data;
    Node next=null;

    Node(int x) 
    {
        data = x;
        next = null;
    }
}

class MiddleofaLinkedList 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no quereies");
        int t = Integer.parseInt(read.readLine());
        while (t > 0) 
        {
            System.out.println("Enter list values with single space");
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) 
            {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution g = new Solution();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            t--;
        
            System.out.println("~");
        }
    }
}

class Solution 
{
    int getMiddle(Node head) 
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
