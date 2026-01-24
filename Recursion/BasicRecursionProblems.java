import java.util.*;
public class BasicRecursionProblems{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("From number 1 to n");
        function(5);
        System.out.println();
        System.out.println("Sum of the Digits of 12345 is: "+sumDigits(12345));
        System.out.println("Reverse a given number 456 is: "+rev(456));
        int n=12212;
        System.out.println("Digits count of the number "+n+" is: "+(int)(Math.log10(n)+1));
        System.out.println("Given number "+n+" is Palindrome(true/false): "+isPalindrome(n));
        int val=1002001;
        System.out.println("Count the number of zeros in the given number "+val+" is: "+countZeros(val));
    }
    public static void function(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" "); // 5 4 3 2 1
        function(n-1);
        ///System.out.print(n+" "); // 1 2 3 4 5
    }
    public static int sumDigits(int n)
    {
        if(n%10 == n)
            return n;
        return n%10+sumDigits(n/10);
    }
    public static boolean isPalindrome(int n)
    {
        return n==rev(n);
    }
    public static int rev(int n) {
        int digits = (int) (Math.log10(n) + 1); //to count number of Digits = 3:
        return helperReverse(n, digits);
    }
    public static int helperReverse(int n,int c)
    {
        if(n%10 == n)
            return n;
        return (int)((n%10)*Math.pow(10,c-1))+helperReverse(n/10,c-1);
        //   456 = 6*10^2 = 600+helperReverse(45,2)
    }
    public static int countZeros(int n)
    {
        return helperCountZeros(n,0);
    }
    public static int helperCountZeros(int n,int c)
    {
        if(n==0)
            return c;
        if(n%10 == 0)
            return helperCountZeros(n/10,c+1);
        return helperCountZeros(n/10,c);
    }
}