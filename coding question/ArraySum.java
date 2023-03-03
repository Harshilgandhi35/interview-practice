import java.util.Scanner;
public class ArraySum {
    static int ArraySummation(int a[])
    {
        int ans=0,i;
        for(i=0;i<=a.length;i++)
        {
            ans = ans +i;

        }
        return ans;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println(ArraySummation(arr));
        
    }
}
