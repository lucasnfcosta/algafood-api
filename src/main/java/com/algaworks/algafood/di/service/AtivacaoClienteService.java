package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDeNotificacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired
    @TipoDeNotificacao(NivelUrgencia.NORMAL)
    private Notificador notificador;

    public void ativarCliente(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro está ativo!");
    }
}
