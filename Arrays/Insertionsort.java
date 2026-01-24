import java.util.*;
public class Main{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		InsertionSort(a,n);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	static void InsertionSort(int a[], int n)
	{
		for(int i=1;i<n;i++)
		{
			int k=a[i];
			int j=i-1;
			while(j>=0 && a[j]>k)
			{
				a[j+1]=a[j];
				j-=1;
			}
			a[j+1]=k;
		}
	}
}