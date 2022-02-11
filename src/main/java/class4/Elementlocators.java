package class4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementlocators {
	WebDriver driver;

	@Before
	public void launchbrowser() {
		// create an object and set property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// set URL
		driver.get("https://objectspy.space/");
		// maximize
		driver.manage().window().maximize();
		// create cookies
		driver.manage().deleteAllCookies();
		// define wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void learnelementlocators() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		// Upload File if you have INPUT TAG
		// other than Input Tag use ROBOT CLASS
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\damas\\septmber2021selenium\\SESSION2");
		// link text
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		// wait
//		Thread.sleep(6000);
//		// navigate back
//		driver.navigate().back();
//		// partial link text
//		 driver.findElement(By.partialLinkText("TF-API Product Backend")).click();
//		//driver.findElement(By.partialLinkText(" Product ")).click();
		// css selector

		// driver.findElement(By.cssSelector("input#sex-0")).click();
		//driver.findElement(By.cssSelector("input[value='3']")).click();
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abc124");
		// driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();
		//driver.findElement(By.cssSelector("input[name='exp'][id='exp-5']")).click();
		// xpath
		// absolute(/)
		// driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("selenium
		// is fun");
		// relative(//)
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("John");
		//driver.findElement(By.xpath("//input[@name='tool' and @value='QTP' and @id='tool-0']")).click();

		 driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		//driver.findElement(By.xpath("//strong[contains (text(),'Link Test : New Page')]")).click();

	}
@After
	public void teardown() {
		//driver.close();
		//driver.quit();
	}

}
