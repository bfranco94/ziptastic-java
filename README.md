# **Offcial Ziptastic Java Library (ALPHA)**

## **Index**

1. -[ ] **Ziptastic Object**  
  - Introduction
  - Documentation
  - Usage Examples

_________________________________________________________________________________________________________________________________________

###Ziptastic Object

[![Coverage Status](https://coveralls.io/repos/github/bfranco94/ziptastic-java/badge.svg?branch=master)](https://coveralls.io/github/bfranco94/ziptastic-java?branch=master) [![Build Status](https://travis-ci.org/Ziptastic/ziptastic-java.svg?branch=master)](https://travis-ci.org/Ziptastic/ziptastic-java)

####Introduction

  - The Ziptastic Object class is designed to offer a Java developer instant access to the Ziptastic API Service. This is done by encapsulating both Reverse and Forward Geocoding processes within the Ziptastic object and storing results from the request in an easy to access format.
  
####Documentation

#####Constructor Summary
  Constructor | Description
  -------|------------
  **Ziptastic**(String apiKey) | Creates an empty Ziptastic object with the Ziptastic API Key value.
  
#####Method Summary
  
  Method | Description
  -------|------------
  **GetFromLongLat**(double longitude, double latitude, int radius)  | Creates a url based on reverse geocoding, passes the url to the HTTPRequest method, and returns the results of a ReverseGeocoding API request.
  **GetFromZipcode**(int zipcode)  | Creates a url based on forward geocoding, passes the url to the HTTPRequest method, and returns the results of a ForwardGeocoding API request. 
  
  
####Usage Examples####
  - **Forward Geocoding**

  	'''
  	Ziptastic zipObj = new Ziptastic(apiKey);
  	String result = zipObj.GetFromZipcode(zipcode);
  	System.out.println(result);
  	'''
  	
  - **Reverse Geocoding**
  	
  	'''
  	Ziptastic zipObj = new Ziptastic(apiKey);
  	String result = zipObj.GetFromLongLat(longitude, latitude, radius);
  	System.out.println(result);
  	'''

####Sample Output####
  - **Invalid Key Request**

  		{
  			"message": "API Key Invalid."
		}


  - **Valid Key Request**	
  	
  		[
		    {
		        "city": "Owosso",
		        "geohash": "dpshsfsytw8k",
		        "country": "US",
		        "county": "Shiawassee",
		        "state": "Michigan",
		        "state_short": "MI",
		        "postal_code": "48867",
		        "latitude": 42.9934,
		        "longitude": -84.1595,
		        "timezone": "America/Detroit"
		    }
		]  	

####Maven Plugins####
  - **Checkstyle** :  http://checkstyle.sourceforge.net/
  - **PMD**        :  https://pmd.github.io/

####Future Work####
  - Add more tests.
  - Expand on java implementation of Ziptastic object. 
___________________________________________________________________________________________
