package core;
import org.junit.After;
import org.junit.Before;
import page.LoginPage;

/**
 * @author eduardo.lana
 */
public class BaseTest {
    
    LoginPage login = new LoginPage();
    @Before
     public void Inicializa()
       {
            DriverFactory.GetDriver().navigate().to("http://hml3-naturahml.sysmap.com.br/gcpweb/");
            //DriverFactory.GetDriver().navigate().to("http://gcphml.natura.net/gcpweb/pages/preco/pesquisar");
            //login.Logar();
            DriverFactory.GetDriver().manage().window().maximize();
            
            
            
       }
    
    @After
     public void Finaliza()
        {
            DriverFactory.KillDriver();
        }
    
}
