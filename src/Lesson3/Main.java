package Lesson3;

public class Main
{
    public static void main(String[] args)
    {
        // реверс слова
//        String word ="12345678";
//        System.out.println("Исходное слово -> "+ word);
//        WordRevers wordRevers=new WordRevers(word);
//        System.out.println("Реверс слова -> "+wordRevers.reversWord());

        //тест двухсторонней очереди

        MyDeque myDeque = new MyDeque();
        try
        {

            myDeque.pushStart(5);
           myDeque.pushStart(6);
           myDeque.pushStart(7);
//            //myDeque.pushStart(7);
//           // myDeque.pushStart(9);
            myDeque.pushEnd(4);
            myDeque.pushEnd(3);
            myDeque.pushEnd(2);
            //myDeque.pushEnd(8);
           // myDeque.pushEnd(10);
            // myDeque.pushEnd(100);
        } catch (StackOverflowError soe)
        {
            System.out.println(soe.getMessage());
        }



      //  myDeque.popStart();
      //  myDeque.popStart();

        System.out.println(myDeque);
        System.out.println( myDeque.peekStart());
        System.out.println( myDeque.peekEnd());

        myDeque.popStart();
        System.out.println(myDeque);
        System.out.println( myDeque.peekStart());
        System.out.println( myDeque.peekEnd());
        
        myDeque.popStart();
        myDeque.popEnd();
        System.out.println(myDeque);

       // System.out.println(myDeque);

        System.out.println( myDeque.peekStart());
        System.out.println( myDeque.peekEnd());

    }


}
