/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmain;

/**
 *
 * @author desio
 */
public class Prodotto {
    private double prezzo;
    private String nome;
    private String codice;

    public Prodotto(String nome, String codice,double prezzo) {
        this.prezzo = prezzo;
        this.nome = nome;
        this.codice = codice;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\nCodice: "+codice+"\nPrezzo: "+prezzo;
    }
   
    
}
