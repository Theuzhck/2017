/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus Henrick matheus.ferreira@dcomp.ufs.br
 */
public class Produto {
    private String tipoProd;
    private int codProd;
    private String descProd;

    public Produto(String tipo, int cod, String desc) {
        tipoProd = tipo;
        codProd = cod;
        descProd = desc;
    }

    @Override
    public String toString() {
        return "Tipo de produto: " + tipoProd + ", Código do Produto: " + codProd + ", Descreição do Produto:" + descProd;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public int getCodProd() {
        return codProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }
    
    
    
    
}
