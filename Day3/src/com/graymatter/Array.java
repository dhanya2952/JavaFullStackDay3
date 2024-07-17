package com.graymatter;

import java.util.Scanner;

public class Array {
	
	public static void main(String args[])
	{
		int arr[]= new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements of the array");
		for(int i=0; i<arr.length;i++)//length is not a method but a property of the array
			arr[i]=sc.nextInt();
		countOf(arr,2);
		
		
	}

	public static void countOf(int arr[],int key)
	{
//		int arr[]=new int[5];
//		//int key=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the elements of the array");
//		for(int i=0; i<arr.length;i++)//length is not a method but a property of the array
//			arr[i]=sc.nextInt();
//		System.out.println("enter the key element ");
//		key=sc.nextInt();
		int cnt=0;
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(key==arr[i])
				cnt++;	
		}
		System.out.println("count ="+cnt);
		//return cnt;
	}
	
	
	
}