package guru99training.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99Home extends Guru99Menu {
	
	@FindBy(xpath="//table//table//tr[3]/td")
	private WebElement mangerId;
	
	
	
	
	public Guru99Home (WebDriver driver)
	{
		super(driver);
	}
	
	public boolean checkMangerId(String id)
	{
		boolean isPresent = false;
		String prefix = "Manger Id : ";
		String mangerIdValue = mangerId.getText().substring(prefix.length());
		System.out.println(mangerIdValue);
		if (mangerIdValue.equals(id))
		{
			isPresent = true;
		}
		return isPresent;
	}

}
