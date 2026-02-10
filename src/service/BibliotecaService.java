package service;

import model.Livro;
import model.Usuario;
import repository.LivroRepositorio;
import repository.UsuarioRepositorio;

import java.util.ArrayList;

/**
 * Serviço de Biblioteca de Livros
 *
 * @author julio-cpsjr
 * @version 1.0
 */

public class BibliotecaService {


        public static void cadastrarLivro(Livro livro, String nome, String descricao, String categoria, int quantidade){
            livro.setNome(nome);
            livro.setDescricao(descricao);
            livro.setCategoria(categoria);
            livro.setQuantidade(quantidade);
            ArrayList<String> novoLivro = new ArrayList<>();
            LivroRepositorio.incluirLivros(livro.setLivro(novoLivro));
            System.out.println("Livro cadastrado com sucesso!");
            System.out.println("Lista de livros cadastrados:");
            System.out.println(LivroRepositorio.listarLivros());
        }
        public static void listarLivros(){
            System.out.println("Livros cadastrados:");
            System.out.println(LivroRepositorio.listarLivros());
        }
        public static void removerLivro(Livro livro, int quantidade){
            LivroRepositorio.excluirLivros(livro,quantidade);
            System.out.println("Livros disponíveis:");
            System.out.println(LivroRepositorio.listarLivros());
        }

        public static void cadastrarUsuario(Usuario usuario, String nome, String endereco, String cidade, String estado, String inadimplente){
            usuario.setNomeUsuario(nome);
            usuario.setEndereco(endereco);
            usuario.setCidade(cidade);
            usuario.setEstado(estado);
            usuario.setInadimplente(inadimplente);
            ArrayList<String> novoUsuario = new ArrayList<>();
            UsuarioRepositorio.incluirUsuarios(usuario.setUsuario(novoUsuario));
            System.out.println("Usuario cadastrado com sucesso!");
            System.out.println(usuario.exibirUsuario());
        }
        public static void listarUsuarios(){
            System.out.println("Usuarios cadastrados:");
            System.out.println(UsuarioRepositorio.listarUsuarios());
        }
        public static void removerUsuario(int usuarioId){
            UsuarioRepositorio.excluirUsuarios(usuarioId);
            System.out.println("Usuario removido com sucesso!");
            System.out.println("Usuarios cadastrados:");
            System.out.println(UsuarioRepositorio.listarUsuarios());
        }
}
