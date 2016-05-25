import java.io.*;
import java.util.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Integer num = Integer.parseInt(scan.nextLine());
        String[] numbers = scan.nextLine().split("\\s+");
        Long ans = 0L;
        for(String s: numbers){
        	ans = ans + Long.parseLong(s);
        }
        
        System.out.println(ans);
    }
}