import java.util.*;
public class LongestCharRep{
	public static int characterReplacement(String s, int k) {
        int l=0,r=0,maxlen=0,maxf=0;
        int[] hash=new int[26];
        while(r<s.length())
        {
            char c=s.charAt(r);
            hash[c-'A']++;
            maxf=Math.max(maxf,hash[c-'A']);
            if((r-l+1)-maxf>k)
            {
                char ch=s.charAt(l);
                hash[ch-'A']--;
                l++;
            }
            if((r-l+1)-maxf<=k)
                maxlen=Math.max(maxlen,(r-l+1));
            r++;
        }
        return maxlen;
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		int k=scan.nextInt();
		System.out.println(characterReplacement(s,k));
	}
}