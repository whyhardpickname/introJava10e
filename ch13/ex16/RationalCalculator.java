package ex16;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/12/17 16:16
 */
public class RationalCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rational expression.e.g. 1/2 + 1/3");
        String expression = input.nextLine();

        String[] elements = expression.split("/|\\s+");
        Rational operand1 = new Rational(Integer.parseInt(elements[0]), Integer.parseInt(elements[1]));
        Rational operand2 = new Rational(Integer.parseInt(elements[3]), Integer.parseInt(elements[4]));
        String operator = elements[2];

        if (operator.compareTo("+") == 0)
        {
            System.out.println(expression + " = " + operand1.add(operand2));
        }
        else if (operator.compareTo("-") == 0)
        {
            System.out.println(expression + " = " + operand1.subtract(operand2));
        }
        else if (operator.compareTo("*") == 0)
        {
            System.out.println(expression + " = " + operand1.multiply(operand2));
        }
        else if (operator.compareTo("/") == 0)
        {
            System.out.println(expression + " = " + operand1.multiply(operand2));
        }
        else
        {
            System.out.println("wrong expression");
        }
    }

}
