import java.util.*;
public class TwoSumUnsort{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int t=scan.nextInt();
		TwoSum(a,t);
	}
	public static void TwoSum(int[] a,int t)
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(t-a[i]))
			{
				System.out.print(hm.get(t-a[i])+" "+i);
				return;
			}
			if(!hm.containsKey(a[i]))
				hm.put(a[i],i);
		}
		System.out.print("-1 -1");
	}
}