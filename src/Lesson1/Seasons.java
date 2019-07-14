package Lesson1;


// Задача - Время года ID задачи 0892

// Условия задачи
/*По заданному номеру месяца в году требуется определить время года.

Входные данные
Входной файл INPUT.TXT содержит натуральное число N (N≤100) – номер месяца.

Выходные данные
В выходной файл OUTPUT.TXT выведите для летних месяцев значение «Summer»,
для зимних – «Winter», для весенних – «Spring», для осенних – «Autumn».
Если число не соответствует возможному значению месяца, то в этом случае следует вывести «Error».*/

import java.io.PrintWriter;
import java.util.Scanner;

public class Seasons
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] salary = new  int[3];
        PrintWriter out = new PrintWriter(System.out);

        final String summer = "Summer";
        final String winter = "Winter";
        final String spring = "Spring";
        final String autumn = "Autumn";
        String season;

        int monthNum= in.nextInt();

        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                season = winter;
                break;
            case 3:
            case 4:
            case 5:
                season = spring;
                break;
            case 6:
            case 7:
            case 8:
                season =summer;
                break;
            case 9:
            case 10:
            case 11:
                season = autumn;
                break;
            default:
                season = "Error";
        }
        out.println(season);
        out.flush();
    }
}
