import java.io.*;
import java.util.*;

public class BalancedParanthesis
{
	static int count = 0;
	static void push(Stack st, char string)
	{
			st.push(new Character(string));
			System.out.println("Element" + string + "is pushed");
	} 
	static void pop(Stack st)
	{
			char string = (char) st.pop();
			System.out.println("Element" + string + "is popped");
	}
	public static void main(String args[])
	{
		String input = " ";
		Stack st = new Stack();
		System.out.println("Enter the string......");
		try
		{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				input = br.readLine();
			
		}
		catch(IOException io)
		{
				io.printStackTrace();
		}	
		
		char[] arr = new char[10];
		arr = input.toCharArray();

		// logic to push the starting paranthesis
		try
		{
			for(int i = 0 ; i< arr.length ; i ++)
			{
				if(arr[i] == '{' || arr[i] == '(' || arr[i] =='[')
				{
					push(st,arr[i]);
				}

				else if(arr[i] == '}' || arr[i] == ')' || arr[i] == ']')
				{
					pop(st);
				}
			}
		}
		catch(EmptyStackException e)
		{
			count = -1;
			System.out.println("Stack is now empty by erroneous input");
			System.out.println("You failed......."); 
		}

		 if(st.empty() && count != -1)
		{
			System.out.println("Balanced paranthesis found...");
		}
		else
			System.out.println("You failed..........");
	} 
}
