import java.util.Scanner;
public class LargeNoInArray {
    static int LargeNo(int arr[])
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
            {
                max=arr[i];
            }
            else
            {
                continue;
            }
        }
        return max;
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
        System.out.println("max is :"+LargeNo(arr));
        


    }
}
