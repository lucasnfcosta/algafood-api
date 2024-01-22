package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@TipoDeNotificacao(NivelUrgencia.NORMAL)
@Profile("production")
public class NotificadorEmail implements Notificador {

    @Autowired
    NotificacaoConfig notificacaoConfig;

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("host = " + notificacaoConfig.getHost());
        System.out.println("port = " + notificacaoConfig.getPort());
        System.out.printf("Cliente %s está sendo notificado pelo email %s: %s%n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
