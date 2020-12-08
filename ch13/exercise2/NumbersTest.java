package exercise2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author MarkChern
 * date 2020/12/6 17:13
 */
public class NumbersTest
{
    public static void main(String[] args)
    {
        ArrayList<Number> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Double(2.0));
        list.add(new BigInteger("100000000000000000000"));
        list.add(new BigDecimal("1.23454645756879674563543"));
        System.out.println(list.toString());
        Numbers.shuffle(list);
        System.out.println(list.toString());
        Numbers.sort(list);
        System.out.println(list.toString());
    }
}
