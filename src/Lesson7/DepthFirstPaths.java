package Lesson7;

import java.util.LinkedList;

public class DepthFirstPaths
{
    //массив посещенности
    private boolean[] marked;
    // массив огкуда пришел
    private int[] edgeTo;
    // исходная вершина с которой начинаем поиск
    private int source;

    // конструктор
    public DepthFirstPaths(Graph g, int source)
    {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
        dfs(g, source);
    }


    // собственно поиск
    private void dfs(Graph g, int v)
    {
        marked[v] = true;
        for (int w : g.getAdjList(v))
        {
            if (!marked[w])
            {
                edgeTo[w] = v;
                dfs(g, w);
            }
        }
    }

    //была ли посещена вершина
    public boolean hasPathTo(int v){
        return marked[v];
    }

    // путь до указанной вершины
    public LinkedList<Integer> pathTo(int v){
        if(!hasPathTo(v)){
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while (vertex !=source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

}

