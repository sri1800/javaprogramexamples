package array_medium;
import java.util.*;
import java.util.stream.IntStream;
class kthelementofcombinedarray
{
    public static void main(String args[]){
        int a[]={5,4,6,8};
        int b[]={1,3,6,9,11};
        int k=5;
        int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println("sorted" + Arrays.toString(result));
        System.out.println("kthelement in combined sorted "+result[k]);
    }
}