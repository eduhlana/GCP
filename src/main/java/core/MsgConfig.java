
package core;

public class MsgConfig {
    
    public String  Msg(String msg) {
        String mensagem ="";
        switch (msg){
            case "URL":
                mensagem = "http://hml3-naturahml.sysmap.com.br/gcpweb/pages/home/";
                return mensagem;
                
            case "DataPath":
                mensagem = "E:/RegressaoGCP/RegressaoGCP/RegressaoGCP/Data/users.xlsx";
                
            case "ScreeDir":
                mensagem = "E:/RegressaoGCP/UnitTestProject1/UnitTestProject1";
                
            case "MsgAprova":
                mensagem = " Registros aprovados com sucesso!";
               
            case "MsgAprovaLog":
                mensagem = " Registro aprovado com sucesso!";
                
            case "MsgAprovaPreco":
                mensagem = "Aprovação solicitada com sucesso! Aguarde a finalização do processamento.";
               
            case "MsgCancelaPreco":
                mensagem = "Cancelamento solicitado com sucesso! Aguarde a finalização do processamento.";
               
            case "MsgCancel":
                mensagem = "Registros cancelados com sucesso!";
                
            case "MsgCancelLog":
                mensagem = "Registro cancelado com sucesso!";
                
            case "MsgExclui":
                mensagem = "Registros excluídos com sucesso!";
               
            case "MsgInclui":
                mensagem = "Registro salvo com sucesso!";   
        }
    
      return mensagem;  
    }
      
}
    
