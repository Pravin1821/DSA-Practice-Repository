import java.util.*;
public class SubSet1{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] n={1,2,3};
		System.out.print(subsets(n));
	}
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(nums,list,new ArrayList<Integer>(),0);
        return list;
    }
    public static void backTrack(int[] nums,List<List<Integer>> list, List<Integer> al,int st)
    {
        list.add(new ArrayList<>(al));
        for(int i=st;i<nums.length;i++)
        {
            al.add(nums[i]);
            backTrack(nums,list,al,i+1);
            al.remove(al.size()-1);
        }
    }
}