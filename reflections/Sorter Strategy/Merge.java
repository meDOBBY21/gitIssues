package com.mycompany.app;

public class Merge implements Strategy
{
	
	public double[] sort(double arr[])
	{
		// System.out.println("Merge Sort:");
		return split(arr,0,arr.length-1);
	}

	double[] split(double arr[],int start,int end)
	{
		int mid;
		double temp[] = new double[end+1];
		if(start==end)
		{
			double arr1[]={arr[start]};
			return arr1;
		}
		if(start < end)
		{
			mid=(start+end)/2;
			double arr1[]=split(arr,start,mid);
			double arr2[]=split(arr,mid+1,end);
			temp= merge(arr1,arr2);
		}
		return temp;
	}

	double[] merge(double arr1[],double arr2[])
	{
		int a1Start=0;
		int a1end=arr1.length;
		int a2start=0;
		int a2end=arr2.length;
		int length=arr1.length+arr2.length;
		double temp[]= new double[length] ;
		int k=0;
		while(a1Start<a1end && a2start<a2end)
		{
			if(arr1[a1Start]<arr2[a2start])
				temp[k++]=arr1[a1Start++];
			else
				temp[k++]=arr2[a2start++];
		}
		if(a1Start==a1end)
			while(a2start<a2end)
				temp[k++]=arr2[a2start++];
		else if(a2start==a2end)
			while(a1Start<a1end)
				temp[k++]=arr1[a1Start++];
		return temp;
	}

}