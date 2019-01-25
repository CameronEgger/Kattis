import static java.lang.System.*;
import java.util.*;

public class IsItHalloween
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int date = in.nextInt();
        if(str.equals("OCT") && date == 31 || str.equals("DEC") && date == 25)
            out.println("yup");
        else
            out.println("nope");
     }
}
