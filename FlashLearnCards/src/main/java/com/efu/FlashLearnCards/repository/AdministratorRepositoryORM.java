package com.efu.FlashLearnCards.repository;

import com.efu.FlashLearnCards.dto.AdministratorDTO;
import com.efu.FlashLearnCards.entity.Administrator;

import java.util.List;

public interface AdministratorRepositoryORM {
    // create public method addAdministrator with Integer return type and Administrator as parameter.
    public Integer addAdministrator(Administrator administrator);

    // create public method updateAdministrator with Integer return type and Administrator as parameter.
    public Integer updateAdministrator(Administrator administrator);

    // create public method deleteAdministrator with void return type and AdministratorDTO as parameter.
    public void deleteAdministrator(AdministratorDTO administratorDTO);

    // create public method getAdministrator with Administrator return type and Integer as parameter.
    public Administrator getAdministratorById(Integer administratorId);

    // create public method getAllAdministrators with ArrayList return type.
    public List<Administrator> getAllAdministrators();

}