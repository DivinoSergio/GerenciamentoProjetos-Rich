package com.exemplo.gerenciamento.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = 
            Persistence.createEntityManagerFactory("GP_PU");

    private JPAUtil() {
        // Impede instância
    }

    public static EntityManager getEntityManager() {
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }

    public static void close() {
        ENTITY_MANAGER_FACTORY.close();
    }
}
