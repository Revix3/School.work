public class Player
{
    int rank;
    String name;
    double height;
    int weight;
    double dash;

    public Player(int rank, String name, double height, int weight, double dash)
    {
        this.rank = rank;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.dash = dash;
    }
    public int getRank()
    {
        return rank;
    }
    public String getName()
    {
        return name;
    }
    public double getHeight()
    {
        return height;
    }
    public int getWeight()
    {
        return weight;
    }
    public double getDash()
    {
        return dash;
    }

    @Override
    public String toString()
    {
        // return String.format("Player Rank: %d, ");
        return String.format("Player Rank: %d, Name: %s, Height: %f, Weight: %d, 40 yard run time: %f", rank, name, height, weight, dash);
    }
}