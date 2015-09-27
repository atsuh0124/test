import java.util.*;
import java.io.*;
public class adventure
{
    public static String[][] recordBooks(Scanner in) throws IOException
    {
        int numBooks = in.nextInt();
        int[] pages = new int[numBooks];
        String[][] books = new String[numBooks][1000];
        for(int i = 0; i < numBooks; i++)
        {
            pages[i] = in.nextInt();
            for(int j = 0; j < pages[i]; j++)
            {
                books[i][j] = in.nextLine();
            }
        }
        return books;
    }
    public static void main(String[] args) throws IOException
    {
        String books[][] = {{"2 3", "ENDING", "ENDING"}, {"4 5", "ENDING", "2", "3", "4"}};
        int[] highest = new int[books.length];
        for(int i = 0; i < books.length; i++)
        {
            ArrayList<Integer> paths = new ArrayList<Integer>();
            boolean end = true;
            int page = 1;
            int counter = 1;
            while(end)
            {
                if(books[i][page-1].equals("ENDING"))
                {
                    if(paths.size() != 0)
                    {
                        paths.remove(0);
                        paths.remove(0);
                    }
                    if(counter > highest[i])
                    {
                        highest[i] = counter;
                    }
                    if(paths.size() == 0)
                    {
                        end = false;
                        break;
                    }
                    page = paths.get(0);
                    counter = paths.get(1);
                    continue;
                }
                if(books[i][page-1].contains(" "))
                {
                    paths.add(new Integer(Integer.parseInt(books[i][page-1].substring(2,3))));
                    paths.add(new Integer(counter));
                    page = Integer.parseInt(books[i][page-1].substring(0, 1));
                    counter++;
                    continue;
                }
                else
                {
                    page = Integer.parseInt(books[i][page-1].substring(0,1));
                    counter++;
                }
            }
        }
        for(int i = 0; i < books.length; i++)
        {
            System.out.println(highest[i]);
        }
    }
}