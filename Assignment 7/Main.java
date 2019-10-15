import java.io.File;
import java.util.Scanner;
import java.lang.Integer;

public class Main
{
    public static void main(String[] args)
    {
        File myFile = new File("Employee.txt");

        Hashtable hashTable = new Hashtable();

        try
        {
            Scanner myScanner = new Scanner(myFile);
        /*
        Step 1 Read Data into HashTable
        */
            while (myScanner.hasNextLine())
            {
                String line = myScanner.nextLine();

                String[] tokens = line.split(",");
                String num = tokens[0];
                String name = tokens[1];

                int numInteger = Integer.parseInt(num);

                Employee employee = new Employee(numInteger, name);

                hashTable.insert(employee);

                System.out.println(employee);
            }
            myScanner.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.toString());
        }
    /*
    Step 2) Print the data inside the HashTable
    */
        hashTable.print();
    /*
    Step 3) Retrieve an employee with a random Id number
    */
    Scanner keyboard = new Scanner(System.in);

    String input;
    System.out.print("Enter Employee ID: ");
    input = keyboard.nextLine();

    int id = Integer.parseInt(input);
    Employee employee = hashTable.get(id);
    // Next check if employee != null
    if(employee != null)
    {
        System.out.println("Employee found: "+employee);
    }
    else
    {
        System.out.println("Employee not found");
    }
    // then print employee
    }
}