public class Calculator
{
	public static int infix2postfixExpresion(String s)
	{
		String[] infixExpression = s.split("\\s+");
		StackOfString operators = new StackOfIntegers();
		StackOfString operands = new StackOfIntegers();
		for (int i = 0; i < infixExpression.length; i++)
		{
			if (isOperand(infixExpression[i]))
			{
				operands.push(infixExpression[i]);
				continue;
			}
			while ((operators.getSize() != 0 && operators.peek().compareTo("(") != 0)
			{
				if (priority(infixExpression[i], operators.peek()) > 0)
				{
					operators.push(infixExpression[i]);
				}
				else if ()
				else
				{
					operands.push(operators.pop());
					break;
				}
			}
		}
		
		
	}
	public static int calculate(String[] postfixExpression)
	{
		StackOfIntegers answer = new StackOfIntegers();
		for (int i = 0; i < postfixExpression.length; i++)
		{
			if (isOperand(postfixExpression[i]))
			{
				answer.push(Integer.parseInt(postfixExpression[i]));
			}
			else
			{
				answer.push(operate(answer.pop(), answer.pop(), postfixExpression[i]));
			}
		}
		return answer.pop();
	}
	
	public static boolean isOperand(String s)
	{
		return Character.isDigit(s.charAt(0));
	}
	
	public static int operate(int rightOperand, int leftOperand, String operator)
	{
		switch (operator)
		{
			case "+":
				return leftOperand + rightOperand;
			case "-":
				return leftOperand - rightOperand;
			case "*":
				return leftOperand * rightOperand;
			case "/":
				return leftOperand / rightOperand;
		}
		return leftOperand % rightOperand;
	}
	
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		String[] rpn = 
		{
			"3",
			"4",
			"+",
			"5",
			"*",
			"6",
			"-"
		};
		System.out.println(cal.calculate(rpn));
	}
}