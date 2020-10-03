package pages;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

		public void DigitarUsuario(String usuario) {
			escrever(By.xpath("username"), usuario); 
		}

		public void digitarSenhaCN(String senha) {
			escrever(By.id("password"), senha);
		}

		public void clicarContinuar() {
			clicar(By.id("botaoOK"));
		}
		
		
	}
	
	

