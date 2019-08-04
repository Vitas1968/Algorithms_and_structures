package Lesson7;

import java.util.LinkedList;

public class Graph
{
    //количество вершин
    private int vertexCount;
    //количество ребер
    private int edgeCount=0;
    //список смежностей
    private LinkedList<Integer>[] adjList;
    // конструктор
    public Graph(int vertexCount) {
        if(vertexCount<=0){
            throw new IllegalArgumentException("Количество вершин не может быть < 0");
        }
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];
        for (int i = 0; i <vertexCount ; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
}
