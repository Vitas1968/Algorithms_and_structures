package Lesson3;

public class MyDeque <Item>
{
    private int count = 0; // по счетчику будет определятся заполенность массива
    private Item[] list;
    int middle;
   // private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        } else {
            list = (Item[]) new Object[capacity];
            middle=list.length/2;
            begin=middle;
            end=middle;
        }
    }

    public MyDeque() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
        begin=list.length/2;
        end=--begin;
    }

    //Вставка в начало очереди
    public void pushStart(Item item) throws StackOverflowError{
        if (isFull()) {
            throw new StackOverflowError("Переполенение");
        }
        if(begin==0){list[list.length-1]=item; begin=list.length-1;count++;}
        else {list[++begin] = item;

            count++;
        }

    }

    // чтение с удалением элемента из начала очереди
    public Item popStart()
    { if (isEmpty())
        return null;
        Item tmp;
    tmp=list[begin];
        list[begin]=null;
        begin--;


        count--;

        return tmp;
    }

    // чтение элемента из начала очереди
    public Item peekStart() {
        if (isEmpty()) {
            return null;
        }
        //System.out.println(list[begin]);
        int tmp=begin;
        return list[tmp];
    }

    //Вставка в конец очереди
    public void pushEnd(Item item) throws StackOverflowError{
        if (isFull()) {
            throw new StackOverflowError("Переполенение");
        }
        if(end==list.length-1){list[0]=item;end=0; count++;}
        else {list[end--]= item;
            count++;}
    }

    // чтение с удалением элемента из конца очереди
    public Item popEnd()
    {
        if (isEmpty())
            return null;
        Item tmp;
        int tmp1=end+1;
        tmp = list[tmp1];
        list[tmp1] = null;
        end++;
        count--;

        return tmp;
    }

    // чтение элемента из конца очереди
    public Item peekEnd() {
        if (isEmpty()) {
            return null;
        }
       // System.out.println(list[++end]);
        int tmp=end+1;
        return list[tmp];
    }



    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public int getCount() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == list.length;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < list.length; i++) {
            s += list[i] + " ";
        }
        return s;
    }
}
