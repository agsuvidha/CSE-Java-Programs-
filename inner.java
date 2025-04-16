//inner class

class inner1 {
    int num=10;
    void show()
    {
        System.out.println(num);
    }
    class inner2
    {
        int sum=20;
        void print()
        {
            System.out.println(sum);
        }
    }
    
}
public class inner{
    public static void main(String[] args) {
        inner1 in1=new inner1();
        in1.show();
       inner1.inner2 in2=new inner1().new inner2(); 
       in2.print();
        System.out.println(in1.num+in2.sum);
    }
}