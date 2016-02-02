/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int toSearch = in.nextInt();
		System.out.println("Number to search: " + toSearch);
		int[] arr = new int[7];
		Ideone id = new Ideone();
		for(int i = 0; i< arr.length ; i++)
		{
			arr[i] = in.nextInt();
		}
		
		int low = 0;
		int high = arr.length - 1;
		id.BinarySearch(low,high,arr,toSearch);
	}
	
	void BinarySearch(int low, int high, int[] arr,int toSearch)
	{
			int mid = low + (high - low)/2;
			if(arr[mid] == toSearch)
			{
				System.out.println("Number is found: " + arr[mid] + " at index: " + mid + " of array.." );
				//break;
			}
			else if(toSearch < arr[mid])
			{
				System.out.println("mid "+arr[mid]);
				BinarySearch(low,mid-1,arr,toSearch);
			}
			else if(toSearch > arr[mid])
			{
				System.out.println("mid "+arr[mid]);
				BinarySearch(mid+1,high,arr,toSearch); 
			}
			
	}
	
}