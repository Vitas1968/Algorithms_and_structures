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
}
