import java.util.Scanner;
public class scan1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numer");
        int x=s.nextInt();
        System.out.println("Enter letter");
        char a=s.next().charAt(0);
        System.out.println("Enter boolean");
        boolean a1=s.nextBoolean();
        System.out.println("Enter float");
        float w=Float.parseFloat(s.nextFloat());
        //s.nextLine();
        System.out.println("Enter string");
        String s1=s.nextLine();
        
    }
    
}
