import java.util.*;
public class Combination1{
	static List<Integer> al = new ArrayList<>();
	static List<List<Integer>> res = new ArrayList<>();
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=1;
		int k=1;
		backtrack(n,k,0);
		System.out.print(res);
	}
	public static void backtrack(int n,int k,int i)
	{
		if(al.size()==k)
		{
			res.add(new ArrayList<>(al));
			return;
		}
		for(int j=i;j<n;j++)
		{
			al.add(j+1);
			backtrack(n,k,j+1);
			al.remove(al.size()-1);
		}
	}
}
	