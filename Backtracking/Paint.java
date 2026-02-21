import java.util.*;
public class Paint{
    static String[][] a;
    static int count=0;
    static String o="1";
    static String z="0";
    static String paint="2";
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(scan.hasNextLine()){
			String s=scan.nextLine().trim();
			if(s.length()==0)
				break;
			sb.append(s);
			if(s.endsWith("]]"))
				break;
		}
		String f=sb.toString();
		List<List<String>> list = new ArrayList<>();
		List<String> row = new ArrayList<>();
		for(char ch:f.toCharArray())
		{
			if(ch=='0' || ch=='1')
				row.add(String.valueOf(ch));
			else if(ch==']')
			{
				if(!row.isEmpty())
				{
					list.add(new ArrayList<>(row));
					row.clear();
				}
			}
		}
		a=new String[list.size()][list.get(0).size()];
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.get(0).size();j++)
				a[i][j]=list.get(i).get(j);
		}
		int r=scan.nextInt();
		int c=scan.nextInt();
        if(a[r-1][c-1].equals(z))
            backtrack(r-1,c-1);
        System.out.print(count);
    }
    public static void backtrack(int r,int c)
    {
        if(r<0 || c<0 || r>=a.length || c>=a[0].length || a[r][c].equals(o) || a[r][c].equals(paint))
            return;
        if(a[r][c].equals(z))
        {
           // System.out.println(a[r][c]);
            count++;
            a[r][c]=paint;
            backtrack(r+1,c);
            backtrack(r,c+1);
            backtrack(r+1,c-1);
            backtrack(r+1,c+1);
            backtrack(r-1,c);
            backtrack(r,c-1);
            backtrack(r-1,c+1);
            backtrack(r-1,c-1);
            return;
        }
    }
}