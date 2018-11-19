package com.shoppingheart.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductDetails")
public class ProductDetails {
	
	@Id
	@Column(name="product_Id")
	private int productid;
	@Column(name="product_Name")
	private String productName;
	@Column(name="porduct_Price")
	private int productPrice;
	@Column(name="productImage")
	//private String productImage;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
//	public String getProductImage() {
//		return productImage;
//	}
//	public void setProductImage(String productImage) {
//		this.productImage = productImage;
//	}
	
	
	
}
