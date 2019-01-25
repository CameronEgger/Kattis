import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class railroad2
{
   public static void main(String[]args)
   {
      Scanner file = new Scanner(in);
      String line = file.nextLine();
      String word1 = line.substring(0, line.length()/2);
      String word2 = line.substring(line.length()/2);
      StringBuilder build1 = new StringBuilder("");
      StringBuilder build2 = new StringBuilder("");
      int rot1 = 0;
      int rot2 = 0;
      for(int a = 0; a < word1.length(); a++)
      {
         rot1 += word1.charAt(a) - 'A';
         rot2 += word2.charAt(a) - 'A';
      }
      rot1 %= 26;
      rot2 %= 26;
      for(int a = 0; a < word1.length(); a++)
      {
         build1.append((char)((((word1.charAt(a) - 'A') + rot1) % 26) + 'A'));
         build2.append((char)((((word2.charAt(a) - 'A') + rot2) % 26) + 'A'));
      }
      StringBuilder finalBuild = new StringBuilder("");
      word1 = build1.toString();
      word2 = build2.toString();
      for(int a = 0; a < word1.length(); a++)
      {
         finalBuild.append((char)((((word1.charAt(a) - 'A') + (word2.charAt(a) - 'A')) % 26) + 'A'));
      }
      out.println(finalBuild.toString());
   }
}

