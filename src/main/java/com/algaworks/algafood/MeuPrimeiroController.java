package com.algaworks.algafood;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("AtivacaoClienteService: " + this.ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    String hello() {
        Cliente joao = new Cliente("João", "22981662880", "joao@xyz.com");

        ativacaoClienteService.ativarCliente(joao);

        return "Hello!";
    }
}
