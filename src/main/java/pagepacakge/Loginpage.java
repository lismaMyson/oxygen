package pagepacakge;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/ul[2]/li[4]/span")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/div/button/span/span")
	WebElement createaccount;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/div/form/div[2]/button")
	WebElement clickhere;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/div/form/div[1]/div/span/span[1]/input")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/div/form/div[2]/div/span/span[1]/input")
	WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/div/form/div[3]/div/span/span[1]/input")
	WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/div/form/div[4]/div/span/span[1]/input")
	WebElement setpassword;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/div/form/div[7]/button")
	WebElement continuebutton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/form/div[1]/div/span/span[1]/input")
	WebElement loginemail;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/form/div[2]/div/span/span[1]/input")
	WebElement loginpass;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/form/div[5]/button[1]")
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/aside/div/div/div/div/div/form/div[5]/button[1]")
	WebElement logoutbutton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/header/nav/div[1]/div/div/div[2]/ul[2]/li[2]/a")
	WebElement wish;
	
	
	
	public Loginpage(WebDriver driver) {//constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void register() {
		login.click();
		createaccount.click();
		clickhere.click();
		email.sendKeys("qween@gmail.com");
		firstname.sendKeys("cathy");
		lastname.sendKeys("Myson");
		setpassword.sendKeys("123456@789Liz");
		continuebutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.navigate().refresh();
		wish.click();
		
		}

	public void setvaues(String emailf,String passf) {
		loginemail.clear();
		loginemail.sendKeys(emailf);
		loginpass.clear();
		loginpass.sendKeys(passf);
	}
	public void userlogin() {
		loginbutton.click();
	}
	
}
