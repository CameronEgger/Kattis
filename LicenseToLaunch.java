import static java.lang.System.*;
import java.util.*;

public class LicenseToLaunch
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int min = 2147483647;
        int day = 0;
        int times = in.nextInt();
        for(int a = 0; a < times; a++)
        {
            int num = in.nextInt();
            if(num < min)
            {
                min = num;
                day = a;
            }
        }
        out.println(day);
    }
}
