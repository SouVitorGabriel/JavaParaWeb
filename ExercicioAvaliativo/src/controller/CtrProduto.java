/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Biel
 */
public class CtrProduto {

    public ArrayList<Produto> produtos = new ArrayList<Produto>();
    Produto p;
    int indice = 0;

    public CtrProduto() {

    }

    public void cadastraProd(int cod, String nome, String descricao, double valor, int estoque, int estoqueMin) {
        p = new Produto();
        p.setCod(cod);
        p.setNome(nome);
        p.setDescri(descricao);
        p.setValor(valor);
        p.setEstoque(estoque);
        p.setEstMin(estoqueMin);
        this.produtos.add(p);
    }

    public void removeObj(int cod) {
        for (Produto p : this.produtos) {
            if (p.getCod() == cod) {
                this.produtos.remove(p);
                return;
            }
        }
    }

    public Produto consultaProd(int cod) {
        for (Produto p : this.produtos) {
            if (p.getCod() == cod) {
                indice = this.produtos.indexOf(p);
                return p;
            }
        }
        return null;
    }

    public Produto avanca() {
        if (indice == produtos.size()) {
            return null;
        } else {
            indice++;
            return this.produtos.get(indice);
        }
    }

    public Produto retorna() {
        if (indice == 0) {
            return null;
        } else {
            indice--;
            return this.produtos.get(indice);
        }
    }
    
    public Produto ultimo()
    {
        return this.produtos.get(this.produtos.size()-1);
    }
    
    public Produto primeiro()
    {
        return this.produtos.get(0);
    }
}
