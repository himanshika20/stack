import java.util.*;
public class infixtoprefix 
{
	public static int pre(char ch)
	{
		if(ch=='+'||ch=='-')
		{
			return 1;
		}
		else if(ch=='*'||ch=='/')
		{
			return 2;
		}
		else if(ch=='^')
		{
			return 3;
		}
		else
		{
			return -1;
		}
	}
	public static void convert(String s1)
	{
		String r=new String("");
		String r1=new String("");
		Stack<Character> st=new Stack<Character>();
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			if(ch==')')
			{
				ch='(';
			}
			else if(ch=='(')
			{
				ch=')';
			}
			r1=r1+ch;
		}
		for(int i=0;i<r1.length();i++)
		{
			char c=r1.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				r=r+c;
			}
			else if(c=='(')
			{
				st.push(c);
			}
			else if(c==')')
				
			{
				while(st.peek()!='('&& !st.isEmpty())
				{
					r=r+st.pop();
				}
				st.pop();
			}
			else if(st.isEmpty())
			{
				st.push(c);
			}
			else if(!st.isEmpty())
			{
				while(pre(c)<pre(st.peek())||pre(c)==pre(st.peek()))
				{
					r=r+st.pop();
				}
				st.push(c);
			}
		}
		while(!st.isEmpty())
		{
			r=r+st.pop();
		}
		for(int i=r.length()-1;i>=0;i--)
		{
			char c1=r.charAt(i);
			if(c1!=')'||c1!='(')
			{
				System.out.print(c1);	
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		convert(s1);
	}

}
