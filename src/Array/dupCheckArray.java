package Array;
// incomplete implementation. Return duplicate number of duplicate element in k and array without duple
import java.util.Arrays;

public class dupCheckArray
{


    public static void main(String[] args) {
        dupCheckArray d1= new dupCheckArray();
        d1.chekDup();
    }

    private void chekDup()
    {
        //int[]a={0,0,0,1,1,1,2,2,3,3,3};
        int[] a = {10, 20, 36, 36, 50};
        int[]b=new int[a.length];
        b[0]=a[0];
        System.out.println("Before Array"+ Arrays.toString(a));
        int k=1;
        for (int i=1;i<a.length;i++)
        {
            if(b[k-1]!=a[i])
            {
                b[k]=a[i];
                k++;
            }
        }
        System.out.println(k+" common  "+"array"+ Arrays.toString(b));

    }
}
