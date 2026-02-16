import java.util.*;
public class Anagram_Count{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		String p=scan.next();
		System.out.print(anagarm(s,p));
	}
	public static int anagarm(String s,String p)
	{
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		int count=0;
		for(int i=0;i<p.length();i++)
			freq1[p.charAt(i)-'a']++;
		for(int i=0;i<s.length();i++)
		{
			freq2[s.charAt(i)-'a']++;
			if(i>=p.length())
				freq2[s.charAt(i-p.length())-'a']--;
			if(Arrays.equals(freq1,freq2))
					count++;
		}
		return count;
	}
}
// aaaaa , aa -> 4