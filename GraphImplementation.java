import java.util.ArrayList;
import java.util.List; 
import java.util.LinkedList;

public class GraphImplementation implements Graph
{	
	private boolean adjMatrix[][]; //A 2-D matrix of type boolean 
	private int vertex; //Keeps track of the number of vertices


	public GraphImplementation(int vertex) //Constructor 1 - takes parameter of type int 
	{
		this.vertex = vertex; 
		adjMatrix = new boolean[vertex][vertex]; //Creates a new matrix with number of elements equal to number of vertices 
	}

	public void addEdge(int v1, int v2) 
	{
		if(v1 >= 0 && v1 < vertex && v2 > 0 && v2 < vertex) //If v1 is not negative and less than the number of vertices
		{													//And if v2 is more than 0 and less than the number of vertices
			adjMatrix[v1][v2] = true;
			adjMatrix[v2][v1] = true; 
		}
	}

	public List<Integer> topologicalSort()
	{
	
	}


	public List<Integer> neighbors(int vertex) 
	{	
		List<Integer> adj = new ArrayList<Integer>(); 
		for(int i = 0; i < adjMatrix.length;i++)
		{
			if(adjMatrix[vertex][i]) //If input vertex is connected, add it to the arraylist 
			{
				adj.add(i); 
			}
		}

		return adj; 
	}


}