import java.util.*;
public class Studentrollnosort{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		TreeSet<Integer> st=new TreeSet<>();
		System.out.print("Enter number of roll numbers to add: ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
			st.add(scan.nextInt());
		System.out.println("Total no.of roll number: "+st.size());
		for(int i:st)
			System.out.println(i);
	}
}