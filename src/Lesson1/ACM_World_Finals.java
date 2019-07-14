package Lesson1;

/*Задача - ACM World Finals
* ID задачи - 0633
* Сложность: 20%
*
* Условие задачи
Некоторые из вас, наверно, знают, что ежегодно проводится чемпионат мира по программированию среди
 студентов (http://acm.baylor.edu). В финал этого соревнования проходят около 80 команд со всего мира.

Каждая команда состоит из трех человек и имеет название. Напишите программу,
 которая по краткому названию команды и фамилиям ее участников,
 строит полное название команды.

Полное название команды состоит из краткого названия команды и списка фамилий ее участников.
 Фамилии участников в списке должны быть упорядочены по алфавиту и отделены друг от друга запятыми. Название команды от фамилий участников должно быть отделено двоеточием. После каждого знака препинания должен стоять ровно один пробел.

Входные данные
Входной файл INPUT.TXT содержит ровно 4 строки. Первая из строк содержит название команды.
 Каждая из следующих трех строк содержит фамилию одного из членов команды.
 Длины строк от 1 до 50 символов.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать ровно одну строку, содержащую полное название команды.*/

public class ACM_World_Finals
{
    public static void main(String[] args)
    {
        Team team1 = new Team("Мечта", "Иванов", "Петров", "Сидоров");
        Team team2 = new Team("Орлы", "Иванов1", "Петров1", "Сидоров1");
        Team team3 = new Team("Полет", "Иванов2", "Петров2", "Сидоров2");

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);
    }


}

class Team
{
    private String nameTeam;
    private String [] participants=new String[3];

    public Team(String nameTeam, String participant1, String participant2, String participant3)
    {
        this.nameTeam = nameTeam;
        this.participants[0] = participant1;
        this.participants[1] = participant2;
        this.participants[2] = participant3;
    }

    @Override
    public String toString()
    {
        return nameTeam+ " : " +participants[0] + " , "+participants[1] + " , "+participants[2] ;
    }
}
