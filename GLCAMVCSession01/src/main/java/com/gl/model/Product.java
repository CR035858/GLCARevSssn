package com.gl.model;

public class Product {
	
	String productId;
	String productName;
	String productCategory;
	int pricePerUnit;
	int quantityOnHand;
	
	public Product() {
		super();
	}

	public Product(String productId, String productName, String productCategory, int pricePerUnit, int quantityOnHand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.pricePerUnit = pricePerUnit;
		this.quantityOnHand = quantityOnHand;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", pricePerUnit=" + pricePerUnit + ", quantityOnHand=" + quantityOnHand + "]";
	}
	
	
	

}
