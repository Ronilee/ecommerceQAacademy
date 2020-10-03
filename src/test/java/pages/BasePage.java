package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BasePage {
	WebDriver driver;
	
    
	public void escrever(By by, String texto) {
	    driver.findElement(by).sendKeys(texto);
	}
	
	public void clicar(By by) {
		driver.findElement(by).click();
	}
	
	public void clicarPorTexto(String texto){
		clicar(By.xpath("//*[@text='"+ texto+"']"));
	}
	

	public void scrollDown(){
	
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,250)", "");
		
	}
	
}
