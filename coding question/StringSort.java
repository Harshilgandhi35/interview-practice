import java.util.*;

public class StringSort {
    static ArrayList<String> SortArr(String arr[])
    {
        ArrayList<String> arrlt = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            arrlt.add(arr[i]);

        }
        
        
        Collections.sort(arrlt);
        
        return arrlt;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many no of elements : ");
        n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(SortArr(arr));
    }
    
}
