import java.io.File;
import java.util.Scanner;
import java.lang.Integer;
import java.util.TreeMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        File myFile = new File("Player.txt");

        TreeMap<Integer, Player> tm = new TreeMap();
        //need to understand this more. for <J, K>

        try
        {
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine())
            {
                String line = myScanner.nextLine();

                String[] tokens = line.split(",");
                String rank = tokens[0];
                String name = tokens[1];
                String height = tokens[2];
                String weight = tokens[3];
                String dash = tokens[4];


                int rankInteger = Integer.parseInt(rank);
                double heightDouble = Double.parseDouble(height);
                int weightInteger = Integer.parseInt(weight);
                double dashDouble = Double.parseDouble(dash);

                Player player = new Player(rankInteger, name, heightDouble, weightInteger, dashDouble);

                tm.put(player.getRank(), player);
            }

            myScanner.close();

            for(Map.Entry<Integer,Player> player : tm.entrySet())
            {
                System.out.println(player.getValue());
            }
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.toString());
        }
    }
}