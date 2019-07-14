package Lesson1;

import java.io.PrintWriter;
import java.util.Scanner;

// Задача - Зарплата  ID 0021

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
