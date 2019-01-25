import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class easiest
{
    public static void main(String[]args)
    {
        Scanner file = new Scanner(in);
        int in = file.nextInt();
        while(in != 0)
        {
            int amt = getValue(in);
            int multiply = 11;
            int temp = in * multiply;
            while(amt != getValue(temp))
            {
                multiply++;
                temp = in * multiply;
                //out.println(temp);
            }
            in = file.nextInt();
            out.println(multiply);
        }
    }
    
    public static int getValue(int num)
    {
        int temp = num;
        int amt = 0;
        while(temp != 0)
        {
            amt += temp%10;
            temp/=10;
        }
        return amt;
    }
}
