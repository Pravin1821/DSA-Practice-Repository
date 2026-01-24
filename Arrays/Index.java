import java.util.*;
public class Index{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char c:s.toCharArray()){
			hm.put(c,hm.getOrDefault(c,0)+1);
		}
		for(char i:hm.keySet())
		{
			if(hm.get(i)==1)
				System.out.print(i);
		}
		/*String s="aab";
		String p="xyy";
		HashMap<Character,Character> hm=new HashMap<>();
		if(s.length()!=p.length())
		{
			System.out.print("Non isomorphic");
		}
		else
		{
			boolean t=true;
			for(int i=0;i<s.length();i++)
			{
				if((hm.containsKey(s.charAt(i)))&&(hm.get(s.charAt(i))!=p.charAt(i)))
				{
					t=false;
					break;
				}
				hm.put(s.charAt(i),p.charAt(i));
			}
			if(t)
				System.out.print("Isomarphic");
			else
				System.out.print("Not");
		}*/
	}
}