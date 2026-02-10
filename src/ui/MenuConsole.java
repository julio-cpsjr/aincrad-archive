package ui;

import model.Emprestimo;
import model.Livro;
import model.Usuario;
import service.BibliotecaService;
import service.EmprestimoService;
import java.util.Scanner;

public class MenuConsole {
    public static void iniciar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bem Vindo à Biblioteca Aincrad ===");
        System.out.println("Menu: ");
        System.out.println("1 - Usuários");
        System.out.println("2 - Livros");
        System.out.println("3 - Emprestimos");
        System.out.println("======================================");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("=== Usuários ===");
                System.out.println("Menu: ");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Listar");
                System.out.println("3 - Remover");
                System.out.println("======================================");
                usuario();
                break;
            case 2:
                System.out.println("=== Livros ===");
                System.out.println("Menu: ");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Listar");
                System.out.println("3 - Remover");
                System.out.println("======================================");
                livro();
                break;
            case 3:
                System.out.println("=== Emprestimos ===");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Listar");
                System.out.println("3 - Remover");
                System.out.println("======================================");
                emprestimo();
                break;
            default:
                System.out.println("Selecione uma opção válida");

        }
    }
    public static void livro() {
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        Livro livro = new Livro();
        if(opcao == 1) {
            System.out.println("=== Cadastrar Livro ===");
            System.out.println("=== Insira as informações do Livro ===");
            System.out.println("Nome do Livro: ");
            String nome = sc.nextLine();
            System.out.println("Descrição do Livro: ");
            String descricao = sc.nextLine();
            System.out.println("Categoria do Livro: ");
            String categoria = sc.nextLine();
            System.out.println("Quantidade do Livro: ");
            int quantidade = sc.nextInt();
            BibliotecaService.cadastrarLivro(livro,nome,descricao,categoria,quantidade);
        }else if(opcao == 2) {
            System.out.println("=== Listando Livros ===");
            BibliotecaService.listarLivros();
        }else if(opcao == 3) {
            System.out.println("=== Remover Livro ===");
            System.out.println("Insira o ID do Livro: ");
            int livroId = sc.nextInt();
            BibliotecaService.removerLivro(livro,livroId);
        }else {
            System.out.println("Opção Inválida");
        }

    }
    public static void usuario() {
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        if(opcao == 1) {
            System.out.println("=== Cadastrar Usuario ===");
            System.out.println("=== Insira as informações do Usuario ===");
            Usuario usuario = new Usuario();
            System.out.println("Nome do Usuario: ");
            String nome = sc.nextLine();
            System.out.println("Endereço do Usuario: ");
            String endereco = sc.nextLine();
            System.out.println("Cidade do Usuario: ");
            String cidade = sc.nextLine();
            System.out.println("Estado do Usuario: ");
            String estado = sc.nextLine();
            System.out.println("Usuário Inadimplente: ");
            String inadimplente = sc.nextLine();
            BibliotecaService.cadastrarUsuario(usuario,nome,endereco,cidade,estado,inadimplente);
        }else if(opcao == 2) {
            System.out.println("=== Listando Usuarios ===");
            BibliotecaService.listarUsuarios();
        }else if(opcao == 3) {
            System.out.println("=== Remover Usuario ===");
            System.out.println("Insira o ID do Usuário: ");
            int usuarioId = sc.nextInt();
            BibliotecaService.removerUsuario(usuarioId);
        }else {
            System.out.println("Opção Inválida");
        }

    }
    public static void emprestimo() {
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        if(opcao == 1) {
            System.out.println("=== Cadastrar Emprestimo ===");
            System.out.println("=== Insira as informações do Emprestimo ===");
            Emprestimo emprestimo = new Emprestimo();
            System.out.println("Nome do Usuario: ");
            String nomeUsuario = sc.nextLine();
            System.out.println("Nome do Livro: ");
            String nomeLivro = sc.nextLine();
            System.out.println("Descrição do Livro: ");
            String descricao = sc.nextLine();
            System.out.println("Categoria do Usuario: ");
            String categoria = sc.nextLine();
            System.out.println("Quantidade do Livro: ");
            int quantidade = sc.nextInt();
            EmprestimoService.cadastrarEmprestimo(emprestimo,nomeUsuario,nomeLivro,descricao,categoria,quantidade);
        }else if(opcao == 2) {
            System.out.println("=== Listando Emprestimos ===");
            EmprestimoService.verEmprestimos();
        }else if(opcao == 3) {
            System.out.println("=== Remover Emprestimo ===");
            System.out.println("Insira o ID do Emprestimo: ");
            int emprestimoId = sc.nextInt();
            EmprestimoService.excluirEmprestimo(emprestimoId);
        }else {
            System.out.println("Opção Inválida");
        }

    }
}
