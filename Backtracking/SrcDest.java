import java.util.*;
public class SrcDest{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(count(6,6));
	}
	public static int count(int r,int c)
	{
		if(r==1 || c==1)
			return 1;
		int right = count(r,c-1);
		int down = count(r-1,c);
		return right+down;
	}
}