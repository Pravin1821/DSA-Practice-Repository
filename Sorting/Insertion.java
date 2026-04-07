import java.util.*;
public class Insertion{
    public static void InsertionSort(int[] a,int n)
    {
        // Shift based [One Insertion][Faster]
        for(int i=1;i<n;i++)
        {
            int val = a[i];
            int j=i-1;
            while(j>=0 && a[j]>val)
            {
                a[j+1]=a[j];
                j-=1;
            }
            a[j+1]=val;
            print(a);
        }
        // Swap Based [Repeated Swapping][Slower]
//        for(int i=0;i<n;i++)
//        {
//            int j=i;
//            while(j>0 && a[j-1]>a[j])
//            {
//                int temp = a[j];
//                a[j] = a[j-1];
//                a[j-1] = temp;
//                j--;
//            }
//        }
        System.out.println("Array elements(After sorted): ");
        print(a);
    }
    public static void print(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scan.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
        System.out.println("Array elements: ");
        print(a);
        InsertionSort(a,n);
    }
}