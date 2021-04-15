package Sorting.CollectionsDotSort.ComparatorSort;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GFG {
    public static void main(String[] args) {
        List<Point> list=new ArrayList<>();
        list.add(new Point(5,10));
        list.add(new Point(2,20));
        list.add(new Point(10,30));
        Collections.sort(list,new MyComp());
        for (Point p:list)
        {
            System.out.println(p.x+" "+p.y);
        }
    }
}
