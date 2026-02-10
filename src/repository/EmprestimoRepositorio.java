package repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Repositorio de emprestimos
 *
 * @author julio-cpsjr
 * @version 1.0
 */
public class EmprestimoRepositorio {

    private static List<List<String>> emprestimos = new ArrayList<>();

    public static List<List<String>> listarEmprestimos() {
        return emprestimos;
    }

    public static void incluirEmprestimos(List<String> emprestimo) {
        emprestimos.add(emprestimo);
    }

    public static void excluirEmprestimo(int emprestimoId) {
        if(emprestimos.toArray().length > 0){
            emprestimos.remove(emprestimoId);
            System.out.println("Emprestimo removido com sucesso");
        }else{ System.out.println("Nenhum emprestimo encontrado");}
    }


}
