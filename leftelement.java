package basics;
import java.util.*;

public class leftelement {
   public long leftElement(long arr[], long n)
	 {
	    // Your code goes here  
       Arrays.sort(arr);
       int mid=(int)(n/2);
       if(n%2!=0){
           return arr[mid];
       }
       else
           return arr[mid-1];
    }
		
		
  public static void main(String args[]) {
	      leftelement obj=new  leftelement();
		  long arr[]=new long[5];
		  arr[0]=2;
		  arr[1]=7;
		  arr[2]=6;
		  arr[3]=5;
		  arr[4]=4;
		  
		  System.out.println( obj.leftElement(arr, 5));
	  }
	   
	    
	}


