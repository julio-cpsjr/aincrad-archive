package model;

import java.util.ArrayList;

/**
 * Classe para criação de Emprestimo
 *
 * @author julio-cpsjr
 * @version 1.0
 */
public class Emprestimo {
    private String nomeDoUsuario;
    private String nomeDoLivro;
    private String descricaoDoLivro;
    private String categoriaDoLivro;
    private static int quantidadeDoLivro;

    public String getNomeLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeLivro) {
        this.nomeDoLivro = nomeLivro;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nome) {
        this.nomeDoUsuario = nome;
    }

    public String getDescricaoDoLivro() {
        return descricaoDoLivro;
    }

    public void setDescricaoDoLivro(String descricao) {
        this.descricaoDoLivro = descricao;
    }

    public String getCategoriaDoLivro() {
        return categoriaDoLivro;
    }

    public void setCategoriaDoLivro(String categoria) {
        this.categoriaDoLivro = categoria;
    }

    public static int getQuantidadeDoLivro() {
        return quantidadeDoLivro;
    }

    public void setQuantidadeDoLivro(int quantidade) { this.quantidadeDoLivro = quantidade;
    }

    public ArrayList<String> setEmprestimo(ArrayList<String> emprestimo){
        emprestimo.add("Usuario: " + this.nomeDoUsuario );
        emprestimo.add("Livro: " + this.nomeDoLivro );
        emprestimo.add("Descricao: " + this.descricaoDoLivro );
        emprestimo.add("Categoria: " + this.categoriaDoLivro );
        emprestimo.add("Quantidade: " + this.quantidadeDoLivro );
        return emprestimo;
    }

    public String exibirEmprestimo() {
        return "Emprestimo{" +
                "Usuario ='" + getNomeDoUsuario() + '\'' +
                "Livro ='" + getNomeLivro() + '\'' +
                ", Descrição='" + getDescricaoDoLivro() + '\'' +
                ", Categoria ='" + getCategoriaDoLivro() + '\'' +
                ", Categoria ='" + getQuantidadeDoLivro() + '\'' +
                '}';
    }
    /*
    protected void imprimirInfosComuns(){
        System.out.printf("Titular: %s \n", this.cliente.getNome());
        System.out.printf("Agência: %d \n", this.agencia);
        System.out.printf("br.com.dio.dominio.Conta: %d \n", this.numero);
        System.out.printf("Saldo: %.2f \n", this.saldo);
    }
     */
}
