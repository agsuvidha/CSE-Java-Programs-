//Inheritance

class base {
 void show()
 {
    System.out.println("in base");
 }   
}
class derived extends base
{
    void show()
    {
        System.out.println("in derived");
    }
    void print()
    {
        super.show();
    }

}
public class fin
{
    public static void main(String[] args) {
     derived d=new derived();
     d.show();
        d.print();
    }
}