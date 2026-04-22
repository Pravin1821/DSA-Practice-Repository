import java.util.*;
public class RadixSort{
	public static int[] Radix(int[] inp,int n,int dig)
	{
		int div = 1;
		for(int i=0;i<dig;i++)
		{
			int[] temp = new int[n];
			int[] count = new int[10];
			for(int j=0;j<n;j++)
			{
				int digit = (inp[j]/div)%10;
				count[digit]++;
			}
			for(int j=1;j<10;j++)
				count[j]+=count[j-1];
			for(int j=n-1;j>=0;j--)
			{
				int d = (inp[j]/div)%10;
				temp[--count[d]]=inp[j];
			}
			inp=temp;
			System.out.println(Arrays.toString(inp));
			div=div*10;
		}
		return inp;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] inp = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			inp[i]=scan.nextInt();
			max = Math.max(max,inp[i]);
		}
		int dig = 0;
		while(max>0)
		{
			dig++;
			max/=10;
		}
		int[] res = Radix(inp,n,dig);
		System.out.println("Final Array:");
		System.out.print(Arrays.toString(res));
	}
}
			