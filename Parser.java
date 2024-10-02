import java.util.*;

class Parser{
    static String isBalanced(String s)
{
    Stack<Character> stack =new Stack();
    
    for(int i=0; i<s.length(); i++)
    {
        if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i)=='[')
        {
            stack.push(s.charAt(i));
        }
        else{
                if(stack.isEmpty())
                {
                    return "false";
                }
                else
                {
                    char pop_val =stack.pop();
                    if(s.charAt(i)== ')' && pop_val != '(')
                    {
                        return "false";
                    }
                    else if(s.charAt(i)== '}' && pop_val != '{')
                    {
                        return "false";
                    }
                    else if(s.charAt(i)== ']' && pop_val != '[')
                    {
                        return "false";
                    }
                }
            }
    }
    if(stack.isEmpty())
    {
        return "true";
    }
    else
    {
        return "false";
    }
}
    
}
class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}