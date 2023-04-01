package com.mycompany.app;

public class Sorter
{
	Strategy strategy;

	public double[] soort(double arr[],String alg){
		if(alg=="BUBBLE")
			strategy=new Bubble();
		if(alg=="MERGE")
			strategy=new Merge();
		if(alg=="INSERTION")
			strategy=new Insertion();
		return strategy.sort(arr);

	}
	public double[] soort(double arr[]){
		return strategy.sort(arr);

	}
	public void setStrategy(String alg){
		if(alg=="BUBBLE")
			strategy=new Bubble();
		if(alg=="MERGE")
			strategy=new Merge();
		if(alg=="INSERTION")
			strategy=new Insertion();
	}


	void display(double arr[])
	{
		int i;
		for (i=0;i<arr.length ;i++ ) 
		{
			System.out.print(arr[i]+"\t");	
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Sorter sorter=new Sorter();

		double arr[]={10,14,12,1,2,3,4};
		double output[]=sorter.soort(arr,"BUBBLE");
		sorter.display(output);

		sorter.setStrategy("MERGE");
		output=sorter.soort(arr);
		sorter.display(output);
		
		sorter.setStrategy("INSERTION");
		output=sorter.soort(arr);
		sorter.display(output);
	}

	
}
