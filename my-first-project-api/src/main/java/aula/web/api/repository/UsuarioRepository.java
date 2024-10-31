package aula.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import aula.web.api.handler.BusinessException;
import aula.web.api.model.Usuario;

//inversão de controle, determina que ela é um componente
@Repository
public class UsuarioRepository {

     public void save(Usuario usuario){
        //um custom handler
        if(usuario.getLogin() ==null){
            throw new  BusinessException("O campo login é obrigatório");
        }

        if(usuario.getId() == null)
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else 
        System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");

        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }


}
