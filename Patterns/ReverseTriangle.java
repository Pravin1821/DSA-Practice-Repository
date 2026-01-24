import java.util.*;
public class ReverseTrngle{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int row=1;row<=n;row++)
		{
			for(int space=1;space<=(row-1);space++)
				System.out.print(" ");
		    int val=row;
			for(int loop=1;loop<=((n-row)+1);loop++)
				System.out.print(val+++" ");
			System.out.println();
		}
	}
}