package stackquestions;

public class PostfixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "95*1+2-6+";
		PostfixEvaluation e = new PostfixEvaluation();
		System.out.println(e.evaluate(s));

	}
	public int evaluate(String s)
	{
		int result = 0;
		int i=0;
		char ch;
		int val1, val2;
		Stack stack = new Stack();
		while(i < s.length())
		{
			ch = s.charAt(i);
			if(ch >='0' && ch <='9')
			{
				stack.push((Character.getNumericValue(ch)));
			}
			else
			{
				
				val2 = (int) stack.pop();
				val1 = (int) stack.pop();
				
				switch(ch){
				case '+': result = val1 + val2;
							break;
				case '-': result = val1 - val2;
							break;
				case '*': result = val1 * val2;
							break;
				case '/': result = val1 / val2;
							break;
					
				}
				stack.push(result);
			}
			i++;
		}
		
		return (Integer) stack.pop();
		
	}

}
