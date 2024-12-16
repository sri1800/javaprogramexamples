import java.util.*;
class secondlargestinarray
{
    public static void main(String args[]){
        int a[]={5,4,6,8};
        int n=a.length;
        Arrays.sort(a);
        System.out.println("Second largest "+a[n-2]);
    }
}