package selenium.wechatautotest;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * jenkins启动TestNG.xml
     */
	 @Test
	 public void aa(){		
		 System.out.println("111111111111111111111111111111111111111111111111111111111111");
		TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();      
        suites.add("D:\\Workspaces\\WeChatAutoTest\\TestNG.xml");   //执行的路径
        //suites.add(".\\test-output\\testng-failed.xml");
        testNG.setTestSuites(suites);
        testNG.run();
        
        
        assertTrue( true );
        
     	
     } 
	 
	
}
