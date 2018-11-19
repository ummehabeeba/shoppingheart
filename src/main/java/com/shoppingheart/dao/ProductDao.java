package com.shoppingheart.dao;

import java.util.List;

import com.shoppingheart.dto.ProductDetails;

public interface ProductDao 
{
	List<ProductDetails> search(String name);
	boolean add(ProductDetails details);
}