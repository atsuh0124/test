public class interschool7
{
    public static void main(String[] args)
    {
        int max = 0;
        for(int a = 1; a < 10000; a++)
        {
            for(int b = 1; b < 10000; b++)
            {
                for(int c = 1; c < 10000; c++)
                {
                    if((a*b + c) == 242 && ((a*c + b) == 370))
                    {
                        if(c > max)
                        {
                            max = c;
                            System.out.println(max);
                        }
                    }
                }
            }
        }
    }
}