import java.util.*;
public class EventReg{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		System.out.print("Enter number of students Reg.no to add: ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
			hs.add(scan.nextInt());
		for(int i=0;i<hs.size();i++)
		{
			System.out.println("The student "+hs.remove(i)+" is entered");
		}
	}
}