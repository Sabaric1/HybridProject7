package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException, InterruptedException {
SkillraryLoginPage s=new SkillraryLoginPage(driver);
s.gerasbutton();
s.skillrraydemoApplication();

SkillraryDemoApplication sd=new SkillraryDemoApplication(driver);
driverutilies.switchTabs(driver);
driverutilies.dropDown(sd.getCoursedd(),p.getPropertyFiledata("coursedd"));

TestingPage t=new TestingPage(driver);
driverutilies.dragdrop(driver,t.getSeleniumtrining(),t.getCart());
 Point fb = t.getFacebookicon().getLocation();
 int x = fb.getX();
 int y=fb.getY();
 
 
 
 driverutilies.scrollbar(driver, x, y);
 t.facebook();
 
 
 
	}

}
