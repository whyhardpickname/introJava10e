package exercisesCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MarkChern
 * date 2020/11/28 15:51
 */
public class RegexTest
{
    public static void main(String[] args) throws IllegalStateException
    {
        String s = "new Stringabc 1234Exercise9_0";
        Pattern pattern = Pattern.compile("Exercise[0-9]+_[0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
