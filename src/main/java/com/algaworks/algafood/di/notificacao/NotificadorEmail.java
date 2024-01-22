package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@TipoDeNotificacao(NivelUrgencia.NORMAL)
@Profile("prod")
public class NotificadorEmail implements Notificador {

    @Value("${notificador.email.host}")
    private String host;

    @Value("${notificador.email.port}")
    private String port;

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("host = " + this.host);
        System.out.println("port = " + this.port);
        System.out.printf("Cliente %s está sendo notificado pelo email %s: %s%n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
