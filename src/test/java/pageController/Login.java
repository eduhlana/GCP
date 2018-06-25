package pageController;
import core.BaseTest;
import data.PegaLinhaExcel;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import page.LoginPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Login extends BaseTest{
	
	
	public LoginPage LoginPage = new LoginPage();
	public PegaLinhaExcel excel = new PegaLinhaExcel();
	String[] linhaplanilha = new String[12];
	
	public void Logar() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		linhaplanilha = excel.Pegalinha("Aprovado");
		LoginPage.AguardaXpath("//*[@id=\"username\"]");
		String User = linhaplanilha[10].replace(".","");
		LoginPage.Setusuario("username",User );
		LoginPage.Setusuario("password", linhaplanilha[11]);
		LoginPage.logar("//*[@id=\"loginForm\"]/fieldset/div[3]/button");
		
	}
	

}
