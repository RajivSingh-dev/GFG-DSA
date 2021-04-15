package Sorting.ArraysDotSort.ComparatorSort;


import java.util.Arrays;

public class ObjectSortingComparator {
    public static void main(String[] args) {
       Point arr[]={new Point(10,20),new Point(3,12),new Point(5,7)};
        Arrays.sort(arr,new MyComp());
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].x+" "+arr[i].y);
        }
    }
}
