import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler
{
    public static void main(String[] args)
    {
        System.out.print("Enter a URL: ");
        Scanner in = new Scanner(System.in);
        String url = in.nextLine();
        crawler(url);
    }

    public static void crawler(String startingURL)
    {
        ArrayList<String> pendingURLs = new ArrayList<>();
        ArrayList<String> traversedURLs = new ArrayList<>();

        pendingURLs.add(startingURL);
        while (!pendingURLs.isEmpty() && traversedURLs.size() <= 100)
        {
            String url = pendingURLs.remove(0);
            if (!traversedURLs.contains(url))
            {
                traversedURLs.add(url);
            }
            System.out.println(url);
            for (String urlStr : getURLs(url))
            {
                if (!traversedURLs.contains(urlStr))
                {
                    pendingURLs.add(urlStr);
                }
            }
        }
    }
    public static ArrayList<String> getURLs(String urlStr)
    {
        ArrayList<String> urls = new ArrayList<>();
        try
        {
            URL url = new URL(urlStr);
            Scanner in = new Scanner(url.openStream());
            while (in.hasNext())
            {
                String urlstring = in.nextLine();
                int current = 0;
                current = urlstring.indexOf("http:", current);
                while (current > 0)
                {
                    int endIndex = urlstring.indexOf("\"", current);
                    if (endIndex > 0)
                    {
                        urls.add(urlstring.substring(current, endIndex));
                        current = urlstring.indexOf("http:", endIndex);
                    }
                }
            }
        }
        catch (IOException io)
        {
            System.out.println(io.getMessage());
        }
        return urls;
    }
}
