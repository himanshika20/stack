import java.util.*;
public class prefixtoinfix 
{
	static public void convert(String s1)
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
	System.out.println(st.pop());
	}
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	convert(s1);
}
}
