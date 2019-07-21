package Lesson3;

public class WordRevers
{
    String word;
    MyStack<Character> myStack;

    public WordRevers(String word)
    {
        this.word = word;
         this.myStack = new MyStack <>();
    }

    String reversWord()
    { String tmp="";

        for (int i = 0; i <word.length() ; i++)
        {
            myStack.push(word.charAt(i));
           // System.out.print(word.charAt(i));
        }
        while (myStack.size()>0)
        {
            //System.out.print(myStack.pop());
            tmp+= myStack.pop();
        }


        return tmp;
    }
}
