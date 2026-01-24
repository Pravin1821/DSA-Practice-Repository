import java.util.*;
public class Loggedin_Count{
	public static void main(String [] args)
	{
		String id[]={"sk100","pk99","ts97","lk62","np84","sk100","pk99","ts97",
		"lk62","pk99","ts97","lk62","sk100","lk62","np84"};
		HashMap<String,Integer> hm=new HashMap<>();
		for(String i:id)
			hm.put(i,hm.getOrDefault(i,0)+1);
		String id1="ID", time="Time";
		System.out.format("%-5S %S\n",id1,time);
		for(Map.Entry<String,Integer> en:hm.entrySet())
		{
			if(en.getValue()>2)
				System.out.format("%-5S %d\n",en.getKey(),en.getValue());
		}
	}
}