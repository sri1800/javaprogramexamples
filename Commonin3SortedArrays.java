import java.util.*;
class Commonin3SortedArrays
{
    public static void main(String args[])
    {
        /*Scanner sc=new Scanner(System.in);
        for(int t=0;t<3;t++)
        {
        if(t==0){
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter"+(n)+" array values from 1");
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();  
        }
        Arrays.sort(a);
        System.out.println("a "+Arrays.toString(a));
        }
        if(t==1){
            System.out.println("Enter size of an array");
            int n=sc.nextInt();
            System.out.println("Enter"+(n)+" array values from 1");
            int[]b=new int[n];
            for(int i=0;i<n;i++)
            {
                b[i]= sc.nextInt();  
            }
            Arrays.sort(b);
            System.out.println("b "+Arrays.toString(b));
            }
            if(t==2){
                System.out.println("Enter size of an array");
                int n=sc.nextInt();
                System.out.println("Enter"+(n)+" array values from 1");
                int[]c=new int[n];
                for(int i=0;i<n;i++)
                {
                    c[i]= sc.nextInt();  
                }
                Arrays.sort(c);
                System.out.println("c "+Arrays.toString(c));
                }
        }*/
        int []a={1,5,6,4};
        int n=a.length;
        Arrays.sort(a);
        System.out.println("a "+Arrays.toString(a));
        int []b={5,8,9,4};
        int m=b.length;
        Arrays.sort(b);
        System.out.println("b "+Arrays.toString(b));
        int[]c={2,3,5,4};
        int o=c.length;
        Arrays.sort(c);
        System.out.println("c "+Arrays.toString(c));
        int value=0;
        while(1>0)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<o;k++)
                {
                    if((a[i]==b[j])&&(b[j]==c[k]))
                    {
                        System.out.println(a[i]); 
                        value=1;
                    }
                }
            }
        }
        if(value==0)
        {
            System.out.println("-1"); 
            break;
        }
        else
        {
            break;
        }
        }

    }
}


        