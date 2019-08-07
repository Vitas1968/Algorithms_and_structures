package Lesson8;

import java.util.LinkedList;

public class ChainingHashMap<Key, Value>
{
    // размер массива
    private int capacity = 7;
    // количество элементов в массиве
    private int size = 0;
    //сам массив типа связный список
    private LinkedList<Node>[] st;

    // узел, который везде в мапах называется Entry как я понял
    class Node {
        Key key;
        Value value;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

    }
}
