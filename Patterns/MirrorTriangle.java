import java.util.*;
public class MirrorTriangle{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int spaceC=0, loopC=0, valC=0;
		for(int row=1;row<=(2*n-1);row++)
		{
			if(row<=n){
				spaceC=(row-1);
				loopC=((n-row)+1);
				valC=row;
			}
			else{
				spaceC=spaceC-1;
				loopC+=1;
				valC-=1;
			}
			for(int space=1;space<=spaceC;space++)
				System.out.print(" ");
			for(int loop=0;loop<loopC;loop++)
				System.out.print((valC+loop)+" ");
			System.out.println();
		}
	}
}