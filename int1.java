// interfaces can have methods and variables
interface TestInterface
{
     int a = 10;
    
      default void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class int1 implements TestInterface
{
    // Driver Code
      public static void main (String[] args) {
        int1 t = new int1();
        t.display();
        System.out.println(a);
    }
}
