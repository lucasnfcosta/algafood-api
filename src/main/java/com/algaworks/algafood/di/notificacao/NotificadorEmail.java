package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.stereotype.Component;


public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String servidorSMTP;

    public boolean isCaixaAlta() {
        return caixaAlta;
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

    public String getServidorSMTP() {
        return servidorSMTP;
    }

    public void setServidorSMTP(String servidorSMTP) {
        this.servidorSMTP = servidorSMTP;
    }

    public NotificadorEmail(String servidorSMTP) {
        this.servidorSMTP = servidorSMTP;
        System.out.println("NotificadorEmail");
    }
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if (caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Cliente %s está sendo notificado pelo email %s: %s",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
