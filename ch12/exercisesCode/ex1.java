package exercisesCode;

/**
 * @author MarkChern
 * date 2020/11/7 14:42
 */
public class ex1
{
    public static void main(String[] args)
    {
        if (args.length != 3)
        {
            System.out.println("Uage: java ex1 4 + 5");
            System.exit(1);
        }

        int operand1 = 0;
        int operand2 = 0;
        try
        {
            operand1 = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("wrong input: " + args[0]);
            System.exit(2);
        }

        String operator = args[1];

        try
        {
            operand2 = Integer.parseInt(args[2]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("wrong input: " + args[0]);
            System.exit(3);
        }
        int result = 0;
        if (operator.compareTo("+") == 0)
        {
            result = operand1 + operand2;
        }
        else if (operator.compareTo("-") == 0)
        {
            result = operand1 - operand2;
        }
        else if (operator.compareTo("*") == 0)
        {
            result = operand1 * operand2;
        }
        else if (operator.compareTo("/") == 0)
        {
            if (operand2 != 0)
            {
                result = operand1 / operand2;
            }
            else
            {
                System.out.println("wrong expression: divide 0");
                System.exit(4);
            }
        }
        else
        {
            System.out.println("wrong input: " + operator);
            System.exit(5);
        }
        System.out.println(operand1 + operator + operand2 + " = " + result);
    }
}
