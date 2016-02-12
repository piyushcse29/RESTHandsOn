package com.piyushmittal.business;

import java.util.ArrayList;
import java.util.List;

import com.piyushmittal.model.Product;

public class ProductServiceImpl {
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();
	
	public ProductServiceImpl(){
		bookList.add("Three Mistakes of my Life");
		bookList.add("Spring in Action");
		bookList.add("Coreman DataStructure");
		
		musicList.add("(90s Hits");
		musicList.add("Top of the week");
		musicList.add("Top 2000");
		
		movieList.add("Most Wanted");
		movieList.add("Joker");
		movieList.add("Welcome");
	}
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	} 
	
	public List<Product> getProductsV2(String category){
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Complete Refrence", "1234", 999999));
		productList.add(new Product("SQL ", "345", 99999));
		return productList;
	} 
	
	public boolean addProducts(String category, String product){
		switch(category.toLowerCase()){
		case "books":
		    bookList.add(product);
		case "music":
			 musicList.add(product);
		case "movies":
			 movieList.add(product);
	    default:
				 return false;
		}
		
	} 
}
