import java.util.*;
public class Quick{
    public static void quickSort(int[] a,int low,int high)
    {
        if(low<high)
        {
            int part = Partition(a,low,high);
            quickSort(a,low,part-1);
            quickSort(a,part+1,high);
        }
    }
    public static int Partition(int[] a,int l,int h)
    {
        int pivot = a[l];
        int i = l + 1, j = h;
        while(i <= j)
        {
            while(i<=h && a[i]<=pivot)
                i++;
            while(a[j]>pivot)
                j--;
            if(i<j)
                swap(a,i,j);
        }
        swap(a,l,j);
        return j;
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
        quickSort(a,0,n-1);
        System.out.println("Sorted Array Elements: ");
        print(a);
    }
}