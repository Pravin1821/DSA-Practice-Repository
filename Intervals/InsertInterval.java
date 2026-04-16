import java.util.*;
public class InsertInterval{
	public static int[][] insert(int[][] it,int[] newit)
	{
		List<int[]> list = new ArrayList<>(); 
       int i=0,n=it.length;
       while(i<n && it[i][1]<newit[0])
            list.add(it[i++]);
        while(i<n && it[i][0]<=newit[1])
        {
            newit[0]=Math.min(newit[0],it[i][0]);
            newit[1]=Math.max(newit[1],it[i][1]);
            i++;
        }
        list.add(newit);
        while(i<n)
            list.add(it[i++]);
       return list.toArray(new int[list.size()][]);
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[][] it = new int[n][2];
		int[] newit = new int[2];
		for(int i=0;i<n;i++)
		{
			it[i][0]=scan.nextInt();
			it[i][1]=scan.nextInt();
		}
		newit[0]=scan.nextInt();
		newit[1]=scan.nextInt();
		int[][] res = insert(it,newit);
		System.out.print(Arrays.deepToString(res));
	}
}