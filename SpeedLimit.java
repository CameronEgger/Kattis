import static java.lang.System.*;
import java.util.*;

public class SpeedLimit
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            int times = in.nextInt();
            if(times == -1)
                break;
            int currentTime = 0;
            int traveled = 0;
            for(int a = 0; a < times; a++)
            {
                int speed = in.nextInt();
                int elapsed = in.nextInt();
                traveled += (elapsed - currentTime) * speed;
                currentTime = elapsed;
            }
            out.println(traveled + " miles");
        }
    }
}
