import java.util.*;
public class TicketBooking{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		Queue<String> q=new LinkedList<>();
		while(true)
		{
			System.out.println("Display Option: \n1.Add Queue: \n2.Serve Customer: \n3.Display Next customer: \n4.Exit: ");
			int n=scan.nextInt();
			switch(n)
			{
			case 1:
				q.offer(scan.next());
				break;
			case 2:
				System.out.println("The customer "+q.poll()+" served");
				break;
			case 3:
				System.out.println(q.peek()+" next customer to serve");
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}