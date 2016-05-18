# **Offcial Ziptastic Java Library (ALPHA)**

## **Index**

1. -[ ] **Ziptastic Object**
  - Introduction
  - Documentation
  - Usage Examples

_________________________________________________________________________________________________________________________________________

###Ziptastic Object


####Introduction

  - The Ziptastic Object class is designed to offer a Java developer instant access to the Ziptastic API Service. This is done by encapsulating both Reverse and Forward Geocoding processes within the Ziptastic object and storing results from the request in an easy to access format.
  
####Documentation

#####Constructor Summary
  Constructor | Description
  -------|------------
  Ziptastic(String apiKey) | Creates an empty Ziptastic object with the Ziptastic API Key value.
  
#####Method Summary
  
  Method | Description
  -------|------------
  GetFromLongLat(double longitude, double latitude, int radius)  | Creates a url based on reverse geocoding, passes the url to the HTTPRequest method, and returns the results of a ReverseGeocoding API request.
  GetFromZipcode(int zipcode)  | Creates a url based on forward geocoding, passes the url to the HTTPRequest method, and returns the results of a ForwardGeocoding API request. 
  
  
####Usage Examples####
  - COMING SOON!

####Future Work####
  - Break apart and store values from Requests in self-contained array of hash-maps, while handeling potential error codes appropriately.
  - Start unit testing and build coverage.

_________________________________________________________________________________________________________________________________________
