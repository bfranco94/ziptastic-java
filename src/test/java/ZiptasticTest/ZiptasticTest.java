/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZiptasticTest;



import Ziptastic_Object.Ziptastic;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.support.membermodification.MemberMatcher.method;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
/**
 *
 * @author bfranco
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest(Ziptastic.class)
@PowerMockIgnore("javax.net.ssl.*")

public class ZiptasticTest {
    
    private String testOutput = "{\n" +
                                    "  \"message\": \"API Key Invalid.\"\n" +
                                "}";
        
    
    @Test
    public void IvalidKeyTest() throws Exception{
        Ziptastic spy = PowerMockito.spy(new Ziptastic("abc123"));
        
        
        String results = spy.GetFromZipcode(48867);
        System.out.println(results);
        assertEquals(testOutput, results);
                     
    }
}
