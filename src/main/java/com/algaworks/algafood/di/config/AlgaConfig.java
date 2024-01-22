package com.algaworks.algafood.di.config;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgaConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificadorEmail = new NotificadorEmail("vuart-12");
        notificadorEmail.setCaixaAlta(true);

        return notificadorEmail;
    }
}
