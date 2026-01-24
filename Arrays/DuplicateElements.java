import java.util.*;
public class Main{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int j=1;
		for(int i=1;i<n;i++)
		{
			if((a[i]!=a[i-1]))
			{
				a[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<j;i++)
			System.out.print(a[i]+" ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
				