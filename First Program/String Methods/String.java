import java.io.*;
import java.util.*;

class StringMethods
{
    public static void main(String args[])
    {
        String s = "Java Programming!";

        // Methods

        // 1.length()
        System.out.println("The length of s: "+s.length());

        // 2.charAt()
        System.out.println("The Character at 3rd index is: "+s.charAt(3));

        // 3.substring()
        System.out.println("Substring of s from index 1st to 6th: "+s.substring(1,6));

        // 4. Concat()
        String s1 = "New Way To Code";
        String s2 = " Java Programming!";
        String s3 = s1.concat(s2);
        System.out.println("Concatenated String: "+s3);

        // 5.indexOf()
        System.out.println("The index of 'g' in string is: "+s.indexOf('g'));

        // 6. equals()
        boolean s4 ;
        s4 = ("Java").equals("Java");
        System.out.println("They are equal or not: "+s4);

        // 7. equalsIgnoreCase()
        boolean s5 ;
        s5 = ("Java").equalsIgnoreCase("JAVA");
        System.out.println("They are equal or not: "+s5);

        // 8. compareTo()
        int out = s1.compareTo(s2);
        System.out.println("The Difference Between ASCII Code is: "+out);

        // 9. toLowerCase()
        System.out.println(s1.toLowerCase());

        // 10. toUpperCase()
        System.out.println(s1.toUpperCase());

        // 11. trim()
        String s6 = "       You Never Know";
        System.out.println("Trim the word: "+s6.trim());

        // 12. replace()
        String s7 = "Rever Rot Row";
        System.out.println("Original String: "+s7);
        String s8 = "Rever Rot Row".replace('R','N');
        System.out.println("New String: "+s8);
    }
}







