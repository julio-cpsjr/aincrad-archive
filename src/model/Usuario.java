package model;

import java.util.ArrayList;

/**
 * Classe para criação de Usuário
 *
 * @author julio-cpsjr
 * @version 1.0
 */
public class Usuario {
    private static String nomeUsuario;
    private static String endereco;
    private static String cidade;
    private static String estado;
    private static String inadimplente;

    public static String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nome) {
        this.nomeUsuario = nome;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        Usuario.endereco = endereco;
    }

    public static String getCidade() {
        return cidade;
    }

    public static void setCidade(String cidade) {
        Usuario.cidade = cidade;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        Usuario.estado = estado;
    }


    public static String getInadimplente() {
        return inadimplente;
    }

    public static void setInadimplente(String inadimplente) {
        Usuario.inadimplente = inadimplente;
    }

    public ArrayList<String> setUsuario(ArrayList<String> usuario){
        usuario.add("Usuario: " + this.nomeUsuario );
        usuario.add("Endereço: " + this.endereco );
        usuario.add("Cidade: " + this.cidade );
        usuario.add("Estado: " + this.estado );
        usuario.add("Inadimplente: " + this.inadimplente );
        return usuario;
    }

    public String exibirUsuario() {
         return "Usuario{" +
                "Nome='" + getNomeUsuario() + '\'' +
                ", Endereço='" + getEndereco() + '\'' +
                ", Cidade=" + getCidade() + '\'' +
                ", Estado=" + getEstado() + '\'' +
                ", Inadimplante =" + getInadimplente() + '\'' +
                '}';
    }
}
