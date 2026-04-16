import java.util.*;
public class RotateImage{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int r=scan.nextInt(),c=scan.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=scan.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=i;j<c;j++)
			{
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		for(int i=0;i<r;i++)
		{
			int st=0,e=c-1;
			while(st<e)
			{
				int temp = a[i][st];
				a[i][st] = a[i][e];
				a[i][e] = temp;
				st++;
				e--;
			}
		}
		System.out.print(Arrays.deepToString(a));
	}
}