/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Biel
 */
public class Produto {

    int cod;
    String nome;
    String descr;
    Double valor;
    int estoque;
    int estoqueMin;

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescri() {
        return this.descr;
    }

    public void setDescri(String descri) {
        this.descr = descri;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int est) {
        this.estoque = est;
    }

    public int getEstMin() {
        return this.estoqueMin;
    }

    public void setEstMin(int min) {
        this.estoqueMin = min;
    }
}
