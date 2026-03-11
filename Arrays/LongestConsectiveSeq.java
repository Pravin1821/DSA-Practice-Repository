import java.util.*;
public class LongestConsectiveSeq{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.print(LongestSeq(a));
	}
	public static int LongestSeq(int[] a)
	{
		Set<Integer> set = new HashSet<>();
		for(int i:a)
			set.add(i);
		int c=0;
		for(int i:a)
		{
			if(!set.contains(i-1))
			{
				int max=1;
				while(set.contains(i+max))
					max++;
				c=Math.max(c,max);
			}
		}
		return c;
	}
}