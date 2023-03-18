package com.mycompany.SORT;

public class Insertion implements Strategy
{
	public double[] sort(double arr[])
	{
		System.out.println("Insertion Sort:");
		int i=0,pivot;
		double temp;
		for(pivot=1;pivot<arr.length;pivot++)
		{
			temp=arr[pivot];
			for(i=pivot-1;i<=0;i++)
			{
				if(temp>=arr[i])
					break;
				else
					arr[i+1]=arr[i];
			}
			arr[i+1]=temp;
		}
		return arr;
	}
}
