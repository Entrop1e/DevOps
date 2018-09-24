package guru99training.junit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import guru99training.pageobject.Guru99Home;
import guru99training.pageobject.Guru99Login;

public class Guru99Test {

    private WebDriver driver;
    private String id = "mngr152325";
    private String password ="vahEjes";

    @BeforeSuite
    public void openGuru() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\gblin\\Documents\\chromedriver.exe");
		this.driver = new FirefoxDriver();	
		this.driver.manage().window().maximize();
		this.driver.get("http://demo.guru99.com/V4/");
    }
    
    @Test
    public void loginTest()
    {
    	Guru99Login loginPage = PageFactory.initElements(this.driver, Guru99Login.class);
    	assertTrue(loginPage.checkTitle(),"check login Page Displayed"); // inversion par rapport à JUnit
    	Guru99Home homePage = loginPage.guruLogin(id, password);
    	assertEquals(driver.getCurrentUrl(), "http://demo.guru99.com/V4/manager/Managerhomepage.php", "loginToHome page switch");
    	assertTrue(homePage.checkMangerId(id), "check correct mangerId");
    }

}
