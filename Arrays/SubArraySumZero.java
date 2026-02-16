import java.util.*;
public class SubArraySumZero{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.print(isSumZero(a));
	}
	public static boolean isSumZero(int[] a)
	{
		Set<Integer> set = new HashSet<>();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(a[i]==0 || sum==0 || set.contains(sum))
				return true;
			set.add(sum);
		}
		return false;
	}
}
// 4 2 -3 1 6 -> true
// 4 2 0 1 6 -> true
// 1 2 3 -> false