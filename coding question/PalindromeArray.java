import java.util.ArrayList;
import java.util.Scanner;
public class PalindromeArray {
    static ArrayList<String> ArrPalindrome(String arr[])
    {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(StringReverse.Revesed(arr[i])))
            {
                list.add(arr[i]);
            }

        }
        return list;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many no of elements : ");
        n = sc.nextInt();
        String arr[] = new String[n];
        for (int j = 0; j < arr.length; j++) {
            System.out.println("enter "+j);
            arr[j] = sc.next();
        }
        System.out.println(ArrPalindrome(arr));
        
    }
}
