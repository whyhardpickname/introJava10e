package exercisesCode;

public class ex10
{
    public static void main(String[] args)
    {
        try
        {
            int[] a = new int[2000000000];
        }
        catch (OutOfMemoryError e)
        {
            System.out.println("out of memory.");
        }

        System.out.println("在主方法捕获异常后继续执行后续语句");

    }
}
