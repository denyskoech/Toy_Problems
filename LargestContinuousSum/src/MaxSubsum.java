
import java.io.*;
public class MaxSubsum {
	public static int MaxSum(int[] array) {
	    int maxsum = 0;
	    int sum = 0;
	    for (int i = 0; i < array.length; i++) 
	    {
	        sum += array[i];
	        if (maxsum < sum) 
	        {
	            maxsum = sum;
	        } 
	        else if (sum < 0) 
	        {
	            sum = 0;
	        }
	    }
	    return maxsum;
	    }
	    public static void main (String[] args) throws IOException
	    {
	        int[] a=new int[25];
	        int num=0,i=0;      
	        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter the Number of element");
	        num=Integer.parseInt(reader.readLine());
	        System.out.println("Enter the array");
	        for(i=1;i<=num;i++)
	        {
	            a[i]=Integer.parseInt(reader.readLine());
	        }
	        int value = MaxSum(a);
	        System.out.println("The maximum sub sum is:"+value);
	    }
}
