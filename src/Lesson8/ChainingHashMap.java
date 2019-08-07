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

    public ChainingHashMap() {
        st = new LinkedList[capacity];
        for (int i = 0; i < st.length; i++) {
            st[i] = new LinkedList<>();
        }
    }

    // узел, который везде в мапах называется Entry как я понял
    class Node {
        Key key;
        Value value;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // хэш для ключа
    public int hash(Key key) {
        return (key.hashCode() & 0x7FFFFFFF) % capacity;
    }

    // вспомогательный метод проверки ключа на null
    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("ключ не может быть null");
        }
        return true;
    }
}
