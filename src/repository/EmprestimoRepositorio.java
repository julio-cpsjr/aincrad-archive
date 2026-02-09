package repository;

import model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para listar,excluir e incluir emprestimos
 *
 * @author julio-cpsjr
 * @version 1.0
 */
public class EmprestimoRepositorio {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public List<Emprestimo> listarEmprestimos() {

        return this.emprestimos;
    }

    public List<Emprestimo> incluirEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        return this.emprestimos;
    }

    public List<Emprestimo> excluirEmprestimo(int emprestimo) {
        this.emprestimos.remove(emprestimo);
        return this.emprestimos;

    }


}
