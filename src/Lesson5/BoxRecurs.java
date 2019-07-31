package Lesson5;

public class BoxRecurs
{
    public static void main(String[] args)
    {
        Box box1 =new Box(null, "Box1",true);
        Box box2 =new Box(box1, "Box2",false);
        Box box3 =new Box(box2,"Box3",false);
        Box box4 =new Box(box3,"Box4",false);
        Box box5 =new Box(box4,"Box5",false);
        System.out.println("Ключ содержится в коробке -> "+ boxRecurs(box5));
    }

    static String boxRecurs(Box box)
    {
        if (box.isKey()) return box.getNameBox();
        else
            if (box.getBox()!=null)return boxRecurs( box.getBox());
            else return "Ключа нет ни в одной коробке";
    }
}
