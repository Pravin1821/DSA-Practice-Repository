import java.util.*;
public class Product_view_freq{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String p[]=new String[n];
		for(int i=0;i<n;i++)
			p[i]=scan.next();
		HashMap<String,Integer> hm=new HashMap<>();
		for(String i:p)
			hm.put(i,hm.getOrDefault(i,0)+1);
		for(Map.Entry<String,Integer> en:hm.entrySet())
		{
			if(en.getValue()>1)
				System.out.println("Product: "+en.getKey()+" | Frequency count: "+en.getValue());
		}
	}
}