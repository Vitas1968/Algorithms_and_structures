package Lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {

        int array[] = new int[10_000];
//
//
//        for (int i = 0; i <array.length ; i++)
//        {
//            array[i] =  (int) (Math.random()*1000);
//        }

//        //тест сортировка пузырьком с замером времени
//        long startTime = System.nanoTime();
//        bubbleSort(array);
//        long stopTime = System.nanoTime();
//        System.out.println(stopTime-startTime);


//        //тест сортировка вставками с замером времени
//        startTime = System.nanoTime();
//        insertionSort(array);
//         stopTime = System.nanoTime();
//        System.out.println(stopTime-startTime);

//        //тест сортировка выбором с замером времени
//        startTime = System.nanoTime();
//        selectionSort(array);
//        stopTime = System.nanoTime();
//        System.out.println(stopTime-startTime);


        // print(arr);
        //тест вставки элемента
       // print(add(arr,5,555));

        // поиск элемента
        //   int [] arr = {1,1231,21,321,461,319,23,90,87,54};
//        Arrays.sort(arr);
//        System.out.println( binaryFind(arr,319));

        //тест замена элемента в указанной позиции
//        print(set(arr,3,555));

        //тест удаления элемента из массива со сдвигом элементов на позицию влево
//        print(arr);
//        System.out.println();
//        print(remove(arr,321));



    }

    // вывод массива
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

    //поиск элемента
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

    //удаление элемента
    static int [] remove(int [] arr, int item) {
        int j;
        int[] tmp= new int[arr.length-1];
        for(j=0;j<arr.length;j++){ // Поиск удаляемого элемента
            if(arr[j]==item){
                break;
            } else tmp[j] = arr[j];
        }

        for(int k = j;k<tmp.length;k++){
            // Сдвиг последующих элементов
            tmp[k] = arr[k+1];
        }

        return tmp;
    }

    // сортировка пузырьком
    public static int [] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    //сортировка вставками
    public static int [] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }

    // сортировка выбором
    public static int [] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }

}
