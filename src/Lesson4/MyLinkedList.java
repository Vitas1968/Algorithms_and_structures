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

    // удаляние первого элемента
    public Item removeFirst() {
        // проверяем не пустая ли коллекция
        if (isEmpty()) {
            return null;
        }
        // создаем промежуточный элемент и сохраняем в него ссылку на первый элемент
        Node oldFirst = first;
        // первому элементу присваиваем ссылку на следующий(и он становится первым)
        first = first.getNext();
        size--;
        // из временного элемента возвращаем значение и в дальнейшем
        // он будет уничтожен GC т.к. на него не осталось ссылок
        return (Item) oldFirst.getValue();
    }

    // получение индекса элемента
    // создаем временную ссылку и перебираем коллекцию сравнивая значение
    // с аргументом метода пока не найдем нужныйю При переборе увеличиваем счетчик
    // как находим возвращаем значение счетчика, он и есть индекс
    public int indexOf(Item item) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (item.equals(current.getValue())) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    // проверка содержит ли коллекция элемент
    // обращаемся к методу indexOf(Item item) и если элемент есть в коллекции индекс
    // по любому будет больше -1(т.е метод вернет true)
    public boolean contains(Item item) {
        return indexOf(item) > -1;
    }

    // вставка элемента по индексу
    // если индекс меньше 0 вставляем в начало
    // если индекс превышает размер коллекции тр через временную ссылку current
    // перебираем коллекцию определяя(расчитывая) индекс последнего элемента
    public void insert(int index, Item item) {
        if (index <= 0) {
            insertFirst(item);
            return;
        }
        Node current = first;
        int i = 0;
        if (index > size) {
            index = size;
        }
        while(i < index-1){
            current = current.getNext();
            i++;
        }
        Node newNode= new Node(item);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
    }


    // переопределяем toString
    @Override
    public String toString() {
        Node current = first;
        StringBuilder s= new StringBuilder();
        while(current != null){
            s.append(current.getValue()+" ");
            current = current.getNext();
        }
        return s.toString();
    }
}
