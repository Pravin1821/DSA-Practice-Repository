import java.util.*;
public class SubArrKDiffInt992{
	public static int func(int[] a,int k)
    {
        int r=0,l=0,count=0;
        Map<Integer,Integer> hm = new HashMap<>();
        while(r<a.length)
        {
            hm.put(a[r],hm.getOrDefault(a[r],0)+1);
            while(hm.size()>k)
            {
                hm.put(a[l],hm.get(a[l])-1);
                if(hm.get(a[l])==0)
                    hm.remove(a[l]);
                l++;
            }
            count+=r-l+1;
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
		System.out.println(func(a,k)-func(a,k-1));
	}
}