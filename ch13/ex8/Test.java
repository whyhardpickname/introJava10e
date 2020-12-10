package ex8;

import javax.activation.MailcapCommandMap;

/**
 * @author MarkChern
 * date 2020/12/10 17:30
 */
public class Test
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        MyStack myStack2 = myStack.clone();
        myStack2.pop();

        System.out.println(myStack);
        System.out.println(myStack2);
    }
}
