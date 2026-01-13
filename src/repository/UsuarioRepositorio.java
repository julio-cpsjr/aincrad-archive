package repository;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {

    private List<Usuario> usuario =  new ArrayList<>();

    public List<Usuario> getUsuario() {
        return usuario;
    }
    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
}
