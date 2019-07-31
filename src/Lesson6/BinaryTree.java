package Lesson6;

public class BinaryTree <Key extends Comparable<Key>, Value>
{
    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int size;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            size = 1;
        }
    }

    // размер коллекции
    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.size;
    }

    // проверка наличия элементов в коллекции
    public boolean isEmpty() {
        return root == null;
    }

    // проверка что ключ не null
    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может быть null");
        }
        return true;
    }
}
