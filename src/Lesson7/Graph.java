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
    // геттеры
    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public LinkedList<Integer> getAdjList(int vertex) {
        return (LinkedList<Integer>)adjList[vertex].clone();
    }

    // добавление ребра
    public void addEdge(int v1, int v2){
        if(v1<0 || v2<0 || v1>=vertexCount || v2>=vertexCount){
            throw new IllegalArgumentException();
        }
        adjList[v1].add(v2);
        adjList[v2].add(v1);
    }

}
