import java.util.ArrayList;
import java.util.Date;

public class ex6
{
    public static void main(String[] args)
    {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Date());
        list.add("abc");
        for (Object o : list)
        {
            System.out.println(o.toString());
        }
    }
}
