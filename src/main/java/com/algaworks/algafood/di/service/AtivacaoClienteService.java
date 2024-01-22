package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativarCliente(Cliente cliente) {
        cliente.ativar();

        eventPublisher.publishEvent(new ClienteAtivoEvent(cliente));
    }
}
