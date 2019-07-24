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
    // проверка пустая ли коллекция
    public boolean isEmpty() {
        return first == null;
    }

    // количество элементов в коллекции
    public int size() {
        return size;
    }

    // возвращаем не сам первый элемент, а значение(поле value)
    // из первого элемента коллекции
    public Item getFirst() {
        return (Item) first.getValue();
    }

    // вставка нового элемента в начало коллекции.
    // Элемент становится первым после вставки.
    public void insertFirst(Item item) {
        Node newNode = new Node(item);
        newNode.setNext(first);
        first = newNode;
        size++;
    }
}
