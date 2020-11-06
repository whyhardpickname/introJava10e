import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL
{
    public static void main(String[] args)
    {
        System.out.print("Enter a URL: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        try
        {
            URL url = new URL(str);
            Scanner input = new Scanner(url.openStream());
            int counter = 0;
            while (input.hasNext())
            {
                String line = input.nextLine();
                counter += line.length();
            }
            System.out.println("The file size is " + counter);
        }
        catch (MalformedURLException e)
        {
            System.out.println("invalid URL");
        }
        catch (IOException e)
        {
            System.out.println("nu such file");
        }
    }
}
