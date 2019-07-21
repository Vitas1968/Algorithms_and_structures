package Lesson3;

public class Main
{
    public static void main(String[] args)
    {
        // реверс слова
        String word ="12345678";
        System.out.println("Исходное слово -> "+ word);
        WordRevers wordRevers=new WordRevers(word);

        System.out.println("Реверс слова -> "+wordRevers.reversWord());


    }


}
