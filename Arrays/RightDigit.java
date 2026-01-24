import java.util.*;
public class RightDigit{
	static int Rfunc(int n,int k)
	{
		int m=0;
		while((n>0) && (k>0))
		{
			m=n%10;
			n/=10;
			k--;
		}
		//System.out.println(m+" "+k);
		if(k==0)
			return m;
		return -1;
	}
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int r=scan.nextInt();
		int v=Rfunc(n,k);
		if(v==-1)
			System.out.print("Not in length");
		else
			System.out.print(v);
	}
}