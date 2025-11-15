package com.miempresa.petclinicci.services;

import com.miempresa.petclinicci.dtos.PetDTO;
import com.miempresa.petclinicci.entities.Pet;
import com.miempresa.petclinicci.exceptions.PetNotFoundException;

import java.util.List;

/**
 *
 * @author jgomezm
 *
 */
public interface PetService {

    /**
     *
     * @param petDTO
     * @return
     */
    public PetDTO create(PetDTO petDTO);

    /**
     *
     * @param pet
     * @return
     */
    PetDTO update(PetDTO pet);

    /**
     *
     * @param id
     * @throws PetNotFoundException
     */
    void delete(Integer id) throws PetNotFoundException;

    /**
     *
     * @param id
     * @return
     */
    PetDTO findById(Integer id) throws PetNotFoundException;

    /**
     *
     * @param name
     * @return
     */
    List<PetDTO> findByName(String name);

    /**
     *
     * @param typeId
     * @return
     */
    List<Pet> findByTypeId(int typeId);

    /**
     *
     * @param ownerId
     * @return
     */
    List<Pet> findByOwnerId(int ownerId);

    /**
     *
     * @return
     */
    List<Pet> findAll();
}
