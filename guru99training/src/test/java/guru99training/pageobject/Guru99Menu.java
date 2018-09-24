package guru99training.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Guru99Menu {
	
	protected final WebDriver driver;
	
	//@FindBy(id="a")
	
	public Guru99Menu (WebDriver driver)
	{
		super();
		this.driver = driver;
	}

}
