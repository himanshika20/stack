import java.util.Scanner;


public class stackusing2array 
{
	int top1;
	int top2;
	int size;
	int a[];
	public stackusing2array(int n)
	{
		a=new int[n];
		size=n;
		top1=-1;
		top2=size;
	}
	public void push(int x)
	{
		if(top1<top2-1)
		{
				top1++;
				a[top1]=x;
		}
	else
		{
			System.out.println("overflow");
		}
	}
	public void push1(int y)
	{
		if(top1<top2-1)
		{
			top2--;
			a[top2]=y;
		}
		else
		{
			System.out.println("overflow");
		}
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void pop()
	{
		if(top1>-1)
		{
			int item=a[top1];
		top1--;
		System.out.println(item+"is popped out");
		}
		else
		{
			System.out.println("underflow");
		}
	}
	public void pop1()
	{
		if(top2<size)
		{
			int item=a[top2];
			top2++;
			System.out.println(item+"is popped out");
		}
		else
		{
			System.out.println("undeflow");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		stackusing2array s1=new stackusing2array(n);
		s1.push(s.nextInt());
		s1.push(s.nextInt());
		s1.push1(s.nextInt());
		s1.push(s.nextInt());
		s1.push1(s.nextInt());
		s1.pop();
		s1.pop1();
		s1.display();
	}

}
