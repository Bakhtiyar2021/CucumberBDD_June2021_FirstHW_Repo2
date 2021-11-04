package setpDef;

import base.Setup;
import org.junit.After;
import org.junit.Before;

public class Hook extends Setup {

    public static String env = System.getProperty("env");
    public static String driverType = System.getProperty("browser");
    public static String url;

    @Before
    public void startTest(){

    }

    @After
    public void endTest(){

    }





}
