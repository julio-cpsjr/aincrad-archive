package model;

import java.util.ArrayList;

/**
 * Classe para criação de Livro
 *
 * @author julio-cpsjr
 * @version 1.0
 */
public class Livro {
    private static String nome;
    private static String descricao;
    private static String categoria;
    private static int quantidade;


    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<String> setLivro(ArrayList<String> livro){
        livro.add("Livro: " + this.nome );
        livro.add("Descricao: " + this.descricao );
        livro.add("Categoria: " + this.categoria );
        livro.add("Quantidade: " + this.quantidade );
        return livro;
    }

    public String exibirLivro() {
        return "Livro{" +
                "Nome='" + getNome() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", Categoria='" + getCategoria() + '\'' +
                ", Quantidade=" + getQuantidade() +
                '}';
    }
}
