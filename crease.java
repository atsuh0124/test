import java.util.*;
import java.io.*;
public class crease 
{
    public static double round(double num, int place)
    {
        return ((int)((num*Math.pow(10, place)) + 0.5)/Math.pow(10, place));
    }
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("file.txt"));
		int num = in.nextInt();
		int[][] dimen = new int[num][2];
		int increment = 0;
		while(in.hasNextInt())
		{
			dimen[increment][0] = in.nextInt();
			dimen[increment][1] = in.nextInt();
			if(dimen[increment][0] < dimen[increment][1])
			{
				int delete = dimen[increment][0];
				dimen[increment][0] = dimen[increment][1];
				dimen[increment][1] = delete;
			}
			increment++;
		}
		for(int i = 0; i < dimen.length; i++)
		{
			int a = dimen[i][1];
			int b = dimen[i][0];
			double d = (Math.pow(b, 2) - Math.pow(a, 2))/(2*b);
			double c = Math.sqrt(Math.pow(a,  2) + Math.pow(b,  2) - 4*b*d + 4*Math.pow(d,  2));
			System.out.println("Crease #" + (i + 1) + ": " + round(c, 2));
		}
	}
}