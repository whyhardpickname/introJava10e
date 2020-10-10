import java.util.ArrayList;

public class MyStack {
    ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty()
    {
        return list.size() == 0;
    }

    public int getSize()
    {
        return list.size();
    }

    public Object peek()
    {
        return list.get(list.size() - 1);
    }

    public Object pop()
    {
        Object object = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return  object;
    }

    public void push(Object object)
    {
        list.add(object);
    }

    @Override
    public String toString()
    {
        return list.toString();
    }

    public static void main(String[] args)
    {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push("abc");
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.toString());
    }

}
