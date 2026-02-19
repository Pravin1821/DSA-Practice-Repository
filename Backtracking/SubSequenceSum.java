import java.util.*;
public class SubSequenceSum{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] a={1,2,1};
		List<Integer> al=new ArrayList<>();
		if(Subsum(a,al,0,2,0))
			System.out.print(al);
	}
	public static void SubSum(int[] a, List<Integer> al, int i,int t,int sum)
	{
		if(i==a.length)
		{
			if(sum==t)
				System.out.println(al);
			return;
		}
		al.add(a[i]);
		SubSum(a,al,i+1,t,sum+a[i]);
		al.remove(al.size()-1);
		SubSum(a,al,i+1,t,sum);
	}
	public static boolean Subsum(int[] a, List<Integer> al, int i,int t,int sum)
	{
		if(i==a.length)
		{
			if(sum==t)
				return true;
			return false;
		}
		al.add(a[i]);
		if(Subsum(a,al,i+1,t,sum+a[i]))
			return true;
		al.remove(al.size()-1);
		if(Subsum(a,al,i+1,t,sum))
			return true;
		return false;
	}
}
		