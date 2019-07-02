interface Base
{
    public abstract void cement();
}
interface Stairs
{
    public abstract void wood();
}
class FirstFloor implements Base,Stairs
{
    public void cement()
    {
        System.out.println("Cement for 1st floor");
    }
    public void wood()
    {
        System.out.println("Stairs for 1st floor");
    }
}
class TwoFloor implements Base,Stairs
{
    public void cement()
    {
        System.out.println("Cement for 2nd floor");
    }
    public void wood()
    {
        System.out.println("Stairs for the 2nd floor");
    }
}
class House
{
    public void Building(Base b1,Stairs s1)
    {
        b1.cement();
        s1.wood();
    }
}
class Architect
{
    public static void main(String[] args) {
        House house1=new House();
        Base floor1=new FirstFloor();
        Base floor2=new TwoFloor();
        Stairs str1=new FirstFloor();
        Stairs str2=new TwoFloor();
        house1.Building(floor2,str1);
    }
}
