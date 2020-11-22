package exercises;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ex17
{
    public static void main(String[] args) throws IOException
    {
        File file = new File(".\\ch12\\exercises\\ex17.txt");
        Scanner in = new Scanner(file);
        while (true)
        {
            String answer = in.next();
            String riddle = "";
            for (int i = 0; i < answer.length(); i++)
            {
                riddle += "*";
            }

            Scanner input = new Scanner(System.in);
            int errors = 0;
            while (riddle.contains("*"))
            {
                System.out.print("(Guess) Enter a letter in word " + riddle);
                String s = input.nextLine();
                if (riddle.contains(s))
                {
                    System.out.println(s + " is already in the string.");
                } else if (answer.contains(s))
                {
                    String nonStar = riddle.replaceAll("[*]", "");
                    String regex = "[^" + nonStar + s + "]";
                    riddle = answer.replaceAll(regex, "*");
                } else
                {
                    System.out.println(s + " is not int the worn");
                    errors++;
                }
            }
            System.out.println("The word is " + riddle);
            System.out.println("You missed " + errors + " times");
            System.out.println("Do you want to play another word?Enter y/Y");
            Scanner prompt = new Scanner(System.in);
            String word = prompt.next();
            if (!(word.compareTo("y") == 0 || word.compareTo("Y") == 0))
            {
                System.exit(1);
            }
        }
    }
}
