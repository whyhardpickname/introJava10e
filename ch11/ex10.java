import java.util.Scanner;

public class ex10
{
    public static void main(String[] args)
    {
        StackOfArrayList<String> stack = new StackOfArrayList<>();
        Scanner in = new Scanner(System.in);
        stack.push("aa");
        stack.push("bb");
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }

}
