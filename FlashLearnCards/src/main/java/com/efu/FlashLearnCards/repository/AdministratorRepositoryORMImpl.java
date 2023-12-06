package com.efu.FlashLearnCards.repository;

import com.efu.FlashLearnCards.dto.AdministratorDTO;
import com.efu.FlashLearnCards.entity.Administrator;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AdministratorRepositoryORMImpl implements AdministratorRepositoryORM{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Integer addAdministrator(Administrator administrator) {
        entityManager.persist(administrator);
        return administrator.getAdministratorId();
    }

    @Override
    public Integer updateAdministrator(Administrator administrator) {
        return null;
    }

    @Override
    public void deleteAdministrator(AdministratorDTO administratorDTO) {

    }

    @Override
    public Administrator getAdministratorById(Integer administratorId) {
        Administrator administrator = entityManager.createQuery("SELECT a FROM Administrator a WHERE a.administratorId = :administratorId", Administrator.class)
                .setParameter("administratorId", administratorId)
                .getResultList().stream().findFirst().orElse(null);
        if(administrator == null){
            return null;
        } else {
            return administrator;
        }
    }

    @Override
    public List<Administrator> getAllAdministrators() {
        List<Administrator> administrators = entityManager.createQuery("SELECT a FROM Administrator a", Administrator.class)
                .getResultList();
        if(!administrators.isEmpty()){
            return administrators;
        } else {
            return null;
        }
    }
}
