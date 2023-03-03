import java.util.Scanner;

class Sum {

    static int Summation(int a, int b) {

        return a + b;

    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        a = sc.nextInt();
        System.out.println("enter b");
        b = sc.nextInt();
        c = Summation(a, b);
        System.out.println(c);

    }
}