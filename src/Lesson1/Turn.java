package Lesson1;

/*Очередь ID 0511
        Сложность: 20%
        Студент Василий живет в общежитии. Отделение банка, в котором он производит оплату за проживание,
         имеет всего две кассы, поэтому почти всегда длинная очередь к ним. Первая касса открывается в 8.00,
          вторая – в 8.05. Последний клиент будет принят в 20.00. Очередь единая, и очередной клиент
           обслуживается, как только освобождается одна из касс. На обслуживание одного клиента уходит
            ровно 10 минут. Василий приходит ровно в 8.00 и видит, сколько человек стоит перед ним.
             Требуется определить, сколько времени ему придется простоять в очереди, и вообще обслужат
              ли его сегодня.

        Входные данные
        Входной файл INPUT.TXT содержит единственное натурально число K – номер Василия в очереди (K < 250).

        Выходные данные
        В выходной файл OUTPUT.TXT выводится строка «NO», если Василий сегодня заплатить уже не успеет,
         и время его ожидания (в формате «X Y», где X – количество целых часов,
          которые простоит в очереди Василий, и Y – количество минут), если все же успеет заплатить.*/

import java.io.PrintWriter;
import java.util.Scanner;

public class Turn
{
    public static void main(String[] args)
    {
        PrintWriter out = new PrintWriter(System.out);
        final int minutesInHour = 60;
        final int working_Hours_case = 12;
        final int customer_service_time_minutes = 10;
        Scanner in = new Scanner(System.in);
        int numTurn = 0;
        final String no = "NO";

        // ввoд номера очереди
        while (true)
        {
            numTurn = in.nextInt();
            if (numTurn>-1 & numTurn<250)
                break;
            else System.out.println("Некорреткное значение, попробуйте ещё раз");
        }


        // лимит количества посетителей двух касс за 12 часов. -1 - т.к.
        // одна из касс работает на 5 минут меньше, кассы обслужат на
        // одного посетителя меньше

        int maxLimit = (minutesInHour*working_Hours_case/customer_service_time_minutes)*2-1;

        // если очередь Василия больше лимита обслуживания 2 касс в день,
        // выводим NO и завершаем программу

        if (numTurn>maxLimit)
        {
            out.println( no );
            out.flush();
            System.exit(0);
        }

        int tmp = (numTurn-1)*customer_service_time_minutes/2;
        int hour = tmp / minutesInHour;
        int minutes = tmp % minutesInHour;

        out.println( "Время ожидания Василия составит: "+hour + " час. "+ minutes+ " мин. "  );
        out.flush();
    }


}
