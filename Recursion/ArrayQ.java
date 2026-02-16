import java.util.*;
public class ArrayQ{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] a={1,2,3,5,5,9};
        System.out.println(isSortedArray(a,0));
        int target = 5;
        System.out.println(isTargetPresent(a,target,0));
        System.out.println(allTargets(a,target,0,new ArrayList<>()));
        System.out.println(targetIndex(a,target,0));
        System.out.println(allTargetIndex(a,target,0));
    }
    public static boolean isSortedArray(int[] a,int i){
        if(i==a.length-1)
            return true;
        return a[i]<=a[i+1] && isSortedArray(a,i+1);
    }
    public static boolean isTargetPresent(int[] a, int target, int i)
    {
        if(i==a.length)
            return false;
        return a[i]==target || isTargetPresent(a,target,i+1);
    }
    public static ArrayList<Integer> allTargets(int[] a, int target, int i, ArrayList<Integer> al){
        if(i==a.length)
            return al;
        if(a[i]==target)
            al.add(i);
        return allTargets(a,target,i+1,al);
    }
    public static int targetIndex(int[] a, int target, int i)
    {
        if(i==a.length)
            return -1;
        if(a[i]==target)
            return i;
        return targetIndex(a,target,i+1);
    }
    //insted of passing the list as an argument - we need to use new list in each function calls
    public static ArrayList<Integer> allTargetIndex(int[] a, int target, int i)
    {
        ArrayList<Integer> al=new ArrayList<>();
        if(i==a.length)
            return al;
        if(a[i]==target)
            al.add(i);
        //stored ans from the below function calls;
        //ArrayList<Integer> res = allTargetIndex(a,target,i+1);
        al.addAll(allTargetIndex(a,target,i+1));
        return al;
    }
}