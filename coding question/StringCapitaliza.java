import java.util.Scanner;

public class StringCapitaliza {
    static String Ggh(String arr[])
{
    String str="";
    String demo;
    for (int i = 0; i < arr.length; i++) {
        demo = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);

        str = str +" "+demo;
        
    }
    return str;
}
    public static void main(String[] args) {
        String str;
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        str = sc.nextLine();
        String arr[] = str.split(" ",5);
        System.out.println(Ggh(arr));
    }
}
