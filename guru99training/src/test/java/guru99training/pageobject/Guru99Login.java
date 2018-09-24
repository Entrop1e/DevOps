package guru99training.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Guru99Login extends Guru99Menu {
	
	By userName = By.name("uid");
	By pwd = By.name("password");
	By btnLogin = By.name("btnLogin");
	By title = By.xpath("//table/preceding-sibling::div/h2");
	
	
	public Guru99Login(WebDriver driver)
	{
		super(driver);
	}
	
	/* Login info - 06/09/18 - available 20 days
	 * 
	 * userName = mngr152325
	 * password = vahEjes
	 * 
	 */
	
	public boolean checkTitle()
	{ //"check login title on login page"
		boolean isPresent = false;
		if(this.driver.findElement(title).isDisplayed())
		{
			isPresent = true;
		}
		return isPresent;
	}
	
	public Guru99Home guruLogin(String userID, String password)
	{
		this.driver.findElement(userName).sendKeys("mngr152325");
		this.driver.findElement(pwd).sendKeys("vahEjes");
		this.driver.findElement(btnLogin).click();
		return PageFactory.initElements(driver, Guru99Home.class);
	}

}
