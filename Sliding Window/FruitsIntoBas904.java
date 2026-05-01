import java.util.*;
public class FruitsIntoBas904{
	public static int totalFruit(int[] fruits) {
        Map<Integer,Integer> hm = new HashMap<>();
        int max=0,l=0;
        for(int i=0;i<fruits.length;i++)
        {
            hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);
            if(hm.size()>2)
            {
                int v=fruits[l];
                hm.put(v,hm.get(v)-1);
                if(hm.get(v)==0)
                    hm.remove(fruits[l]);
                l++;
            }
            max = Math.max(max,(i-l+1));
        }
        return max;
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.println(totalFruit(a,k));
	}
}