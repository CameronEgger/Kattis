import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class humancannonball2
{
    public static void main(String[]args)
    {
        Scanner file = new Scanner(in);
        int times = file.nextInt();
        for(int a = 0; a < times; a++)
        {
            double v = file.nextDouble();
            double theta = file.nextDouble();
            double x = file.nextDouble();
            double lh = file.nextDouble();
            double uh = file.nextDouble();
            double lateralSpeed = v * Math.cos(Math.toRadians(theta));
            double time = x/lateralSpeed;
            double height = v * time * Math.sin(Math.toRadians(theta)) - .5 * 9.81 * time * time;
            //out.println(height);
            if(height >= lh + 1 && height <= uh - 1)
                out.println("Safe");
            else
                out.println("Not Safe");
        }
    }
} 
