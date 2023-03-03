//in these program i have used the previous class StringReversed which contains reverse of string
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
    String str1;
    String str2;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string to check palindrome : ");
    str1 = sc.nextLine();
    StringReverse sr = new StringReverse();
    str2=StringReverse.Revesed(str1);
    if (str1.equals(str2))
    {
        System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }

}    
}
