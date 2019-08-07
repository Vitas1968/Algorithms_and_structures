package Lesson8;

public class MainChain
{
    public static void main(String[] args)
    {
        ChainingHashMap <Integer, String> hm = new ChainingHashMap <>();
        for (int i = 0; i <50 ; i++) {
            hm.put((int)(Math.random()*1000),""+i);
        }
        System.out.println(hm);
        System.out.println(hm.remove((int)(Math.random()*10))+"\n");
        System.out.println(hm);



    }
}
