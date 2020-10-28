import java.util.ArrayList;
import java.util.Scanner;

public class ex17
{
    public static void main(String[] args)
    {
        System.out.print("Enter an integer m: ");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = 1;
        ArrayList<Integer> factors = factorization(m);
        int i = 0;
        int j = 0;
        while (j < factors.size())
        {
            while (j < factors.size() &&
                    factors.get(i).compareTo(factors.get(j)) == 0)
            {
                j++;
            }

            if ((j - i) % 2 != 0)
            {
                n *= factors.get(i);
            }
            i = j;
        }
        System.out.println("The smallest number n for m * n to be" +
                "a perfect square is " + n);
        System.out.println("m * n is " + m * n);
    }

    public static ArrayList<Integer> factorization(int m)
    {
        ArrayList<Integer> factors = new ArrayList<>();
        int i = 2;
        while (m != 1)
        {
            if (m % i == 0)
            {
                factors.add(i);
                m /= i;
            }
            else
            {
                i++;
            }
        }
        return factors;
    }
}
