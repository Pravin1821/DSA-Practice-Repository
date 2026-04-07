import java.util.*;
public class Bubble{
    public static void BubbleSort(int[] a,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }
            if(!swapped) // If no 2 elements were swapped by inner loop, then break
                break;   // because the array is Already sorted.
            //print(a);
        }
        System.out.println("Array elements(After sorted): ");
        print(a);
    }
    public static void swap(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void print(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scan.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
        System.out.println("Array elements: ");
        print(a);
        BubbleSort(a,n);
    }
}