package page;

import core.BasePage;
import org.openqa.selenium.By;

/**
 *
 * @author eduardo.lana
 */
public class AbrangComercialPage extends BasePage {
    
     public void MenuAbrangComercial(String texto)
        {
           
            acao(By.xpath(texto));
        }
        public void Incluir(String texto)
        {
            acao(By.id(texto));
        }
        public void InserirCodVenda(String texto , String codvenda)
        {
            AguardaId(texto);
            Escrever(By.id(texto), codvenda);
        }
        public void SelecionarAbrang(String texto)
        {
            acao(By.xpath(texto)); 
        }
        public void InsereCiclo(String texto , String ciclo)
        {
            acao(By.id(texto));
            SelectValue(By.id(texto),ciclo);
        }
        public void AguardaId(String texto)
        {
            EsperaCarregamento(texto);
        }
        public void AguardaXPath(String texto)
        {
            EsperaCarregamento(texto);
        }
        public void ValidaTextoMensagem(String telaerro ,String Texto , String Texto1 , String teste) throws InterruptedException
        {
            ValidaMensagemPopup(By.xpath(telaerro), By.xpath(Texto) ,Texto1 , teste);
           
        }
        public void SelecionaStatus(String status )
        {
            Status(By.xpath("//input[@name='statusAprovacao'and @value='"+status+"']"));


        }
        public void ConsultarAbrangencia(String Texto)
        {
            acao(By.id(Texto));

        }
        public void SelecionaAbrangencia(String Texto , String acao ,String teste)
        {
            SelecionaGrid(By.xpath(Texto) , acao ,teste);

        }
        public void Aprovar(String Texto)
        {
            acao(By.id(Texto));

        }
        public void Confirma(String Texto)
        {
            acao(By.xpath(Texto));

        }
        public void Cancelar(String Texto)
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

}
