package com.mohbility.sfgpetclinic.repositories;

import com.mohbility.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @project sfg-pet-clinic
 * @author: kbility
 * @Date: 11/11/2018
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
