package Array;

public class CheckSortedArray
{

    public static void main(String[] args) {
        int[] a = {100, 20, 36, 36, 50};
        boolean mark = false;

        for (int i = 1; i < a.length; i++)
        {
            mark = a[i] >= a[i - 1];

        }
//        for(int i = 1; i < n; i++)
//        {
//            if(arr[i] < arr[i - 1])
//                return false;
//        }
//
//        return true;
        System.out.println(mark);
    }

}



