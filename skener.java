import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class skener
{
    public static void main(String []args)
    {
        Scanner file = new Scanner(in);
        int x = file.nextInt();
        int y = file.nextInt();
        int xm = file.nextInt();
        int ym = file.nextInt();
        char[][]mat = new char[x * xm][y * ym];
        for(int a = 0; a < x; a++)
        {
            String line = file.next();
            for(int b = 0; b < y; b++)
            {
                char in = line.charAt(b);
                for(int c = 0; c < xm; c++)
                {
                    for(int d = 0; d < ym; d++)
                    {
                        mat[a * xm + c][b * ym + d] = in;
                    }
                }
            }
        }
        for(int a = 0; a < x * xm; a++)
        {
            for(int b = 0; b < y * ym; b++)
            {
                out.print(mat[a][b]);
            }
            out.println();
        }
    }
}
