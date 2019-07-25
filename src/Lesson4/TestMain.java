package Lesson4;

import java.util.Iterator;

public class TestMain
{
    public static void main(String[] args)
    {
       /*
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
        */

       // тест переопределенного iterator.remove();
        MyDoubleLinkedList myDoubleLinkedList=new MyDoubleLinkedList();

        myDoubleLinkedList.insertFirst("Masha");
        myDoubleLinkedList.insertFirst("Fedia");
        myDoubleLinkedList.insertFirst("Vasia");
        myDoubleLinkedList.insertFirst("Elen");
        myDoubleLinkedList.insertFirst("Dog");
        myDoubleLinkedList.insertFirst("Sven");
//        System.out.println(myDoubleLinkedList);
//        drawLine();

        Iterator<String>iterator=myDoubleLinkedList.iterator();
        //iterator.remove();
        //System.out.println(myDoubleLinkedList);
        linkIteratorApp(iterator);




    }
    static void linkIteratorApp (Iterator<String> iterator)
    {

        iterator.remove();

        drawLine();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" , ");
        }
    }

    static void drawLine()
    {
        System.out.println();
        System.out.println("----------------------------------------------------");
    }
}
