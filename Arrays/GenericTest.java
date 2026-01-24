import java.util.*;
class Stack<T>{
	private T a[];
	int top;
	public Stack(){
		top=-1;
		a=(T[])new Object[10];
	}
	public void push(T val)
	{
		a[++top]=val;
	}
	public void pop()
	{
		top--;
	}
	public T peek()
	{
		return a[top];
	}
}
public class GenericTest{
	
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		Stack<int> st=new Stack<>();
		st.push(78);
		System.out.print(st.peek());
	}
}
