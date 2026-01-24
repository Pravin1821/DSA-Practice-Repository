import java.util.*;
public class CourseEnroll{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		LinkedHashSet<String> st=new LinkedHashSet<>();
		System.out.print("Enter number of students ID to add: ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
			st.add(scan.next());
		System.out.println("Total number of corse enrolled students: "+st.size());
		for(String i:st)
			System.out.println(i);
	}
}