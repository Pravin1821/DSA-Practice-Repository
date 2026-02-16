import java.util.*;
public class MergeSortArray{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n1=scan.nextInt();
		int[] a=new int[n1];
		for(int i=0;i<n1;i++)
			a[i]=scan.nextInt();
		int n2=scan.nextInt();
		int[] b=new int[n2];
		for(int i=0;i<n2;i++)
			b[i]=scan.nextInt();
		MergedSortedArray(a,b);
	}
	public static void MergedSortedArray(int[] a,int[] b)
	{
		int i=0,n1=0,n2=0;
		int[] res=new int[a.length+b.length];
		while(n1<a.length && n2<b.length)
		{
			if(a[n1]<b[n2])
				res[i++]=a[n1++];
			else
				res[i++]=b[n2++];
		}
		while(n1<a.length)
			res[i++]=a[n1++];
		while(n2<b.length)
			res[i++]=b[n2++];
		for(int j=0;j<res.length;j++)
			System.out.print(res[j]+" ");
	}
}