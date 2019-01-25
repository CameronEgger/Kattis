import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class alphabetspam
{
    public static void main(String[]args)
    {
        Scanner file = new Scanner(in);
        String line = file.next();
        int whitespace = 0;
        int upper = 0;
        int lower = 0;
        int symbol = 0;
        for(int a = 0; a < line.length(); a++)
        {
            char get = line.charAt(a);
            if(get == '_')
                whitespace++;
            else if(get <= 'z' && get >= 'a')
                lower++;
            else if(get <= 'Z' && get >= 'A')
                upper++;
            else
                symbol++;
        }
        out.println(1.0*whitespace/line.length());
        out.println(1.0*upper/line.length());
        out.println(1.0*lower/line.length());
        out.println(1.0*symbol/line.length());
    }
}
