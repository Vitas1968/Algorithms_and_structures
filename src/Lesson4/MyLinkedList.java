package Lesson4;

public class MyLinkedList <Item>
{
    private Node first;
    private int size = 0;

    public MyLinkedList() {
        this.first = null;
    }

    class Node<Item> {
        private Item value;
        private Node next;

        public Node(Item value) {
            this.value = value;
        }

        public Item getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setValue(Item value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
    public boolean isEmpty() {
        return first == null;
    }
}
