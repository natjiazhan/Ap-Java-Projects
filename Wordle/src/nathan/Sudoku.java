package nathan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class Sudoku {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {
    int i = 0, j = 0, k = 0;
    boolean result = false;
    int arr1[][];
    arr1 = new int[3][3];
    int arr2[];
    arr2 = new int[9];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the elements in the sudoku block");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            arr1[i][j] = Integer.parseInt(br.readLine());
        }
    }
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print(arr1[i][j] + "\t");
        }
        System.out.println(" ");
    }
    for (i = 0; i < 3; i++) { 
        for (j = 0; j < 3; j++) {
            arr2[i * 3 + j] = arr1[i][j];
        }
    }
    	for( i = 0; i < arr2.length; i++){
    		for(int m = i+1; m < arr2.length; m++){
    			if(arr2[i] == (arr2[m])){ 
    				result = true;
    				break;
    			}
    		}
    	}  
    	if(result){
    		System.out.println("\nNot a sudoku");
    	}
    	else{
    		System.out.println("\nIts a sudoku");
    		}
     }
}