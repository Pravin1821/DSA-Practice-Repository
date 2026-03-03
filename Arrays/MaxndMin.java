import java.util.*;
public class MaxndMin{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n=5;
		int[] a={1,2,3,4,5,6,7};
		int i=0,j=6;
		int[] b=new int[7];
		for(int k=0;k<7;k++)
		{
			if(k%2==0)
			{
				b[k]=a[j];
				j--;
			}
			else
			{
				b[k]=a[i];
				i++;
			}
		}
		System.out.print(Arrays.toString(b));
	}
}