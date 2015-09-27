public class initialization
{
    double i;
    public void hi(double test)
    {
        System.out.println(test);
    }
    public static void main(String[] args)
    {
        initialization ob1 = new initialization();
        ob1.hi(ob1.i);
    }
}