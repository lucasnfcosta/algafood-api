package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@TipoDeNotificacao(NivelUrgencia.URGENTE)
public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Cliente %s está sendo notificado pelo número de telefone %s: %s%n",
                cliente.getNome(), cliente.getNumeroCelular(), mensagem);
    }
}
