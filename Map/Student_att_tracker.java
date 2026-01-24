import java.util.*;
public class Student_att_tracker{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int[][] name={{91,92,93,95,97,98,99,100},
						{92,93,94,95,96,97,98,99,100},
						{91,92,93,94,95,96,97,98,100},
						{91,93,94,96,97,98,99,100},
						{91,92,93,95,97,98,99,100},
						{92,93,94,95,96,97,99,100},
						{92,93,94,95,96,97,98,99,100},
						{91,93,94,95,96,97,98,99,100},
						{91,92,94,95,97,98,99,100},
						{91,92,93,94,95,96,97,98,99}};
		LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
		for(int i=0;i<name.length;i++)
		{
			for(int j:name[i])
				hm.put(j,hm.getOrDefault(j,0)+1);
		}
		for(Map.Entry<Integer,Integer> en:hm.entrySet())
		{
			float per=(en.getValue()*10)%100;
			if(per>75){
				System.out.println("Roll number: "+en.getKey());
				System.out.println("Attendence Percentage: "+per);
			}
		}
	}
}	