public class Hashtable
{
    public Employee[] hashTable;
        Hashtable()
        {
            //set value to prime # makes it better? why?

            hashTable = new Employee[11];
        }
    public void insert(Employee employee)
    {
        int hashValue = hashFunction(employee.getNum());

        while(hashTable[hashValue] != null)
        {
            hashValue = (hashValue + 1)% hashTable.length;
        }
        hashTable[hashValue] = employee;//dont want to put inside while loop
    }

    public Employee get(int num)
    {
        int hashValue = hashFunction(num);
        int counter = 0;

        while (hashTable[hashValue] == null || hashTable[hashValue].getNum() != num || counter < hashTable.length)
        //hashTable[hashValue] == null             is the value is null at hash value
        //hashTable[hashValue].getNum() != num     is a different employee occupies the bucket
        //counter < hashTable.length)              youre out of luck
        {
            hashValue = (hashValue + 1)% hashTable.length;

            counter++;

        }
        if (hashTable[hashValue] == null || hashTable[hashValue].getNum() != num)
        {
            return null;
        }
        else
        {
            return hashTable[hashValue];
        }
    }

    private int hashFunction(int num)
    {
        return num%hashTable.length;
    }

    public void print()
    {
        for(int i = 0;i < hashTable.length; i++)
        {
            if (hashTable[i] == null)
            {
                System.out.println(String.format("Bucket %d: empty", i));
            }
            else
            {
                System.out.println(String.format("Bucket %d: %s", i, hashTable[i]));
            }
        }
    }
}
