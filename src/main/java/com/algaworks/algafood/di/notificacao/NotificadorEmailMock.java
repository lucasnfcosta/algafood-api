package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("development")
@TipoDeNotificacao(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador{

    @Autowired
    NotificacaoConfig notificacaoConfig;

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("host = " + notificacaoConfig.getHost());
        System.out.println("port = " + notificacaoConfig.getPort());
        System.out.printf("MOCK: Cliente %s estaria sendo notificado pelo email %s: %s%n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
