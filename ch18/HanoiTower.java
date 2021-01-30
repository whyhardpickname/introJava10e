/**
 * @author MarkChern
 */
public class HanoiTower
{
    public static void main(String[] args)
    {
        moveDisks(4, 'A', 'B', 'C');
    }

    public static void moveDisks(int n , char from, char to, char aux)
    {
        if (n == 1)
        {
            System.out.println("move disk " + n + " from " + from + " to " + to);
        }
        else
        {
            moveDisks(n - 1, from, aux, to);
            System.out.println("move disk " + n + " from " + from + " to " + to);
            moveDisks(n - 1, aux, to, from);
        }
    }
}
