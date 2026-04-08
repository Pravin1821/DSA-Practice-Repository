import java.util.*;
public class Merge
{
    public static void mergeSort(int[] a,int l,int h)
    {
        if(l>=h)
            return;
        int mid = l+(h-l)/2;
        mergeSort(a,l,mid);
        mergeSort(a,mid+1,h);
        merge(a,l,mid,h);
    }
    public static void merge(int[] a,int l,int mid,int h)
    {
        int[] temp = new int[h-l+1];
        int i=0;
        int left = l, rig = mid+1;
        while(left<=mid && rig<=h)
        {
            if(a[left]<a[rig])
                temp[i++]=a[left++];
            else
                temp[i++]=a[rig++];
        }
        while(left<=mid)
            temp[i++]=a[left++];
        while(rig<=h)
            temp[i++]=a[rig++];
        for(int k = 0; k < temp.length; k++)
        {
            a[l+k] = temp[k];
        }
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
        mergeSort(a,0,n-1);
        print(a);
    }
}