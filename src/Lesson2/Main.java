package Lesson2;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
         int [] arr = new int[1_00];

        for (int i = 0; i <arr.length ; i++)
        {
           arr[i] =  (int) (Math.random()*1000);//random.nextInt()/100;
        }
        print(arr);



    }

    static void print(int [] arr)
    {
        System.out.print(0+" "+arr[0]+ "  " );
        for (int i = 1; i <arr.length ; i++)
        {
            System.out.print(i+" "+arr[i]+ "  " );
            if (i%10==0 ) System.out.println();
        }
    }
}
