import java.io.*;
import java.util.*;

public class AngryProfessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int testCases = Integer.parseInt(scan.nextLin());

    	for(int i = 0; i<testCases; i++){
    		String[] student  = scan.nextLine().split("\\s+");
    		String[] time     = scan.nextLine().split("\\s+");
    		int threshold     = Integer.parseInt(student[1]);
    		int onTime = 0;
    		for(String t: time){
    			if(Integer.parseInt(t) <= 0){
    				onTime++;
    			}
    		}
    		if(onTime>=threshold){
    			System.out.println(YES);
    		}else{
    			System.out.println(NO);
    		}



    	}
    }
}