 package com.piyushmittal;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.piyushmittal.business.ProductServiceImpl;
import com.piyushmittal.model.Product;
@WebService(endpointInterface = "com.piyushmittal.SuperProductCatalog", portName= "TestMartCatalogPort", serviceName= "TestMartCatalogService")
public class ProductCatalog implements SuperProductCatalog {
	ProductServiceImpl productService = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.piyushmittal.SuperProductCatalog#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		
		return productService.getProductCategories() ;
	}
	
    /* (non-Javadoc)
	 * @see com.piyushmittal.SuperProductCatalog#getProducts(java.lang.String)
	 */
    @Override
	public List<String> getProducts(String category){
		
		return productService.getProducts(category ) ;
	}
    
    /* (non-Javadoc)
	 * @see com.piyushmittal.SuperProductCatalog#getProductsV2(java.lang.String)
	 */
    @Override
	public List<Product> getProductsV2(String category){
		
		return productService.getProductsV2(category ) ;
	}
    
    /* (non-Javadoc)
	 * @see com.piyushmittal.SuperProductCatalog#addProducts(java.lang.String, java.lang.String)
	 */
    @Override
	public boolean addProducts(String category, String product){
		
		return productService.addProducts(category, product ) ;
	}
}
