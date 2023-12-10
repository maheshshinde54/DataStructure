package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramCheck
{
    public static void main(String[] args)
    {
        String s1 = "aabc";
        String s2 = "caba";
        if(s1.length()!=s2.length())
        {
            System.out.println("String are not Anagram");
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.toString(a1).equals(Arrays.toString(a2)))
        {
            System.out.println("String are Anagram");
        }
        else
        {
            System.out.println("String are not Anagram");
        }
    }
}
