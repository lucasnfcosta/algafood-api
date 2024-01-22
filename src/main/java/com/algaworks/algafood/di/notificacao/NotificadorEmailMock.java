package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDeNotificacao(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("MOCK: Cliente %s estaria sendo notificado pelo email %s: %s%n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
