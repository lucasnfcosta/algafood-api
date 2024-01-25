package com.algaworks.algafood.jpa;

import com.algaworks.algafood.domain.model.Cozinha;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext
    EntityManager entityManager;

    public List<Cozinha> listarCozinhas() {
        return entityManager.createQuery("from Cozinha", Cozinha.class).getResultList();
    }
}
