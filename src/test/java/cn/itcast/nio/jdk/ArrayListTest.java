package cn.itcast.nio.jdk;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++ )
        {
            System.out.println("list size before add... " + list.size());
            list.add(i);
            System.out.println("list size after add..." + list.size());
            
        }
        
        for (int i = 0; i < list.size(); i ++ )
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
