package repository;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para Listar Usuários
 *
 * @author julio-cpsjr
 * @version 1.0
 */
public class UsuarioRepositorio {

    private List<Usuario> usuario =  new ArrayList<>();

    public List<Usuario> getUsuario() {
        return usuario;
    }
    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
}
