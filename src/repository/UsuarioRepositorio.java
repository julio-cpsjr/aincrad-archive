package repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Repositiorio de Usuarios
 *
 * @author julio-cpsjr
 * @version 1.0
 */
public class UsuarioRepositorio {

    private static List<List<String>> usuarios =  new ArrayList<>();

    public static List<List<String>> listarUsuarios() {
        return  usuarios;
    }
    public static void incluirUsuarios(List<String> usuario) {
        usuarios.add(usuario);
    }

    public static void excluirUsuarios(int usuario) {
        if(usuarios.toArray().length > 0){
            usuarios.remove(usuario);
        }else{ System.out.println("Nenhum usuario encontrado");}
    }
}
