package Lesson7;

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
}
