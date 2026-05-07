import java.util.*;
public class SlidingWinMax396{
	public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k<=0)
            return new int[0];
        int n=nums.length;
        int[] res=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(!dq.isEmpty() && dq.peek()<=i-k)
                dq.poll();
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.pollLast();
            dq.offer(i);
            if(i>=k-1)
                res[i-k+1]=nums[dq.peek()];
        }
        return res;
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int k=scan.nextInt();
		System.out.println(Arrays.toString(maxSlidingWindow(a,k)));
	}
}