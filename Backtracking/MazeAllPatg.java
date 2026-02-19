import java.util.*;
public class MazeAllPatg{
	static int min = Integer.MAX_VALUE;
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int[][] maze ={
			{0,0,0,0,0},
			{1,1,0,1,1},
		    {0,0,0,1,1},
			{0,1,1,1,1},
				{0,0,0,0,0}
			};
		int[][] path = new int[maze.length][maze[0].length];
		//Allpath(maze,0,0,path,1);
		if(SinglePath(maze,0,0,path,1))
		{
			for (int[] row : path) {
    for (int val : row) {
        System.out.print(val + " ");
    }
    System.out.println();
}	
		}
		/*System.out.println("OptimizedPath : ");
		int[][] res = new int[maze.length][maze[0].length];
		min = Integer.MAX_VALUE;
		OptimizedPath(maze,0,0,path,1,res);
		for(int[] i:res)
		{
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}*/
	}
	public static void Allpath(int[][] maze,int r,int c,int[][] path,int count)
	{
		if(r==maze.length-1 && c==maze[0].length-1)
		{
			path[r][c]=count;
			for(int[] a:path)
				System.out.println(Arrays.toString(a));
			System.out.println();
			return;
		}
		if(maze[r][c]==1)
			return;
		maze[r][c]=1;
		path[r][c]=count;
		if(r<maze.length-1)
			Allpath(maze,r+1,c,path,count+1);
		if(c<maze[0].length-1)
			Allpath(maze,r,c+1,path,count+1);
		if(c>0)
			Allpath(maze,r,c-1,path,count+1);
		if(r>0)
			Allpath(maze,r-1,c,path,count+1);
		maze[r][c]=0;
		path[r][c]=0;
	}
	public static void OptimizedPath(int[][] maze,int r,int c,int[][] path,int count,int[][] res)
	{
		if(r==maze.length-1 && c==maze[0].length-1)
		{
			path[r][c]=count;
			if(count<min)
			{
				min=count;
				for(int i=0;i<path.length;i++)
				{
					for(int j=0;j<path[0].length;j++)
					{
						res[i][j]=path[i][j];
					}
				}
			}
			return;
		}
			if(maze[r][c]==1)
				return;
			path[r][c]=count;
			maze[r][c]=1;
			if(r<maze.length-1)
				OptimizedPath(maze,r+1,c,path,count+1,res);
			if(c<maze[0].length-1)
				OptimizedPath(maze,r,c+1,path,count+1,res);
			if(r>0)
				OptimizedPath(maze,r-1,c,path,count+1,res);
			if(c>0)
				OptimizedPath(maze,r,c-1,path,count+1,res);
		path[r][c]=0;
		maze[r][c]=0;
			
	}
	public static boolean SinglePath(int[][] maze,int r,int c,int[][] path,int count)
	{
		if(r>=maze.length || c>=maze[0].length || maze[r][c] == 1 || c<0 || r<0 || path[r][c]!=0)
			return false;
		if(r==maze.length-1 && c==maze[0].length-1)
		{
			path[r][c]=count;
			return true;
		}
		path[r][c]=count;
		if(SinglePath(maze,r+1,c,path,count+1))
			return true;
		if(SinglePath(maze,r,c+1,path,count+1))
			return true;
		if(SinglePath(maze,r,c-1,path,count+1))
			return true;
		if(SinglePath(maze,r-1,c,path,count+1))
			return true;
		path[r][c]=0;
		return false;
	}
}