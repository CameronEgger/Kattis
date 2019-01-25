import static java.lang.System.*;
import java.util.*;

public class LastFactorialDigit
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        for(int a = 0; a < times; a++)
        {
            int num = in.nextInt();
            if(num < 3)
                out.println(num);
            else if(num == 3)
                out.println(6);
            else if(num == 4)
                out.println(4);
            else
                out.println(0);
          }
     }
}
