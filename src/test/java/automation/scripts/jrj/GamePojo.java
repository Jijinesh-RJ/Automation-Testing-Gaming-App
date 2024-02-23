package automation.scripts.jrj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamePojo extends BaseClass {
	public GamePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@type='text'])")
	private WebElement txtUser;
	@FindBy(xpath = "(//input[@type='password'])")
	private WebElement txtPass;
	@FindBy(id = "loginButton2014")
	private WebElement btnLogin;
	@FindBy(xpath = "//img[@alt='GamePoint']")
	private WebElement logoImg;
	@FindBy(xpath = "(//div[@class='boxv3 gamebutton'])[29]")
	private WebElement gameWrapper;
	@FindBy(xpath = "(//div[@class='game_container_overlay_wrapper'])[29]")
	private WebElement gameContainer;
	@FindBy(xpath = "(//button[@data-awsma-name='gameButton'])[29]")
	private WebElement playBtn;
	@FindBy(xpath = "//button[@class='startscreen-button startscreen-button-normal']")
	private WebElement startScrnBtn;
	@FindBy(xpath = "(//div[@class='ss-selected-option'])[1]")
	private WebElement betBtn;
	@FindBy(xpath = "(//div[@class='ss-option'])[1]")
	private WebElement coinAmount;
	@FindBy(xpath = "(//button[@class='custom-button green'])[1]")
	private WebElement acceptBtn;
	@FindBy(xpath = "//div[@class='enqueuescreen-text']")
	private WebElement srchUser;
	@FindBy(xpath = "(//iframe[@scrolling='no'])[3]")
	private WebElement toFrame;
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	private WebElement hmbDdn;
	@FindBy(id = "menuItemLogout")
	private WebElement menuLogout;

	public WebElement getHmbDdn() {
		return hmbDdn;
	}

	public WebElement getMenuLogout() {
		return menuLogout;
	}

	public WebElement getGameWrapper() {
		return gameWrapper;
	}

	public WebElement getGameContainer() {
		return gameContainer;
	}

	public WebElement getPlayBtn() {
		return playBtn;
	}

	public WebElement getStartScrnBtn() {
		return startScrnBtn;
	}

	public WebElement getBetBtn() {
		return betBtn;
	}

	public WebElement getCoinAmount() {
		return coinAmount;
	}

	public WebElement getAcceptBtn() {
		return acceptBtn;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getLogoImg() {
		return logoImg;
	}

	public WebElement getSrchUser() {
		return srchUser;
	}

	public WebElement getToFrame() {
		return toFrame;
	}
}
