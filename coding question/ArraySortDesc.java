import java.lang.reflect.Array;
import java.util.*;
public class ArraySortDesc {
    static ArrayList<Integer> SortDesc(int arr[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
        
        
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many no of elements : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(SortDesc(arr));

    }
}
