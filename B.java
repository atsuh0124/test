public class B extends A
{
    private String k;
    public B(int i)
    {
        System.out.println("B was printed first.");
    }
    public void output()
    {
        System.out.println("This is class B method");
    }
    public static void main(String[] args)
    {
        B a = new B(1);
        a.output();
        try(Math.sqrt())
        {
            
        }

    }
}