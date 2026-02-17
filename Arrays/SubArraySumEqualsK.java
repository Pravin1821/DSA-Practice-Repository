import java.util.*;
public class SubArraySumEqualsK{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i] = scan.nextInt();
		int k=scan.nextInt();
		System.out.print(CountSum(a,k));
	}
	public static int CountSum(int[] a, int k)
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0,1);
		int sum=0,count=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(hm.containsKey(sum-k))
				count += hm.get(sum-k);
			if(hm.containsKey(sum))
				hm.put(sum,hm.get(sum)+1);
			else
				hm.put(sum,1);
		}
		return count;
	}
}
// [1,1,1] k=2 -> 2
// [1,2,3] k=3 -> 2