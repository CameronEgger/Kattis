import static java.lang.System.*;
import java.util.*;

public class ProvincesAndGold
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int gold = 6;
        int silver = 3;
        int copper = 0;
        int province = 8;
        int duchy = 5;
        int estate = 2;
        int BP = in.nextInt() * 3 + in.nextInt() * 2 + in.nextInt() * 1;
        
        if(BP >= province)
            out.println("Province or Gold");
        else if(BP >= gold)
            out.println("Duchy or Gold");
        else if(BP >= duchy)
            out.println("Duchy or Silver");
        else if (BP >= silver)
            out.println("Estate or Silver");
        else if (BP >= estate)
            out.println("Estate or Copper");
        else
            out.println("Copper");
     }
}
