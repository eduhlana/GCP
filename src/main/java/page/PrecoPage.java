/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import core.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;

/**
 *
 * @author eduardo.lana
 */
public class PrecoPage extends BasePage{
    
    public void MenuPreco(String texto)
    {
        acao(By.xpath(texto));
    }
    public void Incluir(String texto)
    {
        acao(By.id(texto));
    }
    public void InserirCodVenda(String texto, String codvenda)
    {
        AguardaId(texto);
        Escrever(By.id(texto), codvenda);
    }
    public void SelecionaMotivo(String texto, String motivo)
    {
        acao(By.id(texto));
     try {
         Thread.sleep(2000);
     } catch (InterruptedException ex) {
         Logger.getLogger(PrecoPage.class.getName()).log(Level.SEVERE, null, ex);
     }
        SelectValue(By.id(texto), motivo);
    }

    public void SelecionarAbrang(String texto)
    {
        acao(By.xpath(texto));
    }
    public void InsereCiclo(String texto, String ciclo)
    {
        acao(By.id(texto));
        SelectValue(By.id(texto), ciclo);
    }
    public void AguardaId(String texto)
    {
        EsperaCarregamento(By.id(texto));
    }
    public void AguardaXPath(String texto)
    {
        EsperaCarregamento(By.xpath(texto));
    }
      	
    
    
    public void ValidaTextoMensagem(String telaerro, String Texto, String Texto1, String teste)
    {
         ValidaMensagemPopup(By.xpath(telaerro), By.xpath(Texto), Texto1, teste);
    

    }
    public void SelecionaStatus(String status)
    {
        Status(By.xpath("//input[@name='statusAprovacaoPreco'and @value='" + status + "']"));
    }
    
    public void SelecionaStatusPreco(String status)
    {
        Status(By.xpath("//input[@name='statusAprovacao'and @value='" + status + "']"));
    }
    public void ConsultarAbrangencia(String Texto)
    {
        acao(By.id(Texto));

    }

    public void BuscarAbrangencia(String Texto)
    {
        SelecionaGridComercial(By.xpath(Texto));

    }
    public void SelecionaAbrangenciaVigencia(String Texto)
    {
        SelecionaGridComercial(By.xpath(Texto));

    }

    public void SelecionaAbrangencia(String Texto, String acao, String teste)
    {
        SelecionaGrid(By.xpath(Texto), acao, teste);

    }
    public void Aprovar(String Texto)
    {
        acao(By.id(Texto));

    }
    public void ConfirmaCancela(String Texto)
    {
        acao(By.xpath(Texto));

    }

    public void SelecionaMaterial(String Texto)
    {
        acao(By.xpath(Texto));

    }

    public void AlterarOuSalvar(String texto)
    {
        acao(By.id(texto));
    }
    public void acao(String texto)
    {
        acao(By.id(texto));
    }

    public void InserePreco(String texto, String prioridade)
    {
        Escrever(By.id(texto), prioridade);
    }
    public void InsereRedutor(String texto, String prioridade)
    {
        Escrever(By.id(texto), prioridade);
    }
	public void StatusTodos(String string) {
		acao(By.id("statusTodos"));
		
	}
	public String PegaCiclo(String texto) {
		
		return ObtemCiclo(By.xpath(texto));
	}
	public String PegaMensagemResultado(String texto) {
		
		return resultado(By.xpath(texto));
	}
}
    

