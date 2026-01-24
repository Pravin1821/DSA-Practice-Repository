import java.util.*;
import java.util.regex.*;
public class RegexP{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		/*String s="Hello123";
		Pattern p = Pattern.compile("\\d+");*/
		String s="99 100 41 106 52 999";
		Pattern p=Pattern.compile("[0-9]{3}+\\s");
		Matcher m=p.matcher(s);
		while(m.find())
			System.out.println(m.group());
	}
}
	