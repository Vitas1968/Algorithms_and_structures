package Lesson7;

public class DepthFirstPaths
{
    //массив посещенности
    private boolean[] marked;
    // массив огкуда пришел
    private int[] edgeTo;
    // исходная вершина с которой начинаем поиск
    private int source;

    // конструктор
    public DepthFirstPaths(Graph g, int source) {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
        dfs(g,source);
    }
}
