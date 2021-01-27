package exercises;

import com.sun.org.apache.regexp.internal.RE;

import javax.xml.transform.Source;
import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLOutput;
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
    /** 指定字符串长度 */
    final static int NAME_SIZE = 32;
    final static int STREET_SIZE = 32;
    final static int CITY_SIZE = 20;
    final static int STATE_SIZE = 2;
    final static int ZIP_SIZE = 5;
    final static int RECORD_SIZE =
            (NAME_SIZE + STREET_SIZE + CITY_SIZE + STATE_SIZE + ZIP_SIZE);

    /** 地址簿文件 */
    RandomAccessFile addresses;

    /**
     * {@code ex9}构造一个可读写的地址簿。
     * @throws FileNotFoundException
     */
    public ex9() throws FileNotFoundException
    {
        addresses = new RandomAccessFile("ex17_09.txt", "rw");
    }

    /** 读取指定位置地址数据 */
    public Address readAddress(long position) throws IOException
    {
        addresses.seek(position);
        Address address = new Address(
                FixedLengthStringIO.readFixedLengthString(NAME_SIZE, addresses),
                FixedLengthStringIO.readFixedLengthString(STREET_SIZE, addresses),
                FixedLengthStringIO.readFixedLengthString(CITY_SIZE, addresses),
                FixedLengthStringIO.readFixedLengthString(STATE_SIZE, addresses),
                FixedLengthStringIO.readFixedLengthString(ZIP_SIZE, addresses));
        return address;
    }

    /** 写地址数据到指定位置 */
    public void writeAddress(long position, Address address) throws IOException
    {
        addresses.seek(position);
        FixedLengthStringIO.writeFixedLengthString(address.getName(), NAME_SIZE, addresses);
        FixedLengthStringIO.writeFixedLengthString(address.getStreet(), STREET_SIZE, addresses);
        FixedLengthStringIO.writeFixedLengthString(address.getCity(), CITY_SIZE, addresses);
        FixedLengthStringIO.writeFixedLengthString(address.getState(), STATE_SIZE, addresses);
        FixedLengthStringIO.writeFixedLengthString(address.getZip(), ZIP_SIZE, addresses);
    }

    /** 打印首地址 */
    public void first() throws IOException
    {
        if (addresses.length() > 0)
        {
            System.out.println(readAddress(0));
        }
        else
        {
            System.out.println("The address book is empty.");
        }
    }

    /** 打印末尾地址 */
    public void last() throws IOException
    {
        if (addresses.length() - RECORD_SIZE >= 0)
        {
            System.out.println(readAddress(addresses.length() - 2 * RECORD_SIZE));
        }
        else
        {
            System.out.println("The address book is empty.");
        }
    }

    /** 下一个地址 */
    public void next() throws IOException
    {
        if (addresses.getFilePointer() < addresses.length())
        {
            System.out.println(readAddress(addresses.getFilePointer()));
        }
        else
        {
            System.out.println("reach the end of the addresses.");
        }
    }

    /** 上一个地址 */
    public void previous() throws IOException
    {
        if (addresses.getFilePointer() - 2 * RECORD_SIZE >= 0)
        {
            System.out.println(readAddress(addresses.getFilePointer() - 2 * RECORD_SIZE));
        }
        else
        {
            System.out.println("reach the begin of the addresses.");
        }
    }

    public static void main(String[] args) throws IOException
    {
        ex9 addresses = new ex9();
        String s = "1";
        addresses.writeAddress(0, new Address(s, s, s, s, s));
        s = "2";
        addresses.writeAddress(RECORD_SIZE, new Address(s, s, s, s, s));
        s = "3";
        addresses.writeAddress(2 * RECORD_SIZE, new Address(s, s, s, s, s));

        addresses.first();
        addresses.next();
        addresses.next();
        addresses.next();
    }
}

/**
 * {@code FixedLengthStringIO}提供读写固定长度的字符串的方法。
 */
class FixedLengthStringIO
{
    /** 从指定文件中读取固定长度的字符串 */
    public static String readFixedLengthString(int size, DataInput in) throws IOException
    {
        char[] chars = new char[size];
        for (int i = 0; i < size; i++)
        {
            chars[i] = in.readChar();
        }
        return new String(chars);
    }

    /** 写入固定长度的字符串到指定文件 */
    public static void writeFixedLengthString(String s, int size, DataOutput out) throws IOException
    {
        char[] chars = new char[size];
        //将字符串转换成数组
        s.getChars(0, s.length(), chars, 0);
        //如数组长度不足，使用空格填充
        for (int i = Math.min(s.length(), size); i < size; i++)
        {
           chars[i] = ' ';
        }
        //写入字符串
        out.writeChars(new String(chars));
    }
}

/** 地址 */
class Address
{
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String name, String street, String city, String state, String zip)
    {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getName()
    {
        return name;
    }

    public String getStreet()
    {
        return street;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String getZip()
    {
        return zip;
    }

    @Override
    public String toString()
    {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}