package Lesson7;

import java.util.LinkedList;

public class BreadthFirstPaths
{
    //массив посещенности
    private boolean[] marked;
    // массив огкуда пришел
    private int[] edgeTo;
    // расстояние
    private int[] distTo;
    // самое возможно большое расстояние
    private final int INFINITY = Integer.MAX_VALUE;
    // исходная вершина с которой начинаем поиск
    private int source;

    // конструктор
    public BreadthFirstPaths(Graph g, int source) {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
        distTo = new int[g.getVertexCount()];
        for (int i = 0; i < distTo.length; i++) {
            distTo[i] = INFINITY;
        }
        bfs(g,source);
    }

    // метод поиска в ширину
    private void bfs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        marked[source] = true;
        distTo[source] = 0;

        while (!queue.isEmpty()){
            int vertex = queue.removeFirst();
            for (int w:g.getAdjList(vertex)) {
                if(!marked[w]){
                    marked[w]= true;
                    edgeTo[w] = vertex;
                    distTo[w] = distTo[vertex] +1;
                    queue.addLast(w);
                }
            }
        }
    }

    // была ли посещена вершина
    public boolean hasPathTo(int v){
        return marked[v];
    }
    
}
