import java.util.*;
public class Permutation{
	static List<List<Integer>> res = new ArrayList<>();
	public static void backtrack(int[] a,int j)
	{
		if(j==3)
		{
			List<Integer> al = new ArrayList<>();
			for(int i:a)
				al.add(i);
			res.add(al);
			return;
		}
		for(int i=j;i<a.length;i++)
		{
			swap(a,i,j);
			backtrack(a,j+1);
			swap(a,i,j);
		}
	}
	public static void swap(int[] a,int i,int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] a={1,2,3};
		backtrack(a,0);
		System.out.print(res);
		System.out.println(res.size());
	}
}