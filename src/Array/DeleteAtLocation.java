package Array;

import java.util.Arrays;
import java.util.Scanner;
public class DeleteAtLocation
{
    public static void main( String [] args)
    {
        Scanner reader = new Scanner(System.in);
        int [] a = {1,2,3,4,5};
        System.out.println("Enter element to delete");
        int element = reader.nextInt();
        int length = a.length;
        int [] b = new int[length-1];
        for (int i = 0, k = 0; i<length; i++)
        {
            if(a[i]!=element)
            {
               b[k]=a[i];
               k++;
            }
        }
        System.out.println(Arrays.toString(b));

    }
}
