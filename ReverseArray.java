//q1
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseArray {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner (System.in);
		int t= sc.nextInt();
		for(int i=0; i<t; i++){
		    int n= sc.nextInt();  
		    int[]arr= new int [n];
		    for (int j=0; j<n; j++)
		    {
		      arr[j]= sc.nextInt();
		    }
		     for (int j=n-1; j>=0; j--)
		    {
		     System.out.print(arr[j]+ " ");
		    }System.out.println();
		}
	}
}
