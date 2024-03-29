package classone;

import org.testng.annotations.*;

/**
 * @author amalyahayrapetova
 */
public class ConfigurationAnnotationTest {

    /**
     * @BeforeSuite runs before a suite starts.
     * So, let’s use the @BeforeSuite annotated method to set up our system property for the browser.
     */
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Chrome - Set Up System Property");
    }

    /**
     * @BeforeTest runs before all tests.
     * We can demonstrate this by using @BeforeTest to open the browser before any tests begin.
     */
    @BeforeTest
    public void beforeTest() {
        System.out.println("Open Chrome");
    }

    /**
     * @BeforeClass runs before a test class starts, so let's use that method to open the test application.
     */
    @BeforeClass
    public void beforeClass() {
        System.out.println("Open Test Application");

    }

    /**
     * @BeforeMethod which runs before each @Test method.
     * Let's demonstrate this by having our @BeforeMethod sign into the application before each test runs.
     */
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Sign In");

    }

    /**
     * @Test annotation.
     * After all Before methods have executed, the @Test methods will run.
     * We can have as many @Test annotations as we want. Let's add a few here.
     */
    @Test
    public void searchCustomer() {
        System.out.println("Search For Customer");
    }

    /**
     * @Test annotation.
     * After all Before methods have executed, the @Test methods will run.
     * We can have as many @Test annotations as we want. Let's add a few here.
     */
    @Test
    public void searchProduct() {
        System.out.println("Search For Product");
    }

    /**
     * @AfterMethod runs after each @Test method.
     * We can use this to sign out of our application after each test finishes
     */
    @AfterMethod
    public void afterMethod() {

        System.out.println("Sign Out");
    }

    /**
     * @AfterClass runs after all @Test methods, so we will use that method to close the test application.
     */
    @AfterClass
    public void afterClass() {
        System.out.println("Close Test Application");

    }

    /**
     * @AfterTest runs after all @Test methods.
     * We can use our @AfterTest method to close the browser after all @Test methods have completed.
     */
    @AfterTest
    public void afterTest() {
        System.out.println("Close Chrome");

    }

    /**
     * @AfterSuite runs after all @Test methods within the suite have completed running.
     * So, we'll use the @AfterSuite annotated method to clean up cookies.
     */
    @AfterSuite
    public void afterSuite() {
        System.out.println("Chrome - Clean Up All Cookies");
    }
}


