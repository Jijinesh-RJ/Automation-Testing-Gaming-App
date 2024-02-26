package automation.scripts.jrj;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GameAutomation {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		BaseClass b = new BaseClass();
		WebDriver driver = b.launchBrowser();
		GamePojo gp = new GamePojo();	
		b.launchUrl(driver, "https://www.gamepoint.com/login.php?exitUrl=applet.php&guest=1&loginType=guest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		b.typeText(gp.getTxtUser(), "Add your Username"); //Add your username here
		b.typeText(gp.getTxtPass(), "Add your Password"); //Add your password here
		b.btnClick(gp.getBtnLogin());
		b.btnClick(gp.getLogoImg());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		b.mouseHover(driver,gp.getGameWrapper());
		b.mouseHover(driver,gp.getGameContainer());
		gp.getPlayBtn().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		By tabLocator = By.xpath("//img[@class='closeOverlay gpui-closebutton']");
        	b.handleTab(driver, tabLocator);
		driver.switchTo().frame(gp.getToFrame());
		gp.getStartScrnBtn().click();
		gp.getBetBtn().click();
		gp.getCoinAmount().click();
		gp.getAcceptBtn().click();
		System.out.println(b.srchPlayer(gp.getSrchUser()));
		driver.switchTo().defaultContent();
		gp.getHmbDdn().click();
		gp.getMenuLogout().click();
		System.out.println("End");
	}
}
