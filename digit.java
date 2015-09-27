import java.util.*;
import java.io.*;
public class digit
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("digits.txt"));
        int num = in.nextInt();
        int[] numbers = new int[num];
        int[] digits = new int[num];
        int[] sum = new int[num];
        for(int i = 0; i < num; i++)
        {
            numbers[i] = in.nextInt();
        }
        for(int i = 0; i < numbers.length; i++)
        {
            digits[i] = String.valueOf(numbers[i]).length();
        }
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = digits[i]; j >= 0; j--)
            {
                sum[i] += numbers[i] / Math.pow(10, j);
                numbers[i] -= sum[i];
            }
        }
        for(int i = 0; i < numbers.length; i++)
        {
            if(sum[i] % 25 == 0)
            {
                System.out.println("Yes, it's 25!!!");
            }
            else
            {
                System.out.println("Bummer, no 25.");
            }
        }
    }
}