import java.util.*;
public class SetMatrix{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int r=scan.nextInt(),c=scan.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=scan.nextInt();
		Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i:row)
        {
            for(int j=0;j<c;j++)
                a[i][j]=0;
        }
        for(int i:col)
        {
            for(int j=0;j<r;j++)
                a[j][i]=0;
        }
		System.out.println("Set Matrix: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}