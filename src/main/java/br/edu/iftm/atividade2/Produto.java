package br.edu.iftm.atividade2;

public class Produto {
    String nome;
    Double preco;

    public Produto(String nome, Double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public double getPreco() {return preco;}

    public void setPreco(Double preco) {this.preco = preco;}
}
