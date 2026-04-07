import java.util.regex.*;
public class ExtractBtw
{
	public static void main(String[] args) {
		String s="abc?@#$m?ad*7&?sdf";
		Pattern p = Pattern.compile("\\?(.*)\\?");
		Matcher m = p.matcher(s);
		String r=m.find();
		r=r.substring(1,r.length());
		String[] a = r.split("?");
		System.out.print(a.toString());
	}
}
