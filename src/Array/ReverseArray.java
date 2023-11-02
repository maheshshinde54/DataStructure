package Array;

import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int[] a = {10, 20, 30, 40,50};
        System.out.println(Arrays.toString(a));
        int j=a.length-1;
        int temp;
        for (int i = 0; i <= j; i++)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }


}
