package String;

import java.sql.SQLOutput;

public class Palindrome
{
    public static void main(String[] args)
    {
        String s1 ="abwba";
        /*StringBuffer s2 =new StringBuffer(s1);
        s2.reverse();
        if(s1.equals(s2.toString()))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");

         */
        //Alternative Approch
        int begine = 0;
        int end = s1.length()-1;
        boolean flag = true;
        while (begine<=end)
        {
            if (s1.charAt(begine)!=s1.charAt(end))
            {
                flag = false;
                break;
            }
            begine++;
            end--;
        }
        if (flag == false)
        {
            System.out.println("String is not Palindrome");
        }
        else
        {
            System.out.println("String is Palindrome");
        }
    }
}
