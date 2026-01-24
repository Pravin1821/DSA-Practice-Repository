import java.util.*;
public class HospitailEmergency{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		Deque<String> q=new LinkedList<>();
		while(true)
		{
			System.out.println("Display Option: \n1.Add Patient to Queue: \n2.Treatment done: \n3.Exit: ");
			int n=scan.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Enter Patient name and severity(high/low): ");
				String name=scan.next(), con=scan.next();
				if("high".equalsIgnoreCase(con))
					q.addFirst(name);
				else
					q.addLast(scan.next());
				break;
			case 2:
				System.out.println("The patient "+q.poll()+" treated");
				break;
			case 3:
				System.exit(0);
			}
		}
	}
}