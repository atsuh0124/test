public class aime14
{
    public static void main(String[] args)
    {
        double area = 0;
        int counter = 0;
        int progress = 2;
        for(int n = 2; n <= 1000; n++)
        {
            double y1, y2;
            if(((int)Math.sqrt(n))*((int)Math.sqrt(n)) == n)
            {
                y2 = n*((int)Math.sqrt(n-0.1));
                y1 = (n-1)*((int)Math.sqrt(n-1));
            }
            else
            {
                y2 = n*((int)Math.sqrt(n));
                y1 = (n-1)*((int)Math.sqrt(n-1));
            }
            area += 0.5*(y1 + y2);
            System.out.println("The n is " + n + ". The area is " + area + ". The counter is " + counter);
            if((int)area == area)
            {
                counter++;
            }
        }
        System.out.println("The answer is " + counter);
    }
}