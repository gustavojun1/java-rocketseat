package br.com.gustavojun.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // define o tipo de controller
@RequestMapping("/primeiraRota") // define a rota da requisição (http://localhost:{porta}/{rota}/)
// OBS: Funciona se colocar um "/" ao final do endereço
public class MinhaPrimeiraController {
    @GetMapping("/")
    public String primeiraMensagem() {
        return "oi mamãe";
    }
}
