package Lesson5;

public class Box
{
   private Box box=null;
    private boolean key = false;
    private String nameBox = "";

    public Box(Box box, String nameBox,boolean key)
    {
        this.nameBox=nameBox;
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

    public String getNameBox()
    {
        return nameBox;
    }
}
