import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class parking
{
    public static void main(String[]args)
    {
        Scanner file = new Scanner(in);
        int times = file.nextInt();
        for(int a = 0; a < times; a++)
        {
            int nums = file.nextInt();
            int max = 0;
            int min = 2147483647;
            for(int b = 0; b < nums; b++)
            {
                int next = file.nextInt();
                if(max < next)
                    max = next;
                if(min >next)
                    min = next;
            }
            out.println((max - min) * 2);
        }
    }
}
