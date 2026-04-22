import java.util.*;
public class MaxSubStr{
	public static int maxLen(String s)
	{
		int[] hash = new int[256];
        int l=0,maxlen=0;
        Arrays.fill(hash,-1);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int asc=(int) ch;
            if(hash[asc]!=-1 && hash[asc]>=l)
                l=hash[asc]+1;
            hash[asc]=i;
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
		/*HashMap<Character,Integer> hm = new HashMap<>();
		int maxlen = 0,l=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(hm.containsKey(ch) && hm.get(ch)>=l)
				l=hm.get(ch)+1;
			hm.put(ch,i);
			maxlen=Math.max(maxlen,(i-l+1));
		}
		return maxlen;*/
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		System.out.println(maxLen(s));
	}
}