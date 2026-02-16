import java.util.*;
public class BubbleSort_Recursion{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        bubbleSort(n - 1, 0, a);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void bubbleSort(int n, int i, int[] a){
        if(n==0)
            return;
        if(i<n)
        {
            if(a[i]>a[i+1])
                swap(a,i,i+1);
            bubbleSort(n,i+1,a);
        }
        else
            bubbleSort(n-1,0,a);
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}