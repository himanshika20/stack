import java.util.*;
import java.util.Stack;
public class infixtopostflix 
{
	public static String convert(String s)
	{
		String r=new String("");
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
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
			else if(!st.isEmpty())
			{
				while(pre(st.peek())>pre(c))
				{
					r=r+st.pop();
				}
				if(pre(st.peek())==pre(c))
				{
					r=r+st.pop();
				}
				st.push(c);
			}
			else if(st.isEmpty())
			{
				st.push(c);
			}
		}
		while(!st.isEmpty())
		{
			r=r+st.pop();
		}
	return r;
	}
	public static int pre(int ch)
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
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String s=s1.next();
		String result=convert(s);
		System.out.println(result);
	}
}