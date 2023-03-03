import java.util.*;
public class SecondSmalles {
    static int Secondsmall(int arr[])
    {
        
        Arrays.sort(arr);
        //int k =arr.length-2;//if it is second max
        return arr[1];

        
        

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
        System.out.println("2nd small number  is :"+Secondsmall(arr));
        

    }
}
