package String;
//TO be completed
public class Subsequence
{
    public boolean checkSubsequence(String ip)
    {
        String s ="mahesh";
        int j = 0;
        for(int i = 0; i<ip.length();i++)
        {
            if(s.charAt(i)==ip.charAt(j))
            {
                j++;
            }

        }
        return false;
    }
}
