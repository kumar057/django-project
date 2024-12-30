package BROWSER1.cgffuhj;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class App{
	
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.apple.com/in/");
			Thread.sleep(4000);
			Actions actions=new Actions(driver);
			actions.perform();
			driver.get("https://www.facebook.com/r.php?entry_point=login");
			Thread.sleep(6000);
			driver.findElement(By.name("sex")).click();			
			WebElement maleRadiobutton = driver.findElement(By.xpath("//input[@value = Male]"));

		if (maleRadiobutton.isSelected()) {
			System.out.println("display male radio button is selected");
			
		}else
			
		{
			System.out.println("display female & custom radio buttons are unselected");
		}






	}

		private static action newActions() {
	
			return null;
		}

}