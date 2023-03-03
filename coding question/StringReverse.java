import java.util.Scanner;
public class StringReverse {
    static String Revesed(String str)
    {
        char ch;
        String rstr="";
        int l=str.length()-1;
        for(int i=l; i>=0; i--)
        {
            ch = str.charAt(i);
            rstr = rstr + ch;


        }
        return rstr;
    }

    public static void main(String[] args) {
        String str;
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        str = sc.nextLine();
        System.out.println("reverse is "+ Revesed(str));
    }
}
//we can also used string builder built in method
// Java program to ReverseString using StringBuilder
// import java.lang.*;
// import java.io.*;
// import java.util.*;

// Class of ReverseString
// class ReverseString {
// 	public static void main(String[] args)
// 	{
// 		String input = "Geeks for Geeks";

// 		StringBuilder input1 = new StringBuilder();

// 		// append a string into StringBuilder input1
// 		input1.append(input);

// 		// reverse StringBuilder input1
// 		input1.reverse();

// 		// print reversed String
// 		System.out.println(input1);
// 	}
// }
