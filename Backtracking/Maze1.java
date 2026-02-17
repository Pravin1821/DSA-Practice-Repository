import java.util.*;
public class Maze1{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int[][] maze = {
			{0,1,1,0},
			{0,0,1,0},
		    {1,0,0,1},
			{0,1,0,0}
		};
		int[][] res = new int[maze.length][maze[0].length];
		FindPath(maze,res,0,0);
		for(int i=0;i<maze.length;i++)
		{
			for(int j=0;j<maze[0].length;j++)
				System.out.print(res[i][j]+" ");
			System.out.println();
		}
	}
	public static void FindPath(int[][] maze,int[][] res, int r, int c)
	{
		if(r==maze.length-1 && c==maze[0].length-1)
		{
			res[r][c]=1;
			return;
		}
		if(maze[r][c]==1)
			return;
		if(r<maze.length-1)
		{
			res[r][c]=1;
			FindPath(maze,res,r+1,c);
			//return;
		}
		if(c<maze[0].length-1)
		{
			res[r][c]=1;
			FindPath(maze,res,r,c+1);
			//return;
		}
	}
}
		