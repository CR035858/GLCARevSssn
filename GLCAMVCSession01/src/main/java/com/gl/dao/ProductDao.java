package com.gl.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.model.Product;

@Repository
public class ProductDao {
	
	ArrayList <Product> products = new ArrayList<Product>();

	public ProductDao() {
		
		Product product1 = new Product("P001","Television","Electronics",25000,100);
		Product product2 = new Product("P002","Refrigerator","Electronics",45000,150);
		Product product3 = new Product("P003","MixerGrinder","HomeAppliance",20000,200);
		Product product4 = new Product("P004","LapTop","Electronics",65000,200);
		Product product5 = new Product("P005","AirConditioner","Electronics",35000,150);
		Product product6 = new Product("P006","CupBoard","Furniture",20000,300);
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);
			
	}
	
	public List <Product> getAllProducts()   // 10 + 10
	{
		return products;
	}
	
	

}
