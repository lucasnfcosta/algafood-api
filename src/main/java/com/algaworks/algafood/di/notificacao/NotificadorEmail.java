package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Cliente %s está sendo notificado pelo email %s: %s%n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
