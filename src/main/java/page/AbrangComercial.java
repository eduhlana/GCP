
package page;

import core.BaseTest;
import core.BasePage;
import data.ExcellAcess;
import java.util.HashMap;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author eduardo.lana
 */
public class AbrangComercial extends BaseTest  {
    
    public AbrangComercialPage AbrangComercialPage = new AbrangComercialPage();
    public BasePage basepage = new BasePage();
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
    public List<HashMap<String,String>> datamap;
    public AbrangComercial(){
        
        datamap = ExcellAcess.data(System.getProperty("user.dir")+"E:\\GCP\\src\\main\\java\\data\\users.xlsx","Comercial");
    }
    @Test
    public void AprovarRascunhoAbrang()
      {
          String acao = "aprovar";

          String linha = "Rascunho";

          String teste = "Aprovar Abrangência Comercial";

          String validacao = " Registros aprovados com sucesso!";

//          var linhaplanilha = ExcellAcess.PegaLinha(linha);

//          AprovaCancelaouExclui(linhaplanilha.Status, linhaplanilha.CodVendaProduto, botaoaprovar, Validacao, teste , acao);

      }
    
    @Test
    public void CancelarAbrang()
      {
          String acao = "cancelar";

          String linha = "Aprovado";

          String teste = "Cancelar Abrangência Comercial";

          String Validacao = " Registros cancelados com sucesso!";
//
//          var linhaplanilha = ExcellAcess.PegaLinha(linha);


//          AprovaCancelaouExclui(linhaplanilha.Status, linhaplanilha.CodVendaProduto, botaocancelar, Validacao, teste , acao);
      }
      @Test
      public void SalvarAbrang() throws InterruptedException
      {
          String acao = "salvar";

          String linha = "Rascunho";

          String teste = "Alterar ciclo final e salvar Abrangência Comercial";

          String Validacao = " Registro salvo com sucesso!";
//
//          var linhaplanilha = ExcellAcess.PegaLinha(linha);

          AbrangComercialPage.MenuAbrangComercial(telaabrangcomercial);

          AbrangComercialPage.AguardaXPath(telaabrangcomercial);

//          AbrangComercialPage.InserirCodVenda("txtCodVenda", linhaplanilha.CodVendaProduto);

          AbrangComercialPage.SelecionaStatus(Aprovado);

//          AbrangComercialPage.SelecionaStatus(linhaplanilha.Status);

          AbrangComercialPage.ConsultarAbrangencia(consultar);

          Thread.sleep(2000);

          AbrangComercialPage.SelecionaAbrangencia("//*[@id=\"tbAbrangencia\"]/tbody/tr[1]/td[12]/a/i" , acao , teste);

          AbrangComercialPage.AguardaId("cicloTermino");

          AbrangComercialPage.AlterarOuSalvar("btnAlterar");

          AbrangComercialPage.AguardaId("cicloTermino");

//          AbrangComercialPage.InsereCiclo("cicloTermino", linhaplanilha.CicloFim);

          Thread.sleep(1000);

          AbrangComercialPage.AlterarOuSalvar("btnSalvar");

          AbrangComercialPage.AguardaXPath(mensagemresultado);

//          AbrangComercialPage.ValidaTextoMensagem(telaerro, mensagemresultado, Validacao, teste);
      }
    @Test
    public void ExcluiRascunhoAbrang()
    {
        String acao = "excluir";

        String linha = "Rascunho";

        String teste = "Excluir Rascunho Abrangência Comercial ";

        String Validacao = " Registros excluídos com sucesso!";
//
//        var linhaplanilha = ExcellAcess.PegaLinha(linha);

//        AprovaCancelaouExclui(linhaplanilha.Status, linhaplanilha.CodVendaProduto, botaoexcluir, Validacao, teste , acao);
    }


    public void AprovaCancelaouExclui(String status, String codvenda, String botao, String texto, String teste , String acao) throws InterruptedException
    {

        AbrangComercialPage.MenuAbrangComercial(telaabrangcomercial);

        AbrangComercialPage.AguardaXPath(telaabrangcomercial);

        AbrangComercialPage.InserirCodVenda(campocodvenda, codvenda);

        if (Aprovado != status)
        {
            AbrangComercialPage.SelecionaStatus(Aprovado);
            AbrangComercialPage.SelecionaStatus(status);
        }

        AbrangComercialPage.ConsultarAbrangencia(consultar);

        Thread.sleep(3000);

        AbrangComercialPage.SelecionaAbrangencia(linhagrid , acao , teste);

        AbrangComercialPage.acao(botao);

        AbrangComercialPage.Confirma(confirmar);

        AbrangComercialPage.AguardaXPath(mensagemresultado);

        AbrangComercialPage.ValidaTextoMensagem(telaerro,mensagemresultado, texto, teste);
    }
}

