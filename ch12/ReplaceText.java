import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText
{
    public static void main(String[] args) throws IOException
    {
        if (args.length != 4)
        {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists())
        {
            System.out.println("sourceFile " + args[0] + " doesn't exit");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (targetFile.exists())
        {
            System.out.println("targetFile " + args[1] + " is already  exits");
            System.exit(3);
        }

        try(
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
                )
        {
            while (input.hasNext())
            {
                String oldStr = input.nextLine();
                String newStr = oldStr.replaceAll(args[2], args[3]);
                output.println(newStr);
            }
        }

    }
}
