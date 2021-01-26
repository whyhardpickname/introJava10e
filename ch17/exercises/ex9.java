package exercises;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
//TODO
// - 测试
/**
 * 地址簿，可以添加，删除，更新地址。查看功能有首页，前移，后移和末页。
 * 地址由姓名，街道，城市，州和邮政编码组成。它们都是字符串，长度分别为
 * 32，32，20,2,5字节。
 * @author MarkChern
 */
public class ex9
{
    /**
     * 地址簿
     */
    RandomAccessFile addresses;
    private long currentPos = 0;
    private final int addressLength = 32 + 32 + 20 + 2 + 5;

    /**
     * {@code ex9}构造一个可读写的地址簿。
     * @throws FileNotFoundException
     */
    public ex9() throws FileNotFoundException
    {
        addresses = new RandomAccessFile("ex17_09.txt", "rw");
    }

    /**
     * {@code add}方法添加一个新的地址。
     * @param name
     *      姓名
     * @param street
     *      街道
     * @param city
     *      城市
     * @param state
     *      州
     * @param zip
     *      邮编
     */
    public void add(String name, String street, String city, String state, String zip) throws IOException
    {
        String address = String.format("%.32s", name) +
                String.format("%.32s", street) +
                String.format("%.20s", city) +
                String.format("%.2s", state) +
                String.format("%.5s", zip);
        addresses.writeUTF(address);
    }

    /**
     * {@code first}方法将当前页移动到首地址页，并打印首地址。
     * @return
     *      首地址
     */
    public void first() throws IOException
    {
        addresses.seek(0);
        currentPos = 0;
        System.out.println(addresses.readUTF());
    }

    /**
     * {@code next}方法将当前页移动到下一页，并打印下一页地址。
     */
    public String next() throws IOException
    {
        currentPos += addressLength;
        System.out.println(addresses.readUTF());
        return null;
    }

    /**
     * {@code previous}方法将当前页移动到下一页，并打印上一页地址。
     */
    public String previous() throws IOException
    {
        currentPos -= (32 + 32 + 20 + 2 + 5);
        addresses.seek(currentPos);
        System.out.println(addresses.readUTF());
        return null;
    }

    /**
     * {@code last}方法将当前页移动到首地址页，并打印最后一个地址。
     */
    public void last() throws IOException
    {
        currentPos = addresses.length() - addressLength;
        System.out.println(addresses.readUTF());
    }

    /**
     * {@code update}方法更新当前页地址。
     */
    public void update(String name, String street, String city, String state, String zip) throws IOException
    {
        add(name, street, city, state, zip);
        currentPos -= addressLength;
        addresses.seek(currentPos);
    }
}
