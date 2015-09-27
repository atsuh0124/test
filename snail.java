import java.util.*;
import java.io.*;
public class snail{
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> shells = new ArrayList<Integer>();
        Scanner in = new Scanner(new File("test.txt"));
        int num = in.nextInt();
        while(in.hasNextInt())
            shells.add(new Integer(in.nextInt()));
        for(int i = 0; i < shells.size(); i++){
            int limit = (int)(shells.get(i) / 8), r = shells.get(i)%8, first = (int)Math.pow(2, (shells.get(i)-1)/2);
            System.out.println("Shell #" + (i + 1) + ": " + (Math.pow(first, 2) - (1.5*Math.pow(first, 2) * (1 - Math.pow(2, 8)))));
        }
    }
}