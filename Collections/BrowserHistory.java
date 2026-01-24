import java.util.*;
public class BrowserHistory{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		LinkedList<String> ll=new LinkedList<>();
		while(true){
		System.out.println("Given option:\n1. Add visited page: \n2. Remove last visited page: \n3. Retrive first to last: \n4. Retrive last to first: \n5. Exit: ");
		int n=scan.nextInt();
		switch(n)
		{
			case 1:
				System.out.print("Enter the visited page: ");
				ll.add(scan.next());
				break;
			case 2:
				System.out.println(ll.pollLast()+" removed from list");
				break;
			case 3:
				for(String i:ll)
					System.out.println(i);
				break;
			case 4:
				for(int i=ll.size()-1;i>=0;i--)
					System.out.println(ll.get(i));
				break;
			case 5:
				System.exit(0);
		}
		}
	}
}
			