/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author eduardo.lana
 */
public class Planilha {
    private String Teste ;
    private String Usuario ;
    private String Senha ;
    private String CodVendaProduto ;
    private String Status ;
    private String CicloInicio ;
    private String CicloFim ;
    private String Material;
    private String Prioridade ;
    private String Preco ;
    private String Redutor ;
    private String Motivo ;




public Planilha(){};

public Planilha(String Teste, String Usuario, String Senha, String CodVendaProduto,String Status , String CicloInicio, String CicloFim, String Material, String Prioridade, String Preco, String Redutor, String Motivo ){
    this.Teste = Teste;
    this.Usuario = Usuario;
    this.Senha = Senha;
    this.CodVendaProduto = CodVendaProduto;
    this.Status = Status;
    this.CicloInicio = CicloInicio;
    this.CicloFim = CicloFim;
    this.Material = Material;
    this.Prioridade = Prioridade;
    this.Preco = Preco;
    this.Redutor = Redutor;
    this.Motivo = Motivo;

}

public String getTeste() {
    return Teste;
}

public void setTeste(String Teste) {
    this.Teste = Teste;
}

public String getUsuario() {
    return Usuario;
}

public void setUsuario(String Usuario) {
    this.Usuario = Usuario;
}

public String getSenha() {
    return Usuario;
}

public void setSenha(String price) {
    this.Senha = Senha;
}
public String getCodVendaProduto() {
    return CodVendaProduto;
}

public void setCodVendaProduto(String CodVendaProduto) {
    this.CodVendaProduto = CodVendaProduto;
}
public String getStatus() {
    return Status;
}

public void setStatus(String Status) {
    this.Status = Status;
}
public String getCicloInicio() {
    return CicloInicio;
}

public void setCicloInicio(String CicloInicio) {
    this.CicloInicio = CicloInicio;
}
public String getCicloFim() {
    return CicloFim;
}

public void setCicloFim(String CicloFim) {
    this.CicloFim = CicloFim;
}
public String getMaterial() {
    return Material;
}

public void setMaterial(String Material) {
    this.Material = Material;
}
public String getPrioridade() {
    return Prioridade;
}

public void setPrioridade(String Prioridade) {
    this.Prioridade = Prioridade;
}
public String getPreco() {
    return Preco;
}

public void setPreco(String Preco) {
    this.Preco = Preco;
}
public String getRedutor() {
    return Redutor;
}

public void setRedutor(String Redutor) {
    this.Redutor = Redutor;
}
public String getMotivo() {
    return Motivo;
}

public void setMotivo(String Motivo) {
    this.Motivo = Motivo;
}
}
