import java.util.*;
public class Eight{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==1 || i==5)
				{
					System.out.print(" _ ");
					break;
				}
				else if(j%2!=0)
				{
					System.out.print("| ");
					break;
				}
			}
			System.out.println();
		}
	}
}