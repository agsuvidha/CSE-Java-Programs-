class A extends Thread
{
    public void run()
    {
        for(int i=1;i<500;i++)
        {
            System.out.println("In A");
        }
        }
}


class B extends Thread
{
    public void run()
    {
        for(int i=1;i<500;i++)
        {
            System.out.println("In B");
        }
    }
}

public class demothread 
{
    public static void main(String[] args) throws Exception 
    {
        A a=new A();
        B b=new B();
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("In main");    
    }
}
