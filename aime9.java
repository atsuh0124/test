public class aime9
{
    public static boolean recursive(int a1, int a2, int a3, int limit, int counter)
    {
        if(a1 == a2)
        {
            System.out.println("Condition: 0 occured; a1, a2, a3 = " + a1 + ", " + a2 + ", " + a3);
            return true;
        }
        else if(a1 > 9999999 || a2 > 9999999 || a3 > 9999999)
        {
            System.out.println("Condition: counter overreached; a1, a2, a3 =" + a1 + ", " + a2 + ", " + a3);
            return false;
        }
        System.out.println("Condition recursive call; a1, a2, a3 =" + a1 + ", " + a2 + ", " + a3);   
        if(recursive(a2, a3, Math.abs(a3*Math.abs(a2-a1)), limit, counter+1))
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                for(int k = 1; k <= 10; k++)
                {
                    if(recursive(i, j, k, 1000, 0))
                    {
                        count++;
                    }
                    System.out.println("count, i, j, k = " +count + " " + i +", " + j + ", " + k);
                }
            }
        }
        System.out.println(count);
    }
}