package ex8;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author MarkChern
 * date 2020/12/10 17:21
 */
public class MyStack implements Cloneable
{
    private ArrayList<Object> list = new ArrayList<>();

    public MyStack()
    {
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public int size()
    {
        return list.size();
    }

    public Object peek()
    {
        return list.get(size() - 1);
    }

    public void push(Object o)
    {
        list.add(o);
    }

    public Object pop()
    {
        return list.remove(size() - 1);
    }

    @Override
    protected MyStack clone() throws CloneNotSupportedException
    {
        MyStack copy = (MyStack) super.clone();
        copy.list = (ArrayList<Object>) list.clone();
        return copy;
    }

    @Override
    public String toString()
    {
        return "MyStack{" +
                "list=" + list +
                '}';
    }
}
