
import java.io.*;
import java.util.*;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Input Text to be reversed
			  String input="doG edoc";
			  
//		create a stringbuilder object	  
			  StringBuilder input1 = new StringBuilder();
			  
//		append the input to a string	  
			  input1.append(input);
			  
//		reversing the string	  
			  input1=input1.reverse(); 
			  
//		Going through the 	  
			  for (int i=0;i<input1.length();i++)
				  
//		Outputing the results
			  System.out.print(input1.charAt(i));  

	}

}
