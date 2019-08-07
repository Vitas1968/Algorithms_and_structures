package Lesson7;

public class Main
{
    public static void main(String[] args)
    {
        Graph graph= new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,6);
        graph.addEdge(6,8);
        graph.addEdge(8,9);
        graph.addEdge(3,5);
        graph.addEdge(3,4);
        graph.addEdge(4,7);
        graph.addEdge(7,9);
        graph.addEdge(5,9);

        //System.out.println(graph.getAdjList(1));

       // DepthFirstPaths dfp = new DepthFirstPaths(graph,0);
       // System.out.println(dfp.hasPathTo(7));
       // System.out.println(dfp.pathTo(1));

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph,1);

        System.out.println(bfp.hasPathTo(2));
        System.out.println(bfp.pathTo(9));
        System.out.println(bfp.hasPathTo(7));
        System.out.println(bfp.distTo(9));

    }
}
