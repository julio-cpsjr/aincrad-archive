package ui;

import java.util.Scanner;

public class MenuConsole {
    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bem Vindo à Biblioteca Aincrad ===");
        System.out.println("Menu: ");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Empréstimo livro");
        System.out.println("3 - Excluir livro");
        System.out.println("4 - Listar livros");
        System.out.println("======================================");
    }
}
