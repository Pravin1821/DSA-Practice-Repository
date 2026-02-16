import java.util.*;
public class StringsQ{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(removeA(s,0));
    }
    public static String removeA(String s,int i,String p){
        if(i==s.length())
            return p;
        if(s.charAt(i)!='a') {
            p += String.valueOf(s.charAt(i));
        }
        return removeA(s,i+1,p);
    }
    public static String removeA(String s,int i){
        String p="";
        if(i==s.length())
            return p;
        if(s.charAt(i)!='a') {
            p+=String.valueOf(s.charAt(i));
        }
        p+=removeA(s,i+1);
        return p;
    }
}