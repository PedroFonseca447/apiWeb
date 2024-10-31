package aula.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome") //global
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring boot web API";
    }
}
