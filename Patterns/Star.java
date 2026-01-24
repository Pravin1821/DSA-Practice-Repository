import java.util.*;
public class Star{
	public static  void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int space=0,star=-1;
		for(int i=1;i<=((n*2)-1);i++)
		{
			if(i<=n)
			{
				space=n-i;
				star=star+2;
			}
			else
		    {
				space++;
				star=star-2;
			}
			for(int s=1;s<=space;s++)
				System.out.print("  ");
			for(int st=1;st<=star;st++)
				System.out.print("* ");
			System.out.println();
		}
	}
}