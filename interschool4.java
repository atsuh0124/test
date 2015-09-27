public class interschool4
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 10000; i++)
        {
            for(int j = 1; j < 10000; j++)
            {
                double a = Math.sqrt(i + j);
                double b = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
                if(((int)(a))*((int)(a)) == Math.pow(a,2) && ((int)(b))*((int)(b)) == Math.pow(b,2))
                {
                    System.out.println(i*j);
                }
            }
        }
    }
}