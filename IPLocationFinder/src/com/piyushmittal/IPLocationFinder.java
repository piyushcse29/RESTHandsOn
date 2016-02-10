package com.piyushmittal;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1){
			System.out.println("Please pass valid Ip address\n");
		}
		else{
			  String ipaddress = args[0];
			  GeoIPService ipservice = new GeoIPService();
			   GeoIPServiceSoap geoIpServiceSoap = ipservice.getGeoIPServiceSoap();
			   GeoIP geoIp = geoIpServiceSoap.getGeoIP(ipaddress);
			   System.out.println("Hello" +geoIp.getCountryName());
			   
			
			
		}

	}

}
