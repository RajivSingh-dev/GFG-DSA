package OOPSconcept.Inheritance;

public class Mountainbike extends Bicycle {

    public int seatHeight;
    public Mountainbike(int gear,int speed,int startHeight)
    {
        super(gear,speed);
        seatHeight=startHeight;
    }
    public void setHeight(int newValue)
    {
        seatHeight=newValue;
    }

    @Override
    public String PrintInfo()
    {
        return (super.PrintInfo()+"seat height"+seatHeight);
    }
}

