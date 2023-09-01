package validation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hgugjh {

	public WebDriver driver;

	@Test
	public void MethodA() {
		driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();

	}

	@Test 

	public void MethodB() {
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("dineshkalekar33@gmail.com");

	}

	@Test
	public void MethodC() {
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Sunnydinu@33");

		driver.findElement(By.cssSelector("button[type=submit]")).click();

	}

	@Test
	public void MethodD() {

		WebElement e1 = driver.findElement(By.xpath("//div[@class='_9ay7']"));

		String ActualText = e1.getText();
		System.out.println(ActualText);

		String ExpectedText = "The email address you entered isn't connected to an account. ";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(ActualText, ExpectedText);

		if (ActualText.equals(ExpectedText)) {
			System.out.println("<< Test Case Pass >>");
		} else
			System.out.println("<< Test Case Fail >>");

		String title = driver.getTitle();

		System.out.println(title);
		String ExpectedTitle = "Log in to Facebook";

		soft.assertEquals(title, ExpectedTitle);

		if (title.equals(ExpectedTitle)) {
			System.out.println("<< Title Test CAse Pass >>");
		} else {
			System.out.println("<< Title Test case Fail >>");
		}

		soft.assertAll();

	}

}
