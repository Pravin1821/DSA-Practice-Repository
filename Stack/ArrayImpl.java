import java.util.*;
class StackArrayImple{
	int size = 10, top=-1;
	int[] st=new int[size];
	void push(int x)
	{
		if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        st[++top] = x;
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("No element to pop, Stack is Empty");
			return;
		}
		top-=1;
	}
	void peek()
	{
		if(top==-1)
		{
			System.out.println("No element at top, Stack is Empty");
			return;
		}
		System.out.println(st[top]);
	}
	void size(){
		System.out.println(top+1);
	}
	void isEmpty(){
		System.out.println(top==-1);
	}
	void print()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
			return;
		}
		for(int i=top;i>=0;i--)
			System.out.print(st[i]+" ");
		System.out.println();
	}
}
public class ArrayImpl{
	public static void main(String[] args)
	{
		StackArrayImple st = new StackArrayImple();
		st.push(10);
		st.push(7);
		st.peek();
		st.pop();
		st.push(9);
		st.size();
		st.print();
		st.push(20);
		st.peek();
		st.pop();
		st.pop();
		st.size();
		st.peek();
		st.pop();
		st.size();
		st.pop();
		st.peek();
		st.print();
		st.pop();
	}
}