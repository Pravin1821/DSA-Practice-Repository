import java.util.*;
public class MergeInterval{
	public static int[][] merge(int[][] a)
	{
		Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
        List<int[]> list = new ArrayList<>();
        int st = a[0][0];
        int end = a[0][1];
        for(int i=1;i<a.length;i++)
        {
            if(a[i][0]<=end)
                end=Math.max(end,a[i][1]);
            else
            {
                list.add(new int[]{st,end});
                st=a[i][0];
                end=a[i][1];
            }
        }
        list.add(new int[]{st,end});
        return list.toArray(new int[list.size()][]);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[][] it = new int[n][2];
		for(int i=0;i<n;i++)
		{
			it[i][0]=scan.nextInt();
			it[i][1]=scan.nextInt();
		}
		int[][] res = merge(it);
		System.out.print(Arrays.deepToString(res));
	}
}