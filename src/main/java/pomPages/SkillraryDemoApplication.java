package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApplication {
	
	@FindBy(id="course")
	private WebElement cousetab;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	public WebElement getCousetab() {
		return cousetab;
	}

	@FindBy(xpath="//a[text()='Selenium Training']")
    private WebElement seleniumtrainig;
	
	public SkillraryDemoApplication(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumtrainingtab() {
		seleniumtrainig.click();
	}
	
	
}
