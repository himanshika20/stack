import java.util.*;
public class prefixtopostfix 
{
	public String PrefixToInfix(String s1)
	{
		Stack<String> st=new Stack<String>();
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				st.push(c+"");
			}
			else
			{
				String s2 = null;
				String x=st.pop();
				String y=st.pop();
				if(c=='+')
				{
					s2=(x+"+"+y);
				}
				else if(c=='-')
				{
					s2=(x+"-"+y);
				}
				else if(c=='*')
				{
					s2=(x+"*"+y);
				}
				else if(c=='/')
				{
					s2=(x+"/"+y);
				}
				else if(c=='^')
				{
					s2=(x+"^"+y);
				}
				st.push("("+s2+")");
			}
		}
		String s2=st.pop();
		return s2;
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
	public void InfixToPostfix(String s3)
	{
		String r=new String("");
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s3.length();i++)
		{
			char c=s3.charAt(i);
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
		System.out.println(r);
	}
	public static void main(String[] args) 
	{
		prefixtopostfix p=new prefixtopostfix();
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s3=p.PrefixToInfix(s1);
	p.InfixToPostfix(s3);
	}
}
