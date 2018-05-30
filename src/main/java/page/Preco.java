/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import core.*;
import data.PegaLinhaExcel;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

/**
 *
 * @author eduardo.lana
 */
public class Preco extends BaseTest{
    
    public PrecoPage PrecoPage = new PrecoPage();
    public MsgConfig config = new MsgConfig();
    public BasePage basepage = new BasePage();
    public PegaLinhaExcel linha = new PegaLinhaExcel();
    
    String telapreco = "//*[@id=\"sidebar\"]/ul/li[6]/a/span";
    String botaoincluir = "btnIncluir";
    String botaoaprovar = "btnAprovar";
    String botaocancelar = "btnCancelar";
    String campocodvenda = "txtCodVenda";
    String botaoexcluir = "btnExcluir";
    String consultar = "//*[@id=\"btnPesquisar\"]";
    String linhagrid = "//*[@id=\"tbPreco\"]/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[8]/input";
    String precogrig = "//*[@id=\"tbPrecoItem\"]/tbody/tr/td[10]/input";
    String confirmar = "/ html / body / div[6] / div[3] / div / button[1]";
    String telaerro = "/ html / body / div[8] ";
    String mensagemresultado = "/ html / body / div[6] / div[2]";
    String abrangencia = "//*[@id=\"arvoreEstrutura\"]/ul/li/span/span[2]";
    String Aprovado = "1";
    String lupaalterar = "//*[@id=\"tbPreco\"]/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[7]";
    String gridcomercial = "//*[@id=\"tbAbrangencia\"]/tbody/tr[1]/td[9]";
    String cicloinicial = "cicloInicio";
    String ciclofinal = "cicloTermino";
    String preco = "preco";
    String redutor = "redutor";
    String pontos = "pontos";
    String campomotivo = "codigoMotivo";
    String cicloiniciocomercial = "//*[@id=\"incluirForm\"]/div[2]/div[3]/div[2]/div/label[2]";
    String ciclofimcomercial = "//*[@id=\"incluirForm\"]/div[2]/div[3]/div[4]/div/label[2]";
    String okfinal = "/html/body/div[6]/div[3]/div/button";
    
    String[] linhaplanilha = new String[10];
    
    public static void main(String[] args){};
    
        
    @Test
    public void InserirPreco()
        {
            String acao = "inserir";

            String teste = "Aprovado";

            String metodo = "Inserir Abrangência Comercial"; 
  
            String validacao = config.Msg("MsgInclui");
            
            linhaplanilha = linha.Pegalinha(teste);
     
            PrecoPage.AguardaXPath(telapreco);

            PrecoPage.MenuPreco(telapreco);

            PrecoPage.InserirCodVenda(campocodvenda ,linhaplanilha[1]);
            
            PrecoPage.StatusTodos("statusTodos");

            PrecoPage.BuscarAbrangencia(consultar);
            
            PrecoPage.AguardaXPath(gridcomercial);
       
            PrecoPage.SelecionaAbrangenciaVigencia(gridcomercial);

            PrecoPage.AguardaXPath(linhagrid);

            PrecoPage.Incluir(botaoincluir);
           
            PrecoPage.AguardaId(cicloinicial);

            PrecoPage.SelecionaAbrangenciaVigencia(abrangencia);

        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }
        	
        	String cicloini = PrecoPage.PegaCiclo(cicloiniciocomercial);
        
            PrecoPage.InsereCiclo(cicloinicial , cicloini);
            
            String ciclofim = PrecoPage.PegaCiclo(ciclofimcomercial);
            
            PrecoPage.InsereCiclo(ciclofinal , ciclofim);

            PrecoPage.InserePreco(preco ,linhaplanilha[7]);

            PrecoPage.InsereRedutor(redutor, linhaplanilha[8]);

            PrecoPage.acao(pontos);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.SelecionaMotivo(campomotivo , linhaplanilha[9]);

            PrecoPage.Incluir("btnIncluirItem");

            PrecoPage.AguardaXPath(precogrig);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            PrecoPage.AlterarOuSalvar("btnSalvar");

            PrecoPage.AguardaXPath(mensagemresultado);
            
            PrecoPage.ValidaTextoMensagem(telaerro, mensagemresultado, validacao, metodo);

        }
        
    
 
    @Test  
    public void AprovarPreco()
        {
            String acao = "aprovar";

            String teste = "Rascunho";

            String metodo = "Aprovar Abrangência Comercial";


            String validacao = config.Msg("MsgAprovaPreco");

            linhaplanilha = linha.Pegalinha(teste);

            AprovaCancelaouExclui(linhaplanilha[2], linhaplanilha[1], botaoaprovar, validacao, metodo, acao);


        }

 
    @Test   
    public void CancelarPreco()
        {
            String acao = "cancelar";

            String teste = "Aprovado";

            String metodo = "Cancelar Abrangência Comercial";

            String validacao = config.Msg("MsgCancelaPreco");

            linhaplanilha = linha.Pegalinha(teste);


            AprovaCancelaouExclui(linhaplanilha[2], linhaplanilha[1], botaocancelar, validacao, metodo, acao);
        }

    @Test
    public void SalvarPreco()
        {
            String acao = "salvar";

            String teste = "Rascunho";

            String metodo = "Alterar ciclo final e salvar Abrangência Comercial";

            String validacao = config.Msg("MsgInclui");

            linhaplanilha = linha.Pegalinha(teste);

            PrecoPage.MenuPreco(telapreco);

            PrecoPage.AguardaXPath(telapreco);

            PrecoPage.InserirCodVenda("txtCodVenda", linhaplanilha[1]);
            
            PrecoPage.StatusTodos("StatusTodos");

            PrecoPage.AguardaXPath(consultar);

            PrecoPage.BuscarAbrangencia(consultar);

            PrecoPage.AguardaXPath(gridcomercial);

            PrecoPage.SelecionaAbrangenciaVigencia(gridcomercial);
            
            PrecoPage.AguardaXPath(lupaalterar);

            PrecoPage.SelecionaAbrangencia(lupaalterar, acao, teste);

            PrecoPage.AguardaId("btnAlterar");

            PrecoPage.AlterarOuSalvar("btnAlterar");

            PrecoPage.AguardaId("cicloTermino");

            PrecoPage.AguardaId("btnSalvar");

            PrecoPage.AlterarOuSalvar("btnSalvar");
            
            PrecoPage.AguardaXPath(mensagemresultado);

            PrecoPage.ValidaTextoMensagem(telaerro, mensagemresultado, validacao, metodo);
        }
    
    
    
    @Test
        public void ExcluiPreco()
        {
            String acao = "excluir";

            String teste = "Rascunho";

            String metodo = "Excluir Rascunho Abrangência Comercial ";


            String validacao = config.Msg("MsgExclui");

            linhaplanilha = linha.Pegalinha(teste);

            AprovaCancelaouExclui(linhaplanilha[2], linhaplanilha[1], botaoexcluir, validacao, metodo, acao);
        }


        public void AprovaCancelaouExclui(String status, String codvenda, String botao, String texto, String metodo, String acao)
        {
        
        	String aguarda = " Este Preço já encontra-se em Processamento, por favor aguarde!";

            PrecoPage.AguardaXPath(telapreco);

            PrecoPage.MenuPreco(telapreco);

            PrecoPage.InserirCodVenda(campocodvenda, codvenda);
            
            if (Aprovado != status)
            {
                PrecoPage.SelecionaStatus(Aprovado);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
                }
                PrecoPage.SelecionaStatus(status);
            }

            PrecoPage.AguardaXPath(consultar);
            
            PrecoPage.BuscarAbrangencia(consultar);


            PrecoPage.AguardaXPath(gridcomercial);
            

            PrecoPage.SelecionaAbrangenciaVigencia(gridcomercial);

            PrecoPage.AguardaXPath(lupaalterar);
            
            PrecoPage.SelecionaAbrangencia(linhagrid, acao, metodo);

            PrecoPage.acao(botao);

            PrecoPage.ConfirmaCancela(confirmar);

            PrecoPage.AguardaXPath(mensagemresultado);
            
            String resultado = PrecoPage.PegaMensagemResultado(mensagemresultado);
          
            if (resultado.equals(texto)|| resultado.equals(aguarda)) {
            	
            	 try {
            		 PrecoPage.ConfirmaCancela(okfinal);
                     Thread.sleep(2000);
                     PrecoPage.SelecionaStatusPreco("7");
                     Thread.sleep(4000);
                     mensagemresultado = "";
                     mensagemresultado = "//*[@id=\"tbPreco\"]/div[1]/div[2]/div[2]/table/tbody/tr/td";
                     texto = "";
                     texto = "Nenhum registro encontrado";
                 } catch (InterruptedException ex) {
                     Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
            
                      		
            PrecoPage.ValidaTextoMensagem(telaerro, mensagemresultado, texto, metodo);

        }
        
       

    }
    

