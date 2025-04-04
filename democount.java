//Thread Synchronization - Counter

class Counter 
{
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class democount 
{
    public static void main(String[] args) 
    {
        Counter c=new Counter();
        Thread th1=new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<10000;i++)
                {
                    c.increment();
                }
            }
        }); 
        
        
        Thread th2=new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<10000;i++)
                {
                    c.increment();
                }
            }
        });
        
        th1.start();
        th2.start();
        try
        {
            th1.join();
            th2.join();
        }
        catch(Exception e)
        {

        }
        System.out.println("Count : "+c.count);
    }    
}
