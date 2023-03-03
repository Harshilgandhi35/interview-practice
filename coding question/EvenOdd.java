import java.util.Scanner;
public class EvenOdd {
    static boolean EvOdd(int n)
    {
        if (n%2==0)
        {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(EvOdd(n));
        
        
    }
}
