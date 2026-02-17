import java.util.*;
public class MazeString{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		StoreDirection(al,"",3,3);
		System.out.println(al);
		System.out.println(PathRet("",3,3));
		System.out.println(PathDiagonal("",3,3));
	}
	public static void StoreDirection(ArrayList<String> al,String p,int r,int c){
		if(r==1 && c==1)
		{
			al.add(p);
			return;
		}
		if(c>1)
			StoreDirection(al,p+"R",r,c-1);
		if(r>1)
			StoreDirection(al,p+"D",r-1,c);
	}
	public static ArrayList<String> PathRet(String p,int r,int c)
	{
		if(r==1 && c==1)
		{
			ArrayList<String> al = new ArrayList<>();
			al.add(p);
			return al;
		}
		ArrayList<String> al = new ArrayList<>();
		if(c>1)
			al.addAll(PathRet(p+"R",r,c-1));
		if(r>1)
			al.addAll(PathRet(p+"D",r-1,c));
		return al;
	}
	public static ArrayList<String> PathDiagonal(String p,int r,int c)
	{
		if(r==1 && c==1)
		{
			ArrayList<String> al = new ArrayList<>();
			al.add(p);
			return al;
		}
		ArrayList<String> al = new ArrayList<>();
		if(c>1 && r>1)
			al.addAll(PathDiagonal(p+"D",r-1,c-1));
		if(c>1)
			al.addAll(PathDiagonal(p+"R",r,c-1));
		if(r>1)
			al.addAll(PathDiagonal(p+"V",r-1,c));
		return al;
	}
}