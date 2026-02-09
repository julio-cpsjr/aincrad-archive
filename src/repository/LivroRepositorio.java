package repository;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para listar,incluir e excluir livros
 *
 * @author julio-cpsjr
 * @version 1.0
 */
public class LivroRepositorio {

    private List<Livro> livros = new ArrayList<>();

    public List<Livro> incluirLivros(Livro livro, int quantidade) {
        livros.add(livro);
        Livro.setQuantidade(quantidade);
        return this.livros;
    }

    public List<Livro> listarLivros() {
        return  this.livros;
    }

    public List<Livro> excluirLivros(int livro, int quantidade) {
        this.livros.remove(livro);
        int removeLivro = Livro.getQuantidade();
        if(removeLivro > 0){
            Livro.setQuantidade(removeLivro-quantidade);
        }else{ System.out.println("Quantidade insuficiente");}
        return this.livros;
    }
}
