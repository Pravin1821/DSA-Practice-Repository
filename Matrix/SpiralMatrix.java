import java.util.*;
public class SpiralMatrix{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int r=scan.nextInt(),c=scan.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=scan.nextInt();
		int right = c-1;
        int bottom = r-1;
        int left = 0;
        int top = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            if (top <= bottom) {
                for (int i = left; i <= right; i++) {
                    list.add(a[top][i]);
                }
                top++;
            }
            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    list.add(a[i][right]);
                }
                right--;
            }
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(a[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(a[i][left]);
                }
                left++;
            }
        }
		System.out.print(list);
	}
}