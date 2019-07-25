package Lesson4;

public class TestMain
{
    public static void main(String[] args)
    {
        MyLinkedList <String> myLinkedList = new MyLinkedList <>();

        // тест метода insertFirst
        myLinkedList.insertFirst("Masha");
        myLinkedList.insertFirst("Fedia");
        myLinkedList.insertFirst("Vasia");
        myLinkedList.insertFirst("Elen");
        myLinkedList.insertFirst("Dog");

        System.out.println("Содержание списка:");
        System.out.println(myLinkedList);
        drawLine();


       // тест метода isEmpty()
        System.out.println("Коллекция пустая? -> "+myLinkedList.isEmpty());
        drawLine();

        // тест метода size()
        System.out.println("Размер коллекции -> "+ myLinkedList.size());
        drawLine();

        //тест метода getFirst()
        System.out.println( "Значение первого элемента -> "+myLinkedList.getFirst());
        drawLine();

        //тест метода insert()
        System.out.println("Содержание списка до вставки:");
        System.out.println(myLinkedList);
        myLinkedList.insert(3,"Cat");
        System.out.println("Содержание списка после вставки:");
        System.out.println(myLinkedList);
        drawLine();

        //тест метода contains

        System.out.println("Список содежит "+ myLinkedList.contains("Cat"));
        drawLine();

        //тест метода removeFirst()
        System.out.println("Содержание списка до вставки:");
        System.out.println(myLinkedList);
        System.out.println("Удален - > "+myLinkedList.removeFirst());
        System.out.println("Содержание списка после удаления:");
        System.out.println(myLinkedList);
        drawLine();

        // тест метода remove()
        System.out.println("Содержание списка до удаления:");
        System.out.println(myLinkedList);
        System.out.println("Удален удачно- > "+myLinkedList.remove("Vasia"));
        System.out.println("Содержание списка после удаления:");
        System.out.println(myLinkedList);
        drawLine();



    }

    static void drawLine()
    {
        System.out.println("----------------------------------------------------");
    }
}
