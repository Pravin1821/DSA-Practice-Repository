import java.util.*;
public class BinarySubArray930{
	public static int numSubarraysWithSum(int[] nums, int goal) {
        return func(nums,goal)-func(nums,goal-1);
    }
    public static int func(int[] nums,int k)
    {
        if(k<0)
            return 0;
        int l=0,r=0,count=0,sum=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(sum>k)
            {
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int k=scan.nextInt();
		System.out.println(numSubarraysWithSum(a,k));
	}
}