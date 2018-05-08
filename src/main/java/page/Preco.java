/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import core.BaseTest;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo.lana
 */
public class Preco extends BaseTest{
    
    public PrecoPage PrecoPage = new PrecoPage();
    
    String telapreco = "//*[@id=\"sidebar\"]/ul/li[6]/a/span";
    String botaoincluir = "btnIncluir";
    String botaoaprovar = "btnAprovar";
    String botaocancelar = "btnCancelar";
    String campocodvenda = "txtCodVenda";
    String botaoexcluir = "btnExcluir";
    String consultar = "//*[@id=\"btnPesquisar\"]";
    String linhagrid = "//*[@id=\"tbPreco\"]/tbody/tr/td[8]/input";
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
        
        public void InserirPreco()
        {
            String acao = "inserir";

            String linha = "Aprovado";

            String teste = "Inserir Abrangência Comercial";

            var Validacao = ConfigurationManager.AppSettings["MsgInclui"];

            var linhaplanilha = ExcellAcess.PegaLinha(linha);


            PrecoPage.AguardaXPath(telapreco);

            PrecoPage.MenuPreco(telapreco);

            PrecoPage.InserirCodVenda(campocodvenda ,linhaplanilha.CodVendaProduto);


            PrecoPage.BuscarAbrangencia(consultar);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.SelecionaAbrangenciaVigencia(gridcomercial);

        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.Incluir(botaoincluir);

            PrecoPage.AguardaXPath(abrangencia);

            PrecoPage.SelecionaAbrangenciaVigencia(abrangencia);

        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.InsereCiclo(cicloinicial , linhaplanilha.CicloInicio);

            PrecoPage.InserePreco(preco ,linhaplanilha.Preco);

            PrecoPage.InsereRedutor(redutor, linhaplanilha.Redutor);

            PrecoPage.acao(pontos);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.SelecionaMotivo(campomotivo , linhaplanilha.Motivo);

            PrecoPage.Incluir("btnIncluirItem");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            PrecoPage.AlterarOuSalvar("btnSalvar");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.ValidaTextoMensagem(telaerro, mensagemresultado, Validacao, teste);

        }

        public void AprovarPreco()
        {
            String acao = "aprovar";

            String linha = "Rascunho";

            String teste = "Aprovar Abrangência Comercial";

            var Validacao = ConfigurationManager.AppSettings["MsgAprovaPreco"];

            var linhaplanilha = ExcellAcess.PegaLinha(linha);

            AprovaCancelaouExclui(linhaplanilha.Status, linhaplanilha.CodVendaProduto, botaoaprovar, Validacao, teste, acao);


        }

    
        public void CancelarPreco()
        {
            String acao = "cancelar";

            String linha = "Aprovado";

            String teste = "Cancelar Abrangência Comercial";

            String Validacao = ConfigurationManager.AppSettings["MsgCancelaPreco"];

            var linhaplanilha = ExcellAcess.PegaLinha(linha);


            AprovaCancelaouExclui(linhaplanilha.Status, linhaplanilha.CodVendaProduto, botaocancelar, Validacao, teste, acao);
        }

        public void SalvarPreco()
        {
            String acao = "salvar";

            String linha = "Rascunho";

            String teste = "Alterar ciclo final e salvar Abrangência Comercial";

            var Validacao = ConfigurationManager.AppSettings["MsgAltera"];

            var linhaplanilha = ExcellAcess.PegaLinha(linha);

            PrecoPage.MenuPreco(telapreco);

            PrecoPage.AguardaXPath(telapreco);

            PrecoPage.InserirCodVenda("txtCodVenda", linhaplanilha.CodVendaProduto);

            PrecoPage.AguardaXPath(consultar);

            PrecoPage.BuscarAbrangencia(consultar);

            PrecoPage.AguardaXPath(gridcomercial);

            PrecoPage.SelecionaAbrangenciaVigencia(gridcomercial);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.SelecionaStatus(Aprovado);

        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.SelecionaStatus("6");

        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.SelecionaStatus("7");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.SelecionaAbrangencia(lupaalterar, acao, teste);

            PrecoPage.AguardaId("btnAlterar");

            PrecoPage.AlterarOuSalvar("btnAlterar");

            PrecoPage.AguardaId("cicloTermino");

            PrecoPage.InsereCiclo("cicloTermino", linhaplanilha.CicloFim);

            PrecoPage.AguardaId("btnSalvar");

            PrecoPage.AlterarOuSalvar("btnSalvar");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.ValidaTextoMensagem(telaerro, mensagemresultado, Validacao, teste);
        }

        public void ExcluiPreco()
        {
            String acao = "excluir";

            String linha = "Rascunho";

            String teste = "Excluir Rascunho Abrangência Comercial ";

            var Validacao = ConfigurationManager.AppSettings["MsgExclui"];

            var linhaplanilha = ExcellAcess.PegaLinha(linha);

            AprovaCancelaouExclui(linhaplanilha.Status, linhaplanilha.CodVendaProduto, botaoexcluir, Validacao, teste, acao);
        }


        public void AprovaCancelaouExclui(String status, String codvenda, String botao, String texto, String teste, String acao)
        {

            PrecoPage.AguardaXPath(telapreco);

            PrecoPage.MenuPreco(telapreco);

            PrecoPage.InserirCodVenda(campocodvenda, codvenda);

            PrecoPage.AguardaXPath(consultar);

            PrecoPage.BuscarAbrangencia(consultar);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.AguardaXPath(gridcomercial);

            PrecoPage.SelecionaAbrangenciaVigencia(gridcomercial);

        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }


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

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.SelecionaAbrangencia(linhagrid, acao, teste);

            PrecoPage.acao(botao);

            PrecoPage.ConfirmaCancela(confirmar);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }

            PrecoPage.ValidaTextoMensagem(telaerro, mensagemresultado, texto, teste);

        }


    }
    

