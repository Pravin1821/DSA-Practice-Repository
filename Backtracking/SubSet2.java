import java.util.*;
public class SubSet2{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] n={1,2,2};
		System.out.print(subsetsWithDup(n)); 
	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(nums,list,new ArrayList<Integer>(),0);
        return list;
    }
    public static void backTrack(int[] nums, List<List<Integer>> list, List<Integer> al,int st)
    {
        list.add(new ArrayList<>(al));
        for(int i=st;i<nums.length;i++)
        {
            al.add(nums[i]);
            backTrack(nums,list,al,i+1);
            while((i+1)<nums.length && nums[i]==nums[i+1])
                i++;
            al.remove(al.size()-1);
        }
    }
}