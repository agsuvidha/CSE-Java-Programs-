public class dec1 {
    public static void main(String[] args) {
        long num=10011101;
        int x=0, y=0;
        long rem;
        
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            x+=(rem*Math.pow(2,y));
            y++;
        }
        System.out.println(x);
    }
}
