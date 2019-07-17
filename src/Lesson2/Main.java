package Lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {


//        for (int i = 0; i <arr.length ; i++)
//        {
//           arr[i] =  (int) (Math.random()*1000);
//        }
        // print(arr);
        //тест вставки элемента
       // print(add(arr,5,555));

        // поиск элемента
        //   int [] arr = {1,1231,21,321,461,319,23,90,87,54};
//        Arrays.sort(arr);
//        System.out.println( binaryFind(arr,319));

        //тест замена элемента в указанной позиции
//        int [] arr = {1,1231,21,321,461,319,23,90,87,54};
//        print(set(arr,3,555));



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

        for (int i = 0; i < array.length; i++) {
            if (i < index) { // если текущий элемент меньше индекса вставки
                temp[i] = array[i];  // то просто копируем
            } else { //иначе копируем со сдвигом
                temp[i + 1] = array[i];
            }
        }
        temp[index] = element;
        array = temp;
        return array;
    }

    static boolean binaryFind(int [] arr, Integer item) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (item.compareTo(arr[mid]) < 0) {
                hi = mid - 1;
            } else
                if (item.compareTo(arr[mid]) > 0) {
                lo = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    // замена элемента в указанной позиции
    static int [] set(int [] arr, int index, int item) {
        arr[index] = item;
        return arr;
    }
}
