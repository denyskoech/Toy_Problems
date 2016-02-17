
import java.util.Arrays;
import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String args[]){
	    int array[] = new int[]{32, 45, 778, 223, 276, 988};
	 
	    int max = getMax(array);
	    System.out.println("Max value " +max);
	 
	    int min = getMin(array);
	    System.out.println("Min value " +min);
	  }
	 
//	  Function to get the maximum
	  public static int getMax(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
//	  Function to get the minimum
	  public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	}