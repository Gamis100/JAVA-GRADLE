package pe.edu.ulasalle.utest.test.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class TestDoctavio {

	private static final String pathDriver = "G:\\chromedriver.exe";
	
	private static WebDriver driver;
	
	@BeforeAll
	public static void iniciar() {
		ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
	}
	
	@AfterAll
	public static void finalizar() {
//		driver.close();
//		driver.quit();
	}
	
	@Test
	void testDoctavio() {
		String url = "https://doctavio.pe/";
		By by = null;
		WebElement wel = null;
		driver.navigate().to(url);
		by = By.id("k");
		wel = driver.findElement(by);
		wel.sendKeys("Pediatría");
		by = By.id("ubigeo_name");
		wel = driver.findElement(by);
		wel.sendKeys("Miraflores");
		by = By.id("global_search");
		wel = driver.findElement(by);
		wel.click();
		by = By.xpath("//*[@id=\"doctors\"]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a");
		wel = driver.findElement(by);
		wel.click();
	}

}
