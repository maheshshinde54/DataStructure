package Serching;

public class BinerySearch
{
    public int serch(int var)
    {
        int [] ipt = {7,10,4,10,6,5,2};
        for( int i=0 ; i<ipt.length ; i++)
        {
            if (var == ipt[i])
            {
                System.out.println(i);
                return i;

            }


        }

        return -1;
    }

    public static void main(String[] args) {
        BinerySearch call = new BinerySearch();
        call.serch(6);
    }
}
