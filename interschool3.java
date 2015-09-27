public class interschool3
{
    public static void main(String[] args)
    {
        double[] recursion = new double[3000000];
        recursion[0] = 2015;
        recursion[1] = 2015;
        for(int m = 2; m < 1000; m++)
        {
            for(int n = 2; n <= m; n++)
            {
                if((Math.pow(m, 2) - Math.pow(n, 2)) > (m + n))
                {
                    recursion[(int)Math.pow(m, 2) - (int)Math.pow(n, 2)] = recursion[m+n] * recursion[m-n];
                    System.out.println("a_sub" + ((int)Math.pow(m, 2) - (int)Math.pow(n, 2)) + ": " + recursion[(int)Math.pow(m, 2) - (int)Math.pow(n, 2)]);
                }
                else if((Math.pow(m, 2) - Math.pow(n, 2)) == (m+n))
                {
                    continue;
                }
            }
        }
        for(int i = 0; i < 2016; i++)
        {
            System.out.println("a_sub" + i + ": " + recursion[i]);
        }
    }
}