package Lesson1;

import java.io.PrintWriter;
import java.util.Scanner;

// Задача - Зарплата  ID 0021

/*Зарплата

        В отделе работают 3 сотрудника, которые получают заработную плату в рублях.
         Требуется определить: на сколько зарплата самого высокооплачиваемого из
         них отличается от самого низкооплачиваемого.

        Входные данные
        В единственной строке входного файла INPUT.TXT записаны размеры зарплат всех сотрудников через пробел. Каждая заработная плата – это натуральное число, не превышающее 105.

        Выходные данные
        В выходной файл OUTPUT.TXT необходимо вывести одно целое число — разницу между максимальной и минимальной зарплатой.

        Примеры
        №	INPUT.TXT	    OUTPUT.TXT
        1	100 500 1000	900
        2	36  11  20	    25             */

public class Task1
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] salary = new  int[3];
        PrintWriter out = new PrintWriter(System.out);

        int salaryMax=0;
        int salaryMin=0;

        for (int i = 0; i < salary.length; i++)
        {
            salary[i] = in.nextInt();
        }

        salaryMax = salary[0];
        salaryMin = salary[0];

        for (int i = 1; i < salary.length; i++)
        {
            if(salaryMax < salary[i])salaryMax=salary[i];
            if(salaryMin > salary[i])salaryMin=salary[i];

        }

        out.println( "Difference -> "+ (salaryMax-salaryMin));
        out.flush();
    }
}
