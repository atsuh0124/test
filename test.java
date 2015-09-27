import java.util.Scanner;
import java.io.*;
public class test
{
    public static int[] input(Scanner in) throws IOException
    {
        int battles = in.nextInt();
        int[] numbers = new int[battles];
        for(int i = 0; i < battles; i++)
        {
            int p = in.nextInt();
            for(int j = 0; j < p; j++)
            {
                numbers[i] += in.nextInt();
            }
        }
        return numbers;
    }
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("stapler.txt"));
        int[] numbers = input(in);
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Battle #" + (i + 1) + ":");
            System.out.println("The stapler must face " + numbers[i] + " pages!");
            if(numbers[i] <= 30)
            {
                System.out.println("The stapler saves the day!");
            }
            else
            {
                System.out.println("Foiled again!");
            }
        }
    }
}