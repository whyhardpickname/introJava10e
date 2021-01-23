package exercisesCode;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MarkChern
 * date 2020/12/2 16:00
 */
public class ex33
{
    public static void main(String[] args)
    {
        System.out.print("enter a url: ");
//        Scanner read = new Scanner(System.in);
//        String url = read.nextLine();
        String url = "http://www.csapp.cs.cmu.edu";
        crawl(url);
    }

    public static void crawl(String url)
    {
        ArrayList<String> pendingURLs = new ArrayList<>();
        ArrayList<String> traversedURLs = new ArrayList<>();

        pendingURLs.add(url);

        while (!pendingURLs.isEmpty())
        {
            String pendingURL = pendingURLs.remove(0);
            if (!traversedURLs.contains(pendingURL))
            {
                traversedURLs.add(pendingURL);
                String str = "supplementary material for the textbook";
                if (contains(pendingURL, str))
                {
                    System.out.println(pendingURL);
                    return;
                }
                else
                {
                    for (String s : getSubURLs(pendingURL))
                    {
                        if (!traversedURLs.contains(s))
                        {
                            pendingURLs.add(s);
                        }
                    }
                }
            }
        }
    }

    public static boolean contains(String url, String s)
    {
        try
        {
            URL url1 = new URL(url);
            Scanner read = new Scanner(url1.openStream());

            while (read.hasNextLine())
            {
                String line = read.nextLine();
                if (line.contains(s))
                {
                    return true;
                }
            }
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<String> getSubURLs(String url)
    {
        ArrayList<String> subURLs = new ArrayList<>();
        try
        {
            URL url1 = new URL(url);
            Scanner read = new Scanner(url1.openStream());
            while (read.hasNextLine())
            {
                String line = read.nextLine();
                Pattern pattern = Pattern.compile("(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find())
                {
                    System.out.println(matcher.group());
                    subURLs.add(matcher.group());
                }
            }
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return subURLs;
    }
}
