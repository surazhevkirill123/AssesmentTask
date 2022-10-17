package test;

import utils.DriverUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseWebTest {
    @BeforeSuite
    public void openBrowser(){
        DriverUtils.openBrowser();
        DriverUtils.browserConfiguration();
    }

    @AfterSuite
    public void closeBrowser(){
        DriverUtils.closeBrowser();
    }
}
