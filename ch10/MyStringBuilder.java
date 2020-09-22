public class MyStringBuilder
{
	private char[] chars;
	private int size;
	private int capacity;

	public MyStringBuilder(String s)
	{
        this(s.toCharArray());
	}
	public MyStringBuilder()
	{
		size = 0;
		capacity = 16;
		chars = new char[capacity];
	}
	public MyStringBuilder(char[] chars) {
        this.capacity = 16 + chars.length;
        this.size = chars.length;
        this.chars = new char[this.capacity];
        for (int i = 0; i < size; i++) {
            this.chars[i] = chars[i];
        }
    }
	public MyStringBuilder append(MyStringBuilder s)
    {
        return this.append(s.toString());
	}
	public MyStringBuilder append(String s)
    {
        if (capacity < size + s.length())
        {
            while (capacity < size + s.length()) {
                capacity *= 2;
            }
            System.arraycopy(chars, 0, chars, 0, capacity);
        }
        for (int i = 0; i < s.length(); i++)
        {
            chars[i + size] = s.charAt(i);
        }
        size += s.length();
        return this;
    }
	public MyStringBuilder append(int i)
    {
        String str = String.valueOf(i);
		return this.append(new MyStringBuilder(str));
	}
	public MyStringBuilder insert(int offset, MyStringBuilder s)
	{
	    this.insert(offset, s.toString());
		return this;
	}
    public MyStringBuilder insert(int offset, String  s)
    {

        if (capacity < size + s.length())
        {
            while (capacity < size + s.length()) {
                capacity *= 2;
            }
            System.arraycopy(chars, 0, chars, 0, capacity);
        }
        for (int i = offset; i < size; i++)
        {
            chars[i + s.length()] = chars[i];
        }
        for (int i = 0; i < s.length(); i++)
        {
            chars[i + offset] = s.charAt(i);
        }
        size += s.length();
        return this;
    }
	public MyStringBuilder reverse()
	{
	    char temp;
	    for (int i = 0; i < size / 2; i++)
        {
            temp = chars[i];
            chars[i] = chars[size - 1 - i];
            chars[size - 1 - i] = chars[i];
        }
		return this;
	}
	public int length()
	{
		return size;
	}
	public char charAt(int index)
    {
		return chars[index];
	}
	public MyStringBuilder toLowerCase()
	{
	    for (int i = 0; i < this.size; i++)
        {
            chars[i] = Character.toLowerCase(chars[i]);
        }
		return this;
	}
	public MyStringBuilder toUpperCase()
	{
        for (int i = 0; i < this.size; i++)
        {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        return this;
	}
	public MyStringBuilder substring(int begin, int end)
	{
	    char[] subChars = new char[end - begin];
	    for (int i = 0; i < subChars.length; i++)
        {
            subChars[i] = chars[i + begin];
        }
		return new MyStringBuilder(subChars);
	}
	public String toString()
	{
	    return new String(chars).substring(0, size);
	}

	public static void main(String[] args)
	{
		MyStringBuilder mysb = new MyStringBuilder("abc");
		MyStringBuilder mysb1 = new MyStringBuilder("abc");
		System.out.println(mysb.insert(1, mysb1));
	}
}