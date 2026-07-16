import java.util.*;
public class ArrayBst
{
    static int[] arr;
    static int n;
    public static void insert(int val)
    {
        int i=0;
        while(i<n)
        {
            if(arr[i]==-1)
            {
                arr[i]=val;
                return;
            }
            else if(val<arr[i])
                i=2*i+1;
            else if(val>arr[i])
                i=2*i+2;
            else
                return;
        }
        System.out.println("Array Limit Reached");
    }
    public static boolean search(int val)
    {
        int i=0;
        while(i<n)
        {
            if(arr[i]==val)
                return true;
            else if(val>arr[i])
                i=2*i+2;
            else
                i=2*i+1;
        }
        return false;
    }
    public static void print()
    {
        int i=0;
        while(i<n)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
		System.out.println();
    }
	public static void main(String[] args) {
	    n=10;
		arr=new int[n];
		Arrays.fill(arr,-1);
		insert(10);
		insert(5);
		insert(15);
		insert(13);
		insert(1);
		insert(27);
		print();
		System.out.println(search(7)?"YES":"NO");
	}
}
