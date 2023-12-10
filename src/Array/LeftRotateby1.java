package Array;

import java.util.Arrays;

public class LeftRotateby1
{
    public static void main(String[] args)
    {
        int[] ipt = {10, 20, 36, 40, 50};
        int temp = ipt[0];
        int opt [] = new int[ipt.length];
        for( int a =0 ; a<ipt.length-1 ; a++)
        {
            opt[a]= ipt[a+1];
        }
        //By using copy fuctoion
        // System.arraycopy(ipt, 1, opt, 0, ipt.length - 1);
        opt[opt.length-1]=temp;
        System.out.println(Arrays.toString(opt));
    }
}
