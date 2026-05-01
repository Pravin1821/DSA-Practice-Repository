import java.util.*;
public class MaxConseOnes1004{
	public static int longestOnes(int[] nums, int k) {
        int maxlen = 0, r=0,l=0, zero=0;
        while(r<nums.length)
        {
            if(nums[r]==0)
                zero++;
            if(zero>k)
            {
                if(nums[l]==0)
                    zero--;
                l++;
            }
            if(zero<=k)
            {
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }
            r++;
        }
        return maxlen;
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int k=scan.nextInt();
		System.out.println(longestOnes(a,k));
	}
}                             