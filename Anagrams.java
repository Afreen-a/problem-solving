import java.io.*;
import java.util.*;

class Result {

  
    public static int makingAnagrams(String s1, String s2) {
    // c stores frequency of characters
    int[] c = new int[26];
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    
    for(int i=0;i< s1.length();i++)
    {
        c[s1.charAt(i)-'a']++;
    }
    
    for(int i=0;i< s2.length();i++)
    {
        c[s2.charAt(i)-'a']--;
    }
    
    int total = 0;
    for(int i:c)
    {
        total+= Math.abs(i);
    }
    return total;
    }

}

public class Anagrams {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String s2 = sc.nextLine();
        int result = Result.makingAnagrams(s1, s2);
        System.out.println(result);
        sc.close();
        
    }
}
