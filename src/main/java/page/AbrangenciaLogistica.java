/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import core.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo.lana
 */
public class AbrangenciaLogistica extends BaseTest {
    private AbrangenciaLogisticaPage AbrangLogisticaPage = new AbrangenciaLogisticaPage();
    private BasePage basepage = new BasePage();
    String telaabranglogistica = "//*[@id=\"sidebar\"]/ul/li[5]/a/span";
    String botaoincluir = "btnIncluir";
    String botaoaprovar = "btnAprovar";
    String botaocancelar = "btnCancelar";
    String campocodvenda = "txtCodVenda";
    String botaoexcluir = "btnExcluir";
    String consultar = "btnPesquisar";
    String confirmar = "/ html / body / div[6] / div[3] / div / button[1]";
    String telaerro = "/ html / body / div[8]";
    String mensagemresultado = "/ html / body / div[6] / div[2]";
    String abrangencia = "//*[@id=\"arvoreEstrutura\"]/ul/li/span/span[2]";
    String gridcomercial = "//*[@id=\"tbAbrangencia\" and @style=\"201819\")]";
    String gridlogistica = "//*[@id=\"tbProdutoAbrangencia\"]/tbody/tr/td[4]/input";
    String material = "//*[@id=\"codigoProduto\"]";
    String Aprovado = "1";
    String campomaterial = "codigoProduto";
    String campoprioridade = "nmPrioridade";
    String campocicloinicial = "nmCicloInicio";
    String campociclofinal = "nmCicloTermino";
    String lupaalterar = "//*[@id=\"tbProdutoAbrangencia\"]/tbody/tr[1]/td[3]/a";
    String linhamaterial = "//*[@id=\"tbProdutoAbrangenciaItem\"]/tbody/tr[1]/td[8]/input"; 
    
    
 public void InserirAbrangLog()
        {

            String linha = "Aprovado";

            String teste = "Inserir Abrangência Logística";

//            var Validacao = ConfigurationManager.AppSettings["MsgInclui"];
//
//            var linhaplanilha = ExcellAcess.PegaLinha(linha);

            AbrangLogisticaPage.Aguardaxpath(telaabranglogistica);

            AbrangLogisticaPage.MenuAbrangLog(telaabranglogistica);

            AbrangLogisticaPage.Aguardaid(campocodvenda);

//            AbrangLogisticaPage.InserirCodVenda(campocodvenda, linhaplanilha.CodVendaProduto);

            AbrangLogisticaPage.ConsultarAbrangenciaLog(consultar);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            AbrangLogisticaPage.SelecionaAbrangencia(gridcomercial);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            AbrangLogisticaPage.Incluir(botaoincluir);

            AbrangLogisticaPage.Aguardaid("incluirForm");

//            AbrangLogisticaPage.SelecionaMaterial(campomaterial , linhaplanilha.Material);
//
//            AbrangLogisticaPage.InserePrioridade(campoprioridade, linhaplanilha.Prioridade);
//
//            AbrangLogisticaPage.InsereCiclo(campocicloinicial , linhaplanilha.CicloInicio);

            AbrangLogisticaPage.Incluir("btnAddSessionItem");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            AbrangLogisticaPage.AlterarOuSalvar("btnSalvar");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

//            AbrangLogisticaPage.ValidaTextoMensagem(telaerro, mensagemresultado,  Validacao, teste);
         
        }
     
        public void AprovarRascunhoAbrangLog()
        {

            String linha = "Rascunho";

            String acao = "aprovar";

            String teste = "Aprovar Abrangência Logística";

//            var Validacao = ConfigurationManager.AppSettings["MsgAprovaLog"];
//
//            var linhaplanilha = ExcellAcess.PegaLinha(linha);

      
//            Acao(linhaplanilha.Status, linhaplanilha.CodVendaProduto, botaoaprovar, Validacao, teste , acao );


        }
   

        public void CancelarAbrangLog()
        {
            String linha = "Aprovado";

            String teste = "Cancelar Abrangência Logística";

            String acao = "cancelar";

//            String Validacao = ConfigurationManager.AppSettings["MsgCancelLog"];
//
//            var linhaplanilha = ExcellAcess.PegaLinha(linha);


//            Acao(linhaplanilha.Status, linhaplanilha.CodVendaProduto, botaocancelar, Validacao, teste , acao );
        }

        public void SalvarAbrangLog()
        {
            String linha = "Encerrado";

            String teste = "Alterar e salvar Abrangência Logística";

   
//            var Validacao = ConfigurationManager.AppSettings["MsgAltera"];
//
//            var linhaplanilha = ExcellAcess.PegaLinha(linha);

            
            AbrangLogisticaPage.MenuAbrangLog(telaabranglogistica);

            AbrangLogisticaPage.Aguardaxpath(telaabranglogistica);

//            AbrangLogisticaPage.InserirCodVenda(campocodvenda, linhaplanilha.CodVendaProduto);

            AbrangLogisticaPage.ConsultarAbrangenciaLog(consultar);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            AbrangLogisticaPage.SelecionaAbrangencia(gridcomercial);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            AbrangLogisticaPage.SelecionaStatus(Aprovado);

            AbrangLogisticaPage.Aguardaxpath(lupaalterar);

            AbrangLogisticaPage.SelecionaAbrangencia(lupaalterar);

            AbrangLogisticaPage.Aguardaid("btnAlterar");

            AbrangLogisticaPage.acao("btnAlterar");

            AbrangLogisticaPage.Aguardaid(campociclofinal);

            AbrangLogisticaPage.SelecionaMaterial(linhamaterial);

            AbrangLogisticaPage.acao("btnRemoveSessionItems");

//            AbrangLogisticaPage.SelecionaMaterial(campomaterial, linhaplanilha.Material);
//
//            AbrangLogisticaPage.InserePrioridade(campoprioridade,linhaplanilha.Prioridade);
//
//            AbrangLogisticaPage.InsereCiclo(campocicloinicial ,linhaplanilha.CicloInicio);

            AbrangLogisticaPage.acao("btnAddSessionItem");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            AbrangLogisticaPage.acao("btnSalvar");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

//            AbrangLogisticaPage.ValidaTextoMensagem(telaerro, mensagemresultado, Validacao, teste);
        }

        public void ExcluiRascunhoLog()
        {
            String linha = "Rascunho";

            String teste = "Excluir Rascunho Abrangência Logistica ";

            String acao = "excluir";

//            var Validacao = ConfigurationManager.AppSettings["MsgExclui"];
//
//            var linhaplanilha = ExcellAcess.PegaLinha(linha);

//            Acao(linhaplanilha.Status, linhaplanilha.CodVendaProduto, botaoexcluir, Validacao, teste , acao );
        }

  
        public void Acao(String status, String codvenda, String botao, String Validacao, String teste , String acao )
        {

            AbrangLogisticaPage.MenuAbrangLog(telaabranglogistica);

            AbrangLogisticaPage.Aguardaxpath(telaabranglogistica);

            AbrangLogisticaPage.InserirCodVenda(campocodvenda, codvenda);

            AbrangLogisticaPage.ConsultarAbrangenciaLog(consultar);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            AbrangLogisticaPage.SelecionaAbrangencia(gridcomercial);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            if (status != Aprovado)
            {
                AbrangLogisticaPage.SelecionaStatus(Aprovado);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
                }
                AbrangLogisticaPage.SelecionaStatus(status);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            AbrangLogisticaPage.SelecionaAbrangenciaLog(gridlogistica , acao , teste);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            AbrangLogisticaPage.acao(botao);

            AbrangLogisticaPage.Aguardaxpath(confirmar);

            AbrangLogisticaPage.ConfirmaCancela(confirmar);


        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AbrangenciaLogistica.class.getName()).log(Level.SEVERE, null, ex);
        }

            AbrangLogisticaPage.ValidaTextoMensagem(telaerro, mensagemresultado, Validacao, teste);

        }

    }
