package calender;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import utilities.SeleniumUtility;
import utilities.SeleniumUtility;

public class LocationValidation {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		String a=s1.get("https://demo.vtiger.com/vtigercrm/index.php");
		 // Verify that password field comes after username field
		 // Verify that signIn button comes after password field
		 
		WebElement userName=s1.findElement(By.id("username"));
		Point userNameLocation=userName.getLocation();
		int userName_X=userNameLocation.getX();
		int userName_Y=userNameLocation.getY();
		System.out.println("Username x cord: "+userName_X);
		System.out.println("Username y cord: "+userName_Y);
		
		WebElement password=s1.findElement(By.id("password"));
		Point passwordLocation=password.getLocation();
		int pwd_X=passwordLocation.getX();
		int pwd_Y=passwordLocation.getY();
		System.out.println("Password x cord: "+pwd_X);
		System.out.println("Password y cord: "+pwd_Y);
		
		System.out.println("Check whether Password field comes after/below Username field-->"+(userName_Y<pwd_Y));
		
		WebElement signInButton=s1.findElement(By.cssSelector("button[type='submit']"));
		Point signInButtonLocation=signInButton.getLocation();
		int btn_X=signInButtonLocation.getX();
		int btn_Y=signInButtonLocation.getY();
		System.out.println("SignIN Button x cord: "+btn_X);
		System.out.println("SignIN Button y cord: "+btn_Y);
		
		System.out.println("Check whether SingIN button comes after password field--->"+(pwd_Y<btn_Y));
		
	}
}