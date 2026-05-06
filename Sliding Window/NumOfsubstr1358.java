import java.util.*;
public class NumOfsubstr1350{
	public static int numberOfSubstrings(String s) {
        int[] hash = {-1,-1,-1};
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            hash[c-'a']=i;
            count=count+(1+Math.min(hash[0],Math.min(hash[1],hash[2])));
        }
        return count;
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		System.out.println(numberOfSubstrings(s));
	}
}