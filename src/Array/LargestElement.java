package Array;

public class LargestElement
{
    public static void main(String [] args)
    {
        int [] a = {100,29,36,4,50};
        int largenumber = 0;
        for (int j : a)
        {
            if (j > largenumber)
            {
                largenumber = j;
            }
        }
        System.out.println(largenumber);
    }
}
