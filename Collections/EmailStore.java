import java.util.*;
public class EmailStore{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		HashSet<String> st=new HashSet<>();
		System.out.print("Enter number of emails to add: ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
			st.add(scan.next());
		System.out.println("Total registered emails are "+st.size());
		for(String i:st)
			System.out.println(i);
	}
}