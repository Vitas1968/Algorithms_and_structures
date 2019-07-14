package Lesson1;


/*
* Задача - Арбузы
* ID задачи - 0081
*
(Время: 0,5 сек. Память: 16 Мб Сложность: 14%)
Иван Васильевич пришел на рынок и решил купить два арбуза:
один для себя, а другой для тещи. Понятно, что для себя нужно выбрать арбуз потяжелей,
 а для тещи полегче. Но вот незадача: арбузов слишком много и он не знает
  как же выбрать самый легкий и самый тяжелый арбуз? Помогите ему!

Входные данные
В первой строке входного файла INPUT.TXT задано одно число N – количество арбузов.
 Вторая строка содержит N чисел, записанных через пробел.
  Здесь каждое число – это масса соответствующего арбуза. Все числа натуральные и не превышают 30000.

Выходные данные
В выходной файл OUTPUT.TXT нужно вывести два числа через пробел: массу арбуза,
который Иван Васильевич купит теще и массу арбуза, который он купит себе.*/

import java.io.PrintWriter;
import java.util.Scanner;

public class Watermelons
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int [] watermelons = new  int[num];
        PrintWriter out = new PrintWriter(System.out);

        int weightMax;
        int weightMin;

        //ввод чисел

        for (int i = 0; i < watermelons.length; i++)
        {
            watermelons[i] = in.nextInt();
        }

        weightMax = watermelons[0];
        weightMin = watermelons[0];

        // определение наибольшего и наименьшего элементов массива

        for (int i = 1; i < watermelons.length; i++)
        {
            if(weightMax < watermelons[i])weightMax=watermelons[i];
            if(weightMin > watermelons[i])weightMin=watermelons[i];

        }
        // вывод разницы

        out.println( "Себе -> "+ weightMax+"\nТёще -> "+ weightMin);
        out.flush();
    }
}
