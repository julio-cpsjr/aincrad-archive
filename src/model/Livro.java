package model;


public class Livro {
    private static String nome;
    private static String descricao;
    private static String categoria;
    private static int quantidade;


    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Livro.nome = nome;
    }

    public static String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        Livro.descricao = descricao;
    }

    public static String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        Livro.categoria = categoria;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        Livro.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Nome='" + getNome() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", Categoria='" + getCategoria() + '\'' +
                ", Quantidade=" + getQuantidade() +
                '}';
    }
}
