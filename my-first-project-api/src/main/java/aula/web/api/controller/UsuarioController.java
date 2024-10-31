package aula.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aula.web.api.model.Usuario;
import aula.web.api.repository.UsuarioRepository;

@RestController
@RequestMapping("/users") //global
public class UsuarioController {
    //realizar o mapeamento 
    //um controller é só um prox, não implemente regras de negócios nessa camada ( dominio ou serviço é o recomendado)
    
    @Autowired 
    private UsuarioRepository repository;
    @GetMapping() //verbo necessário para a realização e o / users da um mapeamento das rotas
    public List<Usuario>getUsers(){
        return repository.listAll();
    }

    @GetMapping("/{userId}")
    public Usuario getOne(@PathVariable("userId") Integer userId){
        return repository.finById(userId);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        repository.remove(id);
        
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario user){ //@Request body garante o json para o spring
        repository.save(user);
    }

    @PutMapping()
    public void putUser(@RequestBody Usuario user){ //@Request body garante o json para o spring
        repository.save(user);
    }

}
