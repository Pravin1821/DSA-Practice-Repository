import java.util.*;
public class RemoveDup{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int i=0,j=1;
		while(j<n)
		{
			if(a[j]!=a[i])
			{
				a[i+1]=a[j];
				i++;
				j++;
			}
			else
				j++;
		}
		for(int k=0;k<=i;k++)
			System.out.print(a[k]+" ");
	}
}