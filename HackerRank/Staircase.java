import java.io.*;
import java.util.*;

public class Staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Integer num = Integer.parseInt(scan.nextLine());
        
        for (int i = 1; i<num+1; i++){
            String str = "";
            for(int j = num; j>0; j--){
                if(j <= i){
                    str = str+"#";
                }else{
                    str = str+" ";
                }
            }
            System.out.println(str);
        }
    }
}