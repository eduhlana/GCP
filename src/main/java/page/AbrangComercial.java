
package page;

import core.BaseTest;
import core.MsgConfig;
import core.BasePage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import data.PegaLinhaExcel;;

/**
 *
 * @author eduardo.lana
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AbrangComercial extends BaseTest {

	public AbrangComercialPage AbrangComercialPage = new AbrangComercialPage();
	public BasePage basepage = new BasePage();
	public PegaLinhaExcel excel = new PegaLinhaExcel();
	MsgConfig config = new MsgConfig();
	
	String telaabrangcomercial = "//*[@id=\"sidebar\"]/ul/li[4]/a/span";
	String botaoincluir = "btnIncluir";
	String botaoaprovar = "btnAprovar";
	String botaocancelar = "btnCancelar";
	String campocodvenda = "txtCodVenda";
	String botaoexcluir = "btnExcluir";
	String consultar = "btnPesquisar";
	String linhagrid = "//*[@id=\"tbAbrangencia\"]/tbody/tr[1]/td[13]/input";
	String confirmar = "/ html / body / div[6] / div[3] / div / button[1]";
	String telaerro = "/ html / body / div[8] ";
	String mensagemresultado = "/ html / body / div[6] / div[2]";
	String abrangencia = "//*[@id=\"arvoreEstrutura\"]/ul/li/span/span[2]";
	String Aprovado = "1";
	String cicloiniciocomercial = "//*[@id=\"cicloInicio\"]"; 
	String ciclofimcomercial =  "//*[@id=\"cicloTermino\"]";

	String[] linhaplanilha = new String[10];
	
	PegaLinhaExcel linha = new PegaLinhaExcel();
	
	 public static void main(String[] args){};

	 @Test
	public void InserirAbrang()  {
		
		String acao = "inserir";

		String teste = "Aprovado";

		String metodo = "Inserir Abrangência Comercial";

		String validacao = config.Msg("MsgInclui");

		linhaplanilha = linha.Pegalinha(teste);

		AbrangComercialPage.AguardaXPath(telaabrangcomercial);

		AbrangComercialPage.MenuAbrangComercial(telaabrangcomercial);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AbrangComercialPage.acao(botaoincluir);
		
		AbrangComercialPage.AguardaId("codigoVendaProduto");

		AbrangComercialPage.InserirCodVenda("codigoVendaProduto", linhaplanilha[1]);
		
		AbrangComercialPage.AguardaXPath(abrangencia);
		
		AbrangComercialPage.SelecionarAbrang(abrangencia);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AbrangComercialPage.InsereCiclo("cicloInicioIncluir", linhaplanilha[3]);

		AbrangComercialPage.AlterarOuSalvar("btnSalvar");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AbrangComercialPage.ValidaTextoMensagem(telaerro, mensagemresultado, validacao, metodo);

	}
	
	

	@Test
	public void AprovarRascunhoAbrang() {
		
		String acao = "aprovar";

		String teste = "Rascunho";

		String metodo = "Aprovar Abrangência Comercial";

		String validacao = config.Msg("MsgAprova");

		linhaplanilha = linha.Pegalinha(teste);

		AprovaCancelaouExclui(linhaplanilha[2], linhaplanilha[1], botaoaprovar, validacao, metodo, acao);

	}

	@Test
	public void CancelarAbrang() {
		String acao = "cancelar";

		String teste = "Aprovado";

		String metodo = "Cancelar Abrangência Comercial";

		String validacao = config.Msg("MsgCancel");

		linhaplanilha = linha.Pegalinha(teste);

		AprovaCancelaouExclui(linhaplanilha[2], linhaplanilha[1], botaocancelar, validacao, metodo, acao);
	}

	@Test
	public void SalvarAbrang()  {
		
		String acao = "salvar";

		String teste = "Rascunho";

		String metodo = "Alterar ciclo final e salvar Abrangência Comercial";

		String validacao = config.Msg("MsgInclui");

		linhaplanilha = linha.Pegalinha(teste);

		AbrangComercialPage.MenuAbrangComercial(telaabrangcomercial);

		AbrangComercialPage.AguardaXPath(telaabrangcomercial);

		AbrangComercialPage.InserirCodVenda("txtCodVenda", linhaplanilha[1]);
		
		AbrangComercialPage.statusTodos("statusTodos");

		AbrangComercialPage.SelecionaStatus(linhaplanilha[2]);

		AbrangComercialPage.ConsultarAbrangencia(consultar);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AbrangComercialPage.SelecionaAbrangencia("//*[@id=\"tbAbrangencia\"]/tbody/tr[1]/td[12]/a/i", acao, metodo);


		AbrangComercialPage.AguardaId("btnAlterar");
		
		AbrangComercialPage.AlterarOuSalvar("btnAlterar");
		
		AbrangComercialPage.AguardaId("cicloInicio");
		
		AbrangComercialPage.InsereCiclo("cicloInicio", linhaplanilha[3]);

		AbrangComercialPage.AguardaId("cicloTermino");
		
		AbrangComercialPage.InsereCiclo("cicloTermino", linhaplanilha[4]);
		
		AbrangComercialPage.AguardaId("btnSalvar");
		
		AbrangComercialPage.AlterarOuSalvar("btnSalvar");

		AbrangComercialPage.AguardaXPath(mensagemresultado);

		AbrangComercialPage.ValidaTextoMensagem(telaerro, mensagemresultado, validacao, metodo);
	}

	@Test
	public void ExcluiRascunhoAbrang()  {
		String acao = "excluir";

		String teste = "Rascunho";

		String metodo = "Excluir Rascunho Abrangência Comercial ";

		String validacao = config.Msg("MsgExclui");

		linhaplanilha = linha.Pegalinha(teste);

		AprovaCancelaouExclui(linhaplanilha[2], linhaplanilha[1], botaoexcluir, validacao, teste, acao);

	}

	public void AprovaCancelaouExclui(String status, String codvenda, String botao, String texto, String teste, String acao) {
		
		AbrangComercialPage.AguardaXPath(telaabrangcomercial);

		AbrangComercialPage.MenuAbrangComercial(telaabrangcomercial);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AbrangComercialPage.InserirCodVenda(campocodvenda, codvenda);

		if (Aprovado != status) {
			AbrangComercialPage.SelecionaStatus(Aprovado);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			AbrangComercialPage.SelecionaStatus(status);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AbrangComercialPage.ConsultarAbrangencia(consultar);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AbrangComercialPage.SelecionaAbrangencia(linhagrid, acao, teste);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AbrangComercialPage.acao(botao);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AbrangComercialPage.Confirma(confirmar);


		AbrangComercialPage.ValidaTextoMensagem(telaerro, mensagemresultado, texto, teste);
	}
}
