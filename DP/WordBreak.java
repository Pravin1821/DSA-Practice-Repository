import java.util.*;
public class WordBreak{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = "leetcode";
		String[] wordDist = {"leet","code"};
		System.out.print(wordBreak(s,wordDist));
	}
	public static boolean wordBreak(String s, String[] wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=1;i<=s.length();i++)
        {
            for(String j:wordDict)
            {
                int st=i-j.length();
                if(st>=0 && dp[st] && s.substring(st,i).equals(j))
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}