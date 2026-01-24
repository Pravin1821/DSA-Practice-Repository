import java.util.*;
public class Police{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),k=scan.nextInt();
		char c[][]=new char[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				c[i][j]=scan.next().charAt(0);
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> pol=new ArrayList<>();
			ArrayList<Integer> th=new ArrayList<>();
			for(int j=0;j<n;j++)
			{
				if(c[i][j]=='P')
					pol.add(j);
				if(c[i][j]=='T')
					th.add(j);
			}
			int p=0,t=0;
			while(p<pol.size() && t<th.size())
			{
				int pp=pol.get(p);
				int tt=th.get(t);
				if(Math.abs(pp-tt)<=k)
				{
					count++;
					p++;
					t++;
				}
				else if(tt<pp)
					t++;
				else
					p++;
			}
		}
		System.out.print(count);
	}
}