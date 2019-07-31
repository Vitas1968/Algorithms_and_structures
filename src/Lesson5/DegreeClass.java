package Lesson5;

public class DegreeClass
{
    public static void main(String[] args)
    {
        int m=2;
        int n=4;

        System.out.println("Число "+m+ " в степени "+n+" -> "+ degree(m,n));

    }

    static int degree(int m, int n)
    {
        if(n==1) return m;
        else return m*degree(m,n-1);

    }
}
