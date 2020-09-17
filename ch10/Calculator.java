public class Calculator
{
	private int ans;
	
	public Calculator()
	{
		ans = 0;
	}
	
	public int calculate(String[] reversePolishNotation)
	{
		StackOfIntegers answer = new StackOfIntegers();
		for (int i = 0; i < reversePolishNotation.length; i++)
		{
			if (isOperand(reversePolishNotation[i]))
			{
				answer.push(Integer.parseInt(reversePolishNotation[i]));
			}
			else
			{
				answer.push(operate(answer.pop(), answer.pop(), reversePolishNotation[i].charAt(0)));
			}
		}
		return answer.pop();
	}
	
	public boolean isOperand(String s)
	{
		return Character.isDigit(s.charAt(0));
	}
	
	public int operate(int rightOperand, int leftOperand, char operator)
	{
		switch (operator)
		{
			case '+':
				return leftOperand + rightOperand;
			case '-':
				return leftOperand - rightOperand;
			case '*':
				return leftOperand * rightOperand;
			case '/':
				return leftOperand / rightOperand;
		}
		return rightOperand % leftOperand;
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