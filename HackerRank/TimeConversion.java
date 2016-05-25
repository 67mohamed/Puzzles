import java.io.*;
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        int hour = Integer.parseInt(inputString.substring(0,2));
        if(inputString.substring(8,10).equals("PM")){
        	if(hour != 12){
        		hour = hour + 12;
        	}
        	
        	System.out.println(hour+inputString.substring(2,8));
        	
            
        }else{
        	if(hour == 12){
        		System.out.println("00"+inputString.substring(2,8));
        	}else{
        		System.out.println(inputString.substring(0,8));
        	}
        	
        }
        
    }
}