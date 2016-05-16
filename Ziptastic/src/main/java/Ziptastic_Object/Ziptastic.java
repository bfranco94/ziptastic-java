/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ziptastic_Object;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class Ziptastic {
    
    private static String url = "https://zip.getziptastic.com/v3/US/";
    private static String apiKey;
    
    public Ziptastic(String key) {
       this.apiKey = key; 
    }
    
    
    public static String ForwardGeocoding(int zipcode) throws IOException{
        
        String getData;
        
        String urlBuilder = url;
        urlBuilder = urlBuilder.concat(Integer.toString(zipcode));
        
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
             
            HttpGet httpGet = new HttpGet(urlBuilder);
            httpGet.addHeader("x-key", apiKey);
             
            try (CloseableHttpResponse response = httpclient.execute(httpGet)) {
                
                HttpEntity entity = response.getEntity();
                getData = EntityUtils.toString(entity);
                EntityUtils.consume(entity);
                
            }
        }
        return getData;
    }

}
