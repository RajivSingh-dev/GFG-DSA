package OOPSconcept.Inheritance;

public class classTest {
    public static void main(String[] args) {
Mountainbike mb=new Mountainbike(3,100,25);
        System.out.println(mb.PrintInfo());

mb.speedUp(20);
        System.out.println(mb.PrintInfo());
mb.setHeight(20);
        System.out.println(mb.PrintInfo());

    }
}
