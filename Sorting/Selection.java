import java.util.*;
public class Selection{
    public static void SelectionSort(int[] a,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i;j<n;j++)
            {
                if(a[j]<a[min])
                    min=j;
            }
            swap(a,i,min);
            print(a);
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
        SelectionSort(a,n);
    }
}