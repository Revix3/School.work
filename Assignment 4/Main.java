import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        //ArrayList<String> myArrayList = new ArrayList<String>();

        int[] groceryProd =new int[];

        // Input 5 numbers
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter Item " + (i + 1) + ": " );

            groceryProd[i] = keyboard.nextInt();



        }

        keyboard.close();


    }
}