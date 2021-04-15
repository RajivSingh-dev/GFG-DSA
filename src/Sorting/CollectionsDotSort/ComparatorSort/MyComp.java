package Sorting.CollectionsDotSort.ComparatorSort;

import java.util.Comparator;

public class MyComp implements Comparator<Point> {
    public int compare(Point p1,Point p2)
    {
        return p1.x-p2.x;
    }
}
