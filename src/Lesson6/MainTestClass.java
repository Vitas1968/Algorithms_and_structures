package Lesson6;

import java.util.ArrayList;

public class MainTestClass
{


    public static void main(String[] args)
    {
        // задаем фактор баланса(разница глубины ветвей)
        int balanceFactor=4;
        final int capacity=20;
        int count=0;

        //  создаем 20 деревьев и заносим их в список
        ArrayList<BinaryTree<Integer,Integer>> list=new ArrayList(capacity);

        for (int i = 0; i < capacity; i++)
        {
            list.add(i,new BinaryTree <>());
        }
        //заполняем деревья значениями на глубину 6
        for (BinaryTree binaryTree: list)
        { int key=1;
            while (true)
            {
                binaryTree.put(key, (int) (Math.random()*(200+1)) - 100);
                key++;
                if (binaryTree.heightOfBinaryTree(binaryTree.getRoot())==6) break;
            }

        }
        //  проверяем баланс каждого дерева
        for (BinaryTree binaryTree: list)
        {
            if(!binaryTree.checkBalanceTree(binaryTree.getRoot(),balanceFactor)) count++;

        }
        System.out.println("Процент несбалансированных деревьев-> "+(count*100/capacity));
    }
}
