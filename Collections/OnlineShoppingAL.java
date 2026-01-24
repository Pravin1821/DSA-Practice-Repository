import java.util.*;
public class OnlineShoppingAL{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		while(true){
		System.out.println("Given option:\n1. Add Items: \n2. Remove Item: \n3. Replace an Item: \n4. Display: \n5. Exit: ");
		int n=scan.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Enter the item add to cart: ");
				al.add(scan.next());
				System.out.println("Item added to cart:");
				break;
			case 2:
				System.out.println("Enter the item to remove from cart: ");
				String i=scan.next();
				if(al.contains(i))
				{
					al.remove(i);
					System.out.println(i+" the item removed from cart");
				}
				else
					System.out.println("Given item not added in cart");
				break;
			case 3:
				System.out.println("Enter the item to repace: ");
				String replace=scan.next();
				System.out.println("Enter which item to be repace from the given item: ");
				String re=scan.next();
				if(al.contains(re))
				{
					int index=al.indexOf(re);
					al.set(index,replace);
					System.out.println("The given item replaced with the old item");
				}
				else
				{
					System.out.println("Items not found in cart");
				}
				break;
			case 4:
				System.out.println("The list of items in the part: ");
				for(int j=0;j<al.size();j++)
				{
					System.out.println("Items "+j+": "+al.get(j));
				}
				break;
			case 5:
				System.exit(0);
		}
		}
	}
}
			
		