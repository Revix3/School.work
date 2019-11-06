import java.util.*;
import java.util.LinkedList;

class Graph
{

	// An array of lists of Edge objects
	LinkedList G[];

	// Parameterized constructor
	public Graph(int n)
	{
		G = new LinkedList[n];

        for(int i = 0; i< n; ++i)
        {
            G[i]= new LinkedList();
        }
	}

    // Check if node U is connected to node V
    //dont know how his one works i still dont for the if statement. friend tried to explain.
    //update: figured it out since i didnt know he updated edge without telling me.
    //my code wasnt working w.o the .getvertex and .getweight still a very confusing if statement though.
	public boolean isConnected(int u,int v)
	{
        for(int j = 0 ;j < G[u].size(); j++)
        {
            if(((Edge)(G[u].get(j))).getVertex() == v)
            {
            return true;
            }
        }
        return false;
    }

	// For node U, add a new connection to node V, with weight W
	// Also add the reverse connection so our Graph is undirected
	public void addEdge(int u,int v,int w)
	{
        G[u].addFirst(new Edge(v,w));
        G[v].addFirst(new Edge(u,w));
	}

	// Override the java default toString() method so we can print
	// our Graph in the format we want
	@Override
	public String toString()
	{
        return" ";
    }

    public int connectedWeights(int edges[])
    {
        int sum = 0;

        for(int i = 0; i < edges.length-1 ; i++)
        {
            for(int j = 0 ;j < G[edges[i]].size(); j++){
            if(((Edge)(G[edges[i]].get(j))).getVertex() == edges[i+1])
            {
                sum+= ((Edge)(G[edges[i]].get(j))).getWeight();

                break;
            }
        }
    }

    return sum;
}

}