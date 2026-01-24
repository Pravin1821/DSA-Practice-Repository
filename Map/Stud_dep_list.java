import java.util.*;
public class Stud_dep_list{
	public static void main(String [] args)
	{
		String[][] dep={{"IT","23IT100"},{"CSE","23CSE97"},{"AIDS","23DS064"},{"ECE","23ECE88"},
						{"IT","23IT099"},{"CSE","23CSE101"},{"AIDS","23DS084"},{"ECE","23ECE89"},
		{"IT","23IT097"},{"CSE","23CSE95"}};
		HashMap<String,List<String>> hm=new HashMap<>();
		for(int i=0;i<dep.length;i++)
		{
			if(!hm.containsKey(dep[i][0]))
				hm.put(dep[i][0],new ArrayList<>());
			hm.get(dep[i][0]).add(dep[i][1]);
		}
		for (Map.Entry<String, List<String>> en : hm.entrySet()) {
            System.out.println(en.getKey() + " - " + en.getValue());
        }
	}
}