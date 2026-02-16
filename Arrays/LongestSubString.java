import java.util.*;
public class LongestSubString{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		System.out.print(LongestLength(s));
	}
	public static int LongestLength(String s){
		if(s.length()==0)
			return 0;
		Set<Character> set = new HashSet<>();
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			while(set.contains(s.charAt(i)))
			{
				set.remove(s.charAt(i-set.size()));
				//System.out.print(set);
			}
			set.add(s.charAt(i));
			//System.out.print(set);
			max=Math.max(max,set.size());
		}
		return max;
	}
}
// abcabcbb -> 3
// ababc -> 3
// pwwkew -> 3