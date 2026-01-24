import java.util.*;
public class Nullaray{
    public static void main(String args[]) {
        int[][] a = new int[3][3];
        boolean setValue = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    setValue = false;
                    break;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        if (setValue == true) {
            System.out.println("The Given Matrix is a Null Matrix");
        } else {
            System.out.println("The Given Matrix is not a Null Matrix");
        }
    }
}   