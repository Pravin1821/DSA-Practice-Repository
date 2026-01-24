import java.util.*;
public class Main{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt(), n2=scan.nextInt();
		int nums1[]=new int[n1], nums2[]=new int[n2];
		for(int i=0;i<n1;i++)
			nums1[i]=scan.nextInt();
		for(int i=0;i<n2;i++)
			nums2[i]=scan.nextInt();
		int a[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                a[k++]=nums1[i++];
            }
            else
            {
                a[k++]=nums2[j++];
            }
        }
        while(j<nums2.length)
            a[k++]=nums2[j++];
        while(i<nums1.length)
            a[k++]=nums1[i++];
		if(k%2!=0)
		{
			System.out.printf("%.5f",(double)a[k/2]);
		}
		else
		{
			double q=(double)(a[k/2-1]+a[k/2])/2;
			System.out.printf("%.5f",q);
		}
	}
}