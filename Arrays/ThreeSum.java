import java.util.*;
public class ThreeSum{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.print(threeSum(a));
	}
	public static List<List<Integer>> threeSum(int a[])
	{
		List<List<Integer>> list = new ArrayList<>();
		int n=a.length;
		Arrays.sort(a);
		for(int i=0;i<n-2;i++)
		{
			if(i>0 && a[i]==a[i-1])
				continue;
			int n1=i+1;
			int n2=n-1;
			while(n1<n2)
			{
				int t=a[i]+a[n1]+a[n2];
				if(t==0)
				{
					list.add(Arrays.asList(a[i],a[n1],a[n2]));
					while(n1<n2 && a[n1]==a[n1+1])
						n1++;
					while(n1<n2 && a[n2]==a[n2-1])
						n2--;
					n1++;
					n2--;
				}
				else if(t<0)
					n1++;
				else
					n2--;
			}
		}
		return list;
	}
}
//nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]