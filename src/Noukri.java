import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noukri {

	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "..\\Taxilla_Project\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")).click();;
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//div[contains(text(),'More')]")).click();
		
		driver.switchTo().defaultContent();
		
		Set<String> wins = driver.getWindowHandles();
		
		int j =1;
		
		for (String win : wins) {
			
			if (j==2 || j==3 || j==4) {
				
				System.out.println("Entered");
				
				driver.switchTo().window(win);
				
				System.out.println("Switched");
				
				driver.close();
			}
			j++;			
	}
		
		//driver.quit();
		
		//driver.switchTo().window(wins[0]);
		
		
		
		// TODO Auto-generated method stub

	}
}
