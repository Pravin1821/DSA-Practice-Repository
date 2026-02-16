import java.util.*;
public class SelectionSort_Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        selectionSort(n , 0, 0, a);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void selectionSort(int n, int i, int max, int[] a)
    {
        if(n==0)
            return;
        if(i<n)
        {
            if(a[i]>a[max])
                max=i;
            selectionSort(n, i+1, max, a);
        }
        else {
            swap(a,max,n-1);
            selectionSort(n-1,0,0,a);
        }
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}