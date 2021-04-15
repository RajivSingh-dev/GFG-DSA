package Sorting;

public class InsertionSort {
    static void isort(int a[])
    {

        for (int i = 1; i <a.length ; i++) {
int key=a[i];
int j=i-1;
while (j>=0 && a[j]>key)
{
    a[j+1]=a[j];
    j--;
}
a[j+1]=key;

        }
    }
    public static void main(String[] args) {
        int a[]={20,40,50,60,10,30};
        isort(a);
    }
}
