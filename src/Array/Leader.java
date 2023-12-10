package Array;

public class Leader
{
    public static void main(String[] args)
    {
        int [] ipt = {7,10,4,10,6,5,2};
        for(int a : ipt)
        {
            boolean flag = false;
            for( int i = a+1; i< ipt.length; i++)
            {

                if(ipt[a]>=ipt[i])
                {
                    flag = true;
                    break;
                }
            }
            if(flag == true)
                System.out.println(a);
        }
    }
}
