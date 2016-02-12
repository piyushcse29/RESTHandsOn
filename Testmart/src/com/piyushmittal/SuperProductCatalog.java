package com.piyushmittal;

import java.util.List;

import javax.jws.WebService;

import com.piyushmittal.model.Product;
@WebService(name = "TestMartCatalog", targetNamespace = "http://www.testmart.com")
public interface SuperProductCatalog {

	List<String> getProductCategories();

	List<String> getProducts(String category);

	List<Product> getProductsV2(String category);

	boolean addProducts(String category, String product);

}