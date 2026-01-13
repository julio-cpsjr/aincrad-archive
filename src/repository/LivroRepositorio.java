package repository;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepositorio {

    private List<Livro> livros = new ArrayList<>();

    public void salvar( Livro livro,int quantidade)
    {
        livros.add(livro);
        Livro.setQuantidade(quantidade);
    }

    public void excluir(String livro,int quantidade) {
        int indexLivro = livros.indexOf(livro);
        this.livros.remove(indexLivro);
        int removeLivro = Livro.getQuantidade();
        if(removeLivro > 0){
            Livro.setQuantidade(removeLivro-quantidade);
        }else{ System.out.println("Quantidade insuficiente");}
    }
    public List<Livro>  listar() {
        return  this.livros;
    }

}
