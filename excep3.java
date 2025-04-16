// Using all 5 keywords of exception
class myexcep extends Exception
{
    static void divide(int a, int b) throws myexcep
    {
        if(b==0)
        {

            throw new myexcep();
        }
        else
        {
            System.out.println(a/b);
        }
    }
}
public class excep3 {
    public static void main(String[] args) {
        try
        {
        myexcep.divide(10,2);
        }
        catch(myexcep e)
        {
            System.out.println("in except");
        }
        finally
        {
            System.out.println("Will print");
        }
    }
    
}
