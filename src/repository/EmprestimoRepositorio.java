package repository;

import model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoRepositorio {
    private List<Emprestimo> Emprestimo = new ArrayList<>();

    public List<Emprestimo> getEmprestimo() {
        return Emprestimo;
    }
    public void setEmprestimo(List<Emprestimo> Emprestimo) {
        this.Emprestimo = Emprestimo;
    }

}
