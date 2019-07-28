package Lesson5;

public class Box
{
   protected Box box=null;
   protected boolean key = false;

    public Box(Box box, boolean key)
    {
        this.box = box;
        this.key = key;
    }

    public Box getBox()
    {
        return box;
    }

    public boolean isKey()
    {
        return key;
    }
}
