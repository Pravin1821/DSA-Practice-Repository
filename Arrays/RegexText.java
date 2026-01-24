import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(s);

        System.out.print(m.matches());
    }
}
