import java.util.Scanner;


public class stackusingarray 
{
	int top=-1;
	int size=1000;
	int a[]=new int[size];
	public void push(int x)
	{
		if(top>=size-1)
		{
			System.out.println("overflow");
		}
		else
		{
			top++;
			a[top]=x;
			System.out.println("pushed item"+a[top]);
		}
	}
	public int pop()
	{
		if(top<0)
		{
			System.out.println("underflow");
			return 0;
		}
		else
		{
			int item=a[top];
			top--;
			return item;
		}
	}
	public void peek()
	{
		if(top<0)
		{
			System.out.println("underflow");
		}
		else
		{
			int item=a[top];
			System.out.println("top most item is:-"+item);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		stackusingarray s1=new stackusingarray();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{ 
			s1.push(s.nextInt());
		}
		System.out.println("popped item:-"+s1.pop());
		s1.peek();
	}

}
