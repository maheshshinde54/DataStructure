package Array;
//THis incomplete solution. If first number is the largest loop never enter to change second large element

public class SecondLargestElement
{
    public static void main(String [] args)
    {
        int [] a = {100,29,36,36,50};
        int largnumber =a[0], secondlarge = a[1];
        for (int j =1;j<a.length ; j++)
        {
            if (j > largnumber)
            {
                secondlarge = largnumber;
                largnumber = j;
            }
        }
        if (secondlarge == largnumber)
        {
            System.out.println("No 2ed large element");
        }
        else
        {
            System.out.println(secondlarge);
        }
    }
}

