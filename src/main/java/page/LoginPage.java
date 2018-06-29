package page;
import org.openqa.selenium.By;

import core.BasePage;

public class LoginPage extends BasePage{

	public void Setusuario(String user , String usuario) {
		
		Escrever(By.id(user),usuario);
	}
	public void Setsenha(String password , String senha) {
		
		Escrever(By.id(password),senha);
	}
	public void logar(String logar)
	{
		acao(By.xpath(logar));
	}
	public void AguardaXpath(String xpath) {
		EsperaCarregamento(By.xpath(xpath));;
	}
        public void TakescreenShot(String texto) {
		 testScreenshot(texto);
		
	}

}
