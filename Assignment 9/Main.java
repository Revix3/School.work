import java.util.LinkedList;

public class Main
{
    int n = 14;

    public static void main(String[] args)
    {
        Graph subwayPath = new Graph(7);

        subwayPath.addEdge(1, 2, 38);
        subwayPath.addEdge(1, 4, 11);
        subwayPath.addEdge(1, 5, 19);
        subwayPath.addEdge(4, 3, 27);
        subwayPath.addEdge(3, 6, 13);
        subwayPath.addEdge(5, 6, 26);
        subwayPath.addEdge(3, 5, 28);
        subwayPath.addEdge(3, 1, 35);
        subwayPath.addEdge(2, 1, 38);
        subwayPath.addEdge(4, 1, 11);
        subwayPath.addEdge(5, 1, 19);
        subwayPath.addEdge(3, 4, 27);
        subwayPath.addEdge(6, 3, 13);
        subwayPath.addEdge(6, 5, 26);
        subwayPath.addEdge(5, 3, 28);
        subwayPath.addEdge(1, 3, 35);

        int sum = subwayPath.connectedWeights( new int [] {6,3,1,2});

        System.out.println("The distance between 6 and 2 using path 6,3,1,2 will be " + sum);

        System.out.println("1 and 2 are connected: " + subwayPath.isConnected(1,2));
        System.out.println("1 and 6 are connected : " + subwayPath.isConnected(1,6));

    }
}