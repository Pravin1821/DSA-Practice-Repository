import java.util.*;
public class FirstNonRepeating{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		System.out.print(firstNonRep(s));
	}
	public static int firstNonRep(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			String k = s.substring(i+1);
			if(!k.contains(String.valueOf(s.charAt(i))))
				return i;
		}
		return -1;
	}
}