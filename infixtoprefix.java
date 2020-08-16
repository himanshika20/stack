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
		Stack<Character> st=new Stack<Character>();
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				r=r+c;
			}
			else if(st.isEmpty())
			{
				st.push(c);
			}
			else if(!st.isEmpty())
			{
				while(pre(c)<pre(st.peek()))
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
		System.out.println(r);
		for(int i=r.length()-1;i>=0;i--)
		{
			char c1=r.charAt(i);
			System.out.print(c1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		convert(s1);
	}

}
