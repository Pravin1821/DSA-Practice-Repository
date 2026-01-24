import java.util.*;
public class ArrayList_Duplicates{
	public static void Remove_Duplicates_Sorted(ArrayList<Integer> al,int n)
	{
		int j=1;
		for(int i=1;i<n;i++)
		{
			if(al.get(i-1)!=al.get(i))
			{
				al.set(j,al.get(i));
				j++;
			}
		}
		for(int i=0;i<j;i++)
		System.out.print(al.get(i)+" ");
	}
	public static void Remove_duplicates_Atmost_2_acc(ArrayList<Integer> al, int n)
	{
		int c=1;
		for(int i=1;i<al.size();i++)
		{
			if(al.get(i).equals(al.get(i-1)))
			{
				c++;
				if(c>2)
				{
					al.remove(i);
				}
			}
			else
				c=1;
		}
		System.out.print(al);
	}
	public static void Sort_List(ArrayList<Integer> al, int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(al.get(j)>al.get(j+1))
				{
					int temp=al.get(j);
					al.set(j,al.get(j+1));
					al.set(j+1,temp);
				}
			}
		}
	}
	public static void Remove_repeating_elements3(ArrayList<Integer> al, int n)
	{
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
					al.remove(j);
			}
		}
	}
	public static void Sort_by_Freq(ArrayList<Integer> al,int n)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i:al)
		{
			hm.put(i,hm.getOrDefault(i,0)+1);
		}
		al.sort((a, b) -> {
            if (hm.get(a)!=hm.get(b)) {
                return hm.get(b) -hm.get(a); 
            }
            return a - b; 
        });
	}
	public static void Move_zeros_last(ArrayList<Integer> al, int n)
	{
		int i=0;
		for(int j=0;j<al.size();j++)
		{
			if(al.get(j)!=0)
			{
				int temp=al.get(i);
				al.set(i,al.get(j));
				al.set(j,temp);
				i++;
			}
		}
	}
	public static void Remove_all_even_numbers(ArrayList<Integer> al)
	{
		al.removeIf(a->a%2==0);
	}
	public static void Third_Unique_Ele(ArrayList<Integer> al)
	{
		TreeSet<Integer> ts=new TreeSet<>(al);
		ArrayList<Integer> nal=new ArrayList<>(ts);
		if(nal.size()>=3)
			System.out.print(nal.get(nal.size()-3));
		else
			System.out.print(nal.get(nal.size()-1));
	}
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
			al.add(scan.nextInt());
		//Remove_Duplicates_Sorted(al,n);
		//Remove_duplicates_Atmost_2_acc(al,n);
		//Sort_List(al,n);
		//Remove_repeating_elements3(al,n);
		//Sort_by_Freq(al,n);
		//Move_zeros_last(al,n);
		//Remove_all_even_numbers(al);
		Third_Unique_Ele(al);
		//System.out.print(al);
	}
}
			