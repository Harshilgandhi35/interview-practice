import java.util.Scanner;
public class PrimeNo {
    static boolean isPrime(int n)
    {
        for(int i = 2;i<n;i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no : ");
        n = sc.nextInt();
        if (n==0|n==1)
        {
            System.out.println(n+" is not prime number");
        }
        else
        {
            System.out.println(isPrime(n));
        }
    }
}
