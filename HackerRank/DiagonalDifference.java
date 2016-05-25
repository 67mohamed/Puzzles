import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Integer num = Integer.parseInt(scan.nextLine());
        int primaryDiag = 0;
        int secondaryDiag = 0;


        for(int i = 0; i<num; i++){
        	String[] row = scan.nextLine().split("\\s+");
        	//Primary Diagonal
        	primaryDiag = primaryDiag + Integer.parseInt(row[i]);

        	//Secondary Diagonal
        	secondaryDiag = secondaryDiag + Integer.parseInt(row[(num-1)-i]);
        }

        System.out.println(Math.abs(primaryDiag - secondaryDiag));
    }
}