package Array;

import java.util.Scanner;

public class InsertAtLocation
{
    public static void main( String [] args)
    {
        Scanner reader = new Scanner(System.in);
        int [] a = {1,2,3,4,5};
        System.out.println("Enter location to insert element");
        int location = reader.nextInt();
        System.out.println("Enter element to insert");
        int element = reader.nextInt();
        int length = a.length;
        int [] b = new int[length+1];
        for(int i=length;i>=0;i--)
        {
            if (i==location-1)
            {
                b[location-1] = element;
            }
            else if (i<location)
            {
                b[i]=a[i];
            }
            else
            {
                b[i] = a[i-1];
            }

        }

        for (int i : b) {
            System.out.println(i);
        }
    }
}
