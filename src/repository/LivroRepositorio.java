package repository;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

/**
 * Repositorio de Livros
 *
 * @author julio-cpsjr
 * @version 1.0
 */
public class LivroRepositorio {

    static List<List<String>> livros = new ArrayList<>();

    public static List<List<String>> listarLivros() {
        return  livros;
    }

    public static void incluirLivros(List<String> livro) {
        livros.add(livro);
    }

    public static void excluirLivros(Livro livro,int quantidade) {
        int indexLivro = livros.indexOf(livro);
        int removeLivro = Livro.getQuantidade();
        if(removeLivro > 0){
            if (removeLivro-quantidade > 0){
            livros.remove(indexLivro);
            livro.setQuantidade(removeLivro-quantidade);
            System.out.println("Livros removido com sucesso!");
            }
        }else{ System.out.println("Livro indisponível");}
    }
}
