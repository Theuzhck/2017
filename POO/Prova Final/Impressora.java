
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus Henrick matheus.ferreira@dcomp.ufs.br
 */
public class Impressora extends Produto{
    private String modeloImp;
    private String tipoImp;
    private int estoqueImp;
    private boolean disponivelImp;
    public Impressora(String tipoProd, int cod, String desc, String modeloImp, String tipoImp, int estoqueImp, boolean disponivelImp) throws IOException{
        super(tipoProd, cod, desc);
        if ((tipoProd.equals("")) | (desc.equals("")) | (modeloImp.equals("")) | (tipoImp.equals("")) | (cod==0) | (estoqueImp==0)){
            throw new NullPointerException("Valor nulo para a criação de Impressora");
        }else if ((cod<0) | (estoqueImp<0)){
            throw new IOException("Um valor negativo foi recebido como parametro para a criação de Impressora");
        }else{
            this.modeloImp = modeloImp;
            this.tipoImp = tipoImp;
            this.estoqueImp = estoqueImp;
            this.disponivelImp = disponivelImp;
        }
        
        
    }
    
    
    public void aumentaEstoque(int qtd) throws IOException, NullPointerException{
        if (qtd == 0){
            throw new NullPointerException("Valor nulo para o aumento de estoque");
        }else if (qtd < 0){
            throw new IllegalStateException("Um valor negativo foi recebido como parametro para o aumento de estoque");
        }
         else {
            estoqueImp += qtd;
        }
    }
    
    public void diminueEstoque(int qtd) throws IOException, NullPointerException{
        if (qtd == 0)  {
            throw new NullPointerException("Um valor nulo  foi recebido para a diminuição de estoque");
        }else if (qtd < 0){
            throw new IllegalStateException("Um valor negativo foi recebido como parametro");
        }
        else if (qtd>estoqueImp){
            throw new IllegalStateException("Um valor grande demais foi recebido como parametro para a redução de estoque");
        }
        {
            estoqueImp -= qtd;
            if (estoqueImp==0){
                disponivelImp = false;
            }else if(estoqueImp<0){
                disponivelImp = false;
            }
        }
    }

    public String getModeloImp() {
        return modeloImp;
    }

    public String getTipoImp() {
        return tipoImp;
    }

    public int getEstoqueImp() {
        return estoqueImp;
    }

    public boolean isDisponivelImp() {
        return disponivelImp;
    }

    public void setModeloImp(String modeloImp) {
        this.modeloImp = modeloImp;
    }

    public void setTipoImp(String tipoImp) {
        this.tipoImp = tipoImp;
    }

    public void setEstoqueImp(int estoqueImp) {
        this.estoqueImp = estoqueImp;
    }

    public void setDisponivelImp(boolean disponivelImp) {
        this.disponivelImp = disponivelImp;
    }

    @Override
    public String toString() {
        String s = super.toString();
        String imp = ", Modelo de Impressora: " + modeloImp + ", Tipo de Impressora: " + tipoImp + ", Estoque de Impressora: " + estoqueImp + ", Disponibilidade de Impressora=" + disponivelImp;
        String saida = s+imp;
        return saida;
    }
    
    
}
