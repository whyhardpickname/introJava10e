package ex9;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * @author MarkChern
 * date 2020/12/12 16:33
 */
public class OctagonTest
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Octagon octagon = new Octagon(1);
        System.out.println((2 + 4 / Math.sqrt(2)));
        System.out.println(octagon.getArea());
        System.out.println(octagon.getPerimeter());
        Octagon octagon1 = octagon.clone();

        octagon.setSide(2);
        System.out.println(octagon1.getSide());
    }
}
