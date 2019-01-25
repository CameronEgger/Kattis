import static java.lang.System.*;
import java.util.*;

public class QALY
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double total = 0;
        for(int a = 0; a < num; a++)
        {
            total += in.nextDouble() * in.nextDouble();
        }
        out.printf("%.3f",total);
    }
}
