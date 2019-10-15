public class Employee
{
    int num;
    String name;

    public Employee (int num, String name)
    {
        this.num = num;
        this.name = name;
    }
    public int getNum()
    {
        return num;
    }
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return String.format("Employee name: %s , iD: %d", name, num);
    }
}