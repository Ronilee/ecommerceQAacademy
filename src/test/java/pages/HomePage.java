package pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class HomePage extends BasePage {  
	WebDriver driver;

	@Before
	public void iniciaDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Espera 5 segundos
		driver.get("http://natura.com.br");
	}
		
	@Test
	public void ValidarHome() throws InterruptedException {

		driver.get("http://natura.com.br");
		Thread.sleep(5000);
		
		scrollDown();
		
		assertEquals("MAIS BELEZA, MENOS LIXO",
				driver.findElement(By.xpath("//h1[contains(text(),'MAIS BELEZA, MENOS LIXO')]")));
		
		

	}


	@After
	public void finalizaTestes() {
		driver.quit();
	}


}

	



