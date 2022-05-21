package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WhislistPage;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
SkillraryLoginPage s=new SkillraryLoginPage(driver);
s.searchtextbox(p.getPropertyFiledata("name"));
s.serachbutton();

CorejavaPage c=new CorejavaPage(driver);
c.corejavaselenium();

WhislistPage w=new WhislistPage(driver);
driverutilies.switchFrames(driver);
w.playbutton();
Thread.sleep(10000);
w.pausebutton();
driverutilies.switchbackframe(driver);
w.addtowhislistbtn();


	}

}
