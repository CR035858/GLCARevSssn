package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.dao.ProductDao;
import com.gl.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public List <Product> getAllProductsSvc()
	{
		return productDao.getAllProducts();
	}
}
