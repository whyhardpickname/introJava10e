public class Calculator
{
	public static String[] infix2postfixExpresion(String s)
	{
		String[] infixExpression = s.split("\\s+");
		StackOfString operators = new StackOfString();
		StackOfString operands = new StackOfString();
		for (int i = 0; i < infixExpression.length; i++)
		{
			if (isOperand(infixExpression[i]))
			{
				operands.push(infixExpression[i]);
			}
			else if (infixExpression[i].compareTo("(") == 0)
			{
				operators.push(infixExpression[i]);
			}
			else if (infixExpression[i].compareTo(")") == 0)
			{
				while (operators.peek().compareTo("(") != 0)
				{
					operands.push(operators.pop());
				}
				operators.pop();
			}
			else
			{
				while (operators.getSize() != 0 
					&& operators.peek().compareTo("(") != 0
					&& priority(infixExpression[i], operators.peek()) <= 0)
				{
					operands.push(operators.pop());
				}
				operators.push(infixExpression[i]);
			}
		}
		for (int j = 0; j < operators.getSize(); j++)
		{
			operands.push(operators.pop());
		}
		String[] postfixExpression = new String[operands.getSize()];
		for (int i = operands.getSize() - 1; i >= 0; i--)
		{
			postfixExpression[i] = operands.pop();
		}
		return postfixExpression;
	}
	
	public static int priority(String operator1, String operator2)
	{
		String[] operators = {"+", "-", "*", "/"};
		int operator1Level = 0;
		int operator2Level = 0;
		for (int i = 0; i < operators.length; i++)
		{
			if (operator1.compareTo(operators[i]) == 0)
			{
				operator1Level = i;
			}
			if (operator2.compareTo(operators[i]) == 0)
			{
				operator2Level = i;
			}
		}
		return operator1Level / 2 - operator2Level / 2;
	}
	public static int calculate(String expression)
	{
		String[] postfixExpression = infix2postfixExpresion(expression);
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
		String expression = "( 3 +  4 ) *  5 -  6";
		System.out.println(cal.calculate(expression));
	}
}