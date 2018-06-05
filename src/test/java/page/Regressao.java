package page;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import core.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class Regressao extends BaseTest {
	
	public static AbrangComercial AbComercial = new AbrangComercial();
	public static AbrangenciaLogistica AbLogistica = new AbrangenciaLogistica();
	public static Preco Preco = new Preco();

	
	@Test
	public  void AAInserirAbrang() {

		AbComercial.InserirAbrang();
	}
	@Test
	public  void BAprovarRascunhoAbrang() {

		AbComercial.AprovarRascunhoAbrang();
	}
	@Test
	public  void CancelarAbrangLog() {

		AbLogistica.CancelarAbrangLog();
	}
	@Test
	public  void SalvarAbrangLog() {

		AbLogistica.SalvarAbrangLog();
	}
	@Test
	public   void _03InserirAbrangLog() {

		AbLogistica.InserirAbrangLog();
	}
	@Test
	public   void _05AprovarRascunhoAbrangLog() {

		AbLogistica.AprovarRascunhoAbrangLog();
	}
	@Test
	public   void _06SalvarAbrangLogi() {

		AbLogistica.SalvarAbrangLog();
	}
	@Test
	public   void _07ExcluiRascunhoLog() {

		AbLogistica.ExcluiRascunhoLog();
	}				
			
	@Test
	public   void _08InserirPreco() {


		Preco.InserirPreco();
	}
	@Test
	public   void _13CancelarPreco() {

		Preco.CancelarPreco();
	}
	@Test		
	public   void _11AprovarPreco() {


		Preco.AprovarPreco();
	}		
	@Test	
	public  void _10SalvarPreco() {


		Preco.SalvarPreco();
	}		
	@Test	
	public   void _12ExcluiPreco() {


		Preco.ExcluiPreco();
	}		
			
	@Test	
	public   void _14cancelarAbrang() {


		AbComercial.CancelarAbrang();
	}	
	@Test	
	public  void _15SalvarAbrang() {


		AbComercial.SalvarAbrang();
	}
		
	@Test	
	public void _16ExcluiRascunhoAbrang() {


		AbComercial.ExcluiRascunhoAbrang();
	}
	public static  void main(String[] args) {
		
		
	};	
	
}
