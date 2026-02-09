package model;

import model.Livro;


public class Emprestimo {
    private String nome_livro;
    private String nome_usuario;
    private String descricao;
    private String categoria;
    private static int quantidade;

    public String getNome_livro() {
        return Livro.getNome();
    }


    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getNome_usuario() {
        return Usuario.getNome();
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getDescricao() {
        return Livro.getDescricao();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return Livro.getCategoria();
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static int getQuantidade() {
        return Livro.getQuantidade();
    }

    public static void setQuantidade(int quantidade) {
        Emprestimo.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "Usuario ='" + getNome_usuario() + '\'' +
                "Livro ='" + getNome_livro() + '\'' +
                ", Descrição='" + getDescricao() + '\'' +
                ", Categoria ='" + getCategoria() + '\'' +
                '}';
    }
}
