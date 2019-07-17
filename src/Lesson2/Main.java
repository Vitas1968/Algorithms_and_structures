package Lesson2;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
         int [] arr = new int[1_0];

        for (int i = 0; i <arr.length ; i++)
        {
           arr[i] =  (int) (Math.random()*1000);//random.nextInt()/100;
        }


        print(arr);

        //тест вставки элемента
        print(add(arr,5,555));



    }

    static void print(int [] arr)
    {
        System.out.print(0+" "+arr[0]+ "  " );
        for (int i = 1; i <arr.length ; i++)
        {
            System.out.print(i+" "+arr[i]+ "  " );
            if (i%10==0 ) System.out.println();
        }
        System.out.println();
    }

    // добавление элемена
    static int [] add(int [] array, int index, int element) {
        if (index > array.length || index < 0) {
            System.out.println("ArrayIndexOutOfBoundsException : index is out of range (index < 0 || index > size())");
            System.exit(0);
        }
        int[] temp = new int[array.length + 1]; 

        // здесь у тебя неправильное условие итератора i<=index;, отсюда и нули в окончание массива

        for (int i = 0; i < array.length; i++) {
            if (i < index) { // если текущий элемент меньше индекса вставки
                temp[i] = array[i];  // то просто копируем
            } else { //иначе копируем с сдвигом
                temp[i + 1] = array[i];
            }
        }
        temp[index] = element;
        array = temp;
        return array;
    }
}
