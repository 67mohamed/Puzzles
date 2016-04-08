import java.io.*;
import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int testCases = Integer.parseInt(scan.nextLine());
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i = 0; i<testCases; i++){
    		list.add(Integer.parseInt(scan.nextLine()));
    	}
    	for(int i: list){
    		int height = 1;
    		for(int k = 1; k<i+1; k++){
    			if(k%2 == 1){
    				height = height * 2;
    			}else if(k%2 == 0){
    				height++;
    			}
    		}
    		System.out.println(height);

    	}

    }
}