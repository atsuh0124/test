public class trying
{
        public static void main(String[] args)
        {
            try
            {
                throw new ArithmeticException("thrown by hand");
            }
            catch(ArithmeticException ex)
            {
                System.out.println("Found" + ex);
            }
        }
}