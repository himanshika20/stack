import java.util.Scanner;
public class stackswitchcase 
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
		}
	}
	public void pop()
	{
		if(top<0)
		{
			System.out.println("underflow");
		}
		else
		{
			int item=a[top];
			top--;
			System.out.println("popped item is "+item);
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
	public void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		stackswitchcase s1=new stackswitchcase();
		int n;
		do
		{
		n=s.nextInt();
		switch(n)
		{
		case 1:
			s1.push(s.nextInt());
			break;
		case 2:
			s1.pop();
			break;
		case 3:
			s1.peek();
			break;
		case 4:
			s1.display();
			break;
		case 0:
			break;
			default :
				System.out.println("invalid");
		}
		}while(n!=0);
	}

}
