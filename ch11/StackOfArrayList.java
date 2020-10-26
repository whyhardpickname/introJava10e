import java.awt.event.ItemListener;
import java.util.ArrayList;

public class StackOfArrayList<Item> extends ArrayList<Item>
{
    public void push(Item item)
    {
        add(item);
    }

    public Item pop()
    {
        return remove(size() - 1);
    }

}
