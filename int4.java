//Anonymous inner class

interface  myint {
    void fun();
    void show();
}
public class int4
{
    public static void main(String[] args) 
    {
        myint m = new myint() 
        {
            public void fun()
            {
                System.out.println("in fun");
            }
            public void show()
            {
                System.out.println("in show");
            } 
            
        };

        m.fun();
        m.show();
        
    }
}
