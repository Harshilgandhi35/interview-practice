import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagram {
    static boolean Anagram(String s1,String s2)
    {
        char[] arrayS1 = s1.toLowerCase().toCharArray();
        char[] arrayS2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arrayS1);    
        
        Arrays.sort(arrayS2);
        boolean status = Arrays.equals(arrayS1, arrayS2);   
        if (status == true)
        {
            return true;
        }       
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.println("enter string 2 : ");
        String str2 = sc.nextLine();
        System.out.println(Anagram(str1, str2));
    }
}
//steps
/* 
 Read or initialize two strings str1 and str2.
Find the length of both the strings.
Compare the length of the strings.
If length is not equal, print strings are not an anagram.
Else, do the following:
Convert the string into a character array.
Sort both the arrays by using the sort() method.
After sorting, compare the strings by using the equals() method. Store the value in a Boolean variable (status) returned by the equals() method.
Pass the variable in the if statement. If it returns true, the given strings are anagram. Else, not an anagram
*/