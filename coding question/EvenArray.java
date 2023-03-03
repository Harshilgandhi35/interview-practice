import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Scanner;

public class EvenArray {
    static ArrayList<Integer> EvenArr(int arr[])
    {
        int arr1[];
       ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
       for (int i = 0; i < arr.length; i++) {
        if(arr[i]%2==0)
        {
            arrayList.add(arr[i]);
        }

        
       }
       
    return arrayList;

        
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
        
        System.out.println(EvenArr(arr));

    }
}
