import java.util.*;
public class evalofpostfix 
{
	public static void postfix(String s1)
	{
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(Character.isDigit(c))
			{
				st.push(c-'0');
			}
			else
			{
					int x=st.pop();
					int y=st.pop();
					int r=0;
					if(c=='+')
					{
						r=(x+y);
					}
					else if(c=='-')
					{
						r=(y-x);
					}
					else if(c=='*')
					{
						r=(y*x);
					}
					else if(c=='/')
					{
						r=(y/x);
					}
					else if(c=='^')
					{
						r=(y^x);
					}
					st.push(r);
            } 
        } 
        System.out.println(st.pop()); 
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		postfix(s1);
	}

}
