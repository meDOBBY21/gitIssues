package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.Sorter;
// import com.mycompany.app.Strategy;


@RestController
public class ServiceController{
	double arr[]={10,14,12,1,2,3,4};
	Sorter sorter=new Sorter();
	
	@RequestMapping("/BUBBLE")	
	public double[] bubble(){	
		sorter.setStrategy("BUBBLE");
		return sorter.soort(arr);
	}
	@RequestMapping("/MERGE")	
	public double[] merge(){	
		sorter.setStrategy("MERGE");
		return sorter.soort(arr);
	}
	@RequestMapping("/INSERTION")	
	public double[] insertion(){	
		sorter.setStrategy("INSERTION");
		return sorter.soort(arr);
	}
}
