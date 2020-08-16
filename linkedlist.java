import java.util.*;
public class linkedlist 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
	}
	public void push(int x)
	{
		Node n=new Node(x);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
		System.out.println("pushed");
	}
	public void pop()
	{
		if(head==null)
		{
			System.out.println("underflow");
		}
		else
		{
			Node temp=head.next;
			head=temp;
		}
	}
	public void display()
	{
		Node n1=head;
		while(n1!=null)
		{
			System.out.println(n1.data+" "+n1.next);
			n1=n1.next;
		}
	}
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	linkedlist l=new linkedlist();
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		l.push(s.nextInt());
	}
	l.display();
	l.pop();
	l.display();
	
}

}
