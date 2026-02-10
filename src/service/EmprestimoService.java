package service;

import model.Emprestimo;
import repository.EmprestimoRepositorio;

import java.util.ArrayList;

/**
 * Serviço de Emprestimo de Livros
 *
 * @author julio-cpsjr
 * @version 1.0
 */

public class EmprestimoService {
    public static void cadastrarEmprestimo(Emprestimo emprestimo, String nomeDoUsuario, String nomeDoLivro, String descricaoDoLivro, String categoriaDoLivro, int quantidadeDoLivro) {
        emprestimo.setNomeDoUsuario(nomeDoUsuario);
        emprestimo.setNomeDoLivro(nomeDoLivro);
        emprestimo.setDescricaoDoLivro(descricaoDoLivro);
        emprestimo.setCategoriaDoLivro(categoriaDoLivro);
        emprestimo.setQuantidadeDoLivro(quantidadeDoLivro);
        ArrayList<String> novoEmprestimo = new ArrayList<String>();
        EmprestimoRepositorio.incluirEmprestimos(emprestimo.setEmprestimo(novoEmprestimo));
        System.out.println("Emprestimo cadastrado com sucesso!");
    }
    public static void excluirEmprestimo(int emprestimo) {
        EmprestimoRepositorio.excluirEmprestimo(emprestimo);
    }
    public static void verEmprestimos() {
        EmprestimoRepositorio.listarEmprestimos();
    }

}
