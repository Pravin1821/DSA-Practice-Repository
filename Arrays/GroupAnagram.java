import java.util.*;
public class GroupAnagram{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++)
			a[i]=scan.next();
		System.out.print(groupAnagram(a));
	}
	public static List<List<String>> groupAnagram(String [] a)
	{
		HashMap<String,List<String>> hm = new HashMap<>();
		for(String i:a)
		{
			char[] c=i.toCharArray();
			Arrays.sort(c);
			String k = new String(c);
			if(hm.containsKey(k))
				hm.get(k).add(i);
			else
			{
				hm.put(k,new ArrayList<>());
				hm.get(k).add(i);
			}
		}
		return new ArrayList<>(hm.values());
	}
}
// strs = ["eat","tea","tan","ate","nat","bat"]
// strs = ["a"]