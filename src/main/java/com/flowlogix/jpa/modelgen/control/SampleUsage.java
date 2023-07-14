package com.flowlogix.jpa.modelgen.control;

import com.flowlogix.jpa.modelgen.entities.Sample_;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class SampleUsage {
    @PersistenceContext
    EntityManager em;

    public String keyName() {
        return Sample_.key.getName();
    }
}
