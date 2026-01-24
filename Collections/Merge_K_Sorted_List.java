import java.util.*;
public class Merge_K_Sorted_List{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		List<LinkedList<Integer>> ll=new ArrayList<>();
		while(scan.hasNext())
			ll.add(scan.nextInt());
		System.out.print(ll);
	}
}