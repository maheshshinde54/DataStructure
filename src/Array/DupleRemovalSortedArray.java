package Array;

import java.util.Arrays;

public class DupleRemovalSortedArray
{
    public static void main(String[] args)
    {
        int[] a = {10, 20, 36, 36, 50};
        int count = 0;
        for (int i = 1;i<a.length;i++)
        {
            for(int j = i+1;j<a.length-1;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]=a[i+2];
                    count++;
                }
            }

        }
        System.out.println(Arrays.toString(a));
        System.out.println(count);
    }
}
