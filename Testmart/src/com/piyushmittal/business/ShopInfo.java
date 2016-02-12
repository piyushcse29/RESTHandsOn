package com.piyushmittal.business;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.piyushmittal.InvalidInputException;

@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {
	@WebResult(partName = "lookupOutput")
	public String getShopInfo(@WebParam(partName ="lookupImput") String property) throws InvalidInputException{
		String response = "Invalid Property";
		if("shopName".equals(property)){
			response = "Test Mart";
		}else if("since".equals(property)){
			response = "since 2012";
		}
		else{
			throw new InvalidInputException("Invalid Input", "Property is not valid input");
		}
		return response;
	}

}
