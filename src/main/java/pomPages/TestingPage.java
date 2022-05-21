package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
    private WebElement seleniumtrining;
	
	public WebElement getSeleniumtrining() {
		return seleniumtrining;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}

	@FindBy(id="mycart")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumtratinigtab() {
		seleniumtrining.click();
	}
	
	public void addtocart() {
		cart.click();
	}
	
	public void facebook() {
		facebookicon.click();
	}
	
	
	
	
	
	
}
