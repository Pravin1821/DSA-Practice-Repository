import java.util.*;
public class LongSub340{
	public static int LongestSubStr(String s,int k) {
        Map<Character,Integer> hm = new HashMap<>();
        int max=0,l=0;
        for(int i=0;i<s.length();i++)
        {
			char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(hm.size()>k)
            {
                char v=s.charAt(l);
                hm.put(v,hm.get(v)-1);
                if(hm.get(v)==0)
                    hm.remove(v);
                l++;
            }
			if(hm.size()<=k)
				max = Math.max(max,(i-l+1));
        }
        return max;
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		int k=scan.nextInt();
		System.out.println(LongestSubStr(s,k));
	}
}