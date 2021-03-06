package com.mohbility.sfgpetclinic.repositories;

import com.mohbility.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @project sfg-pet-clinic
 * @author: kbility
 * @Date: 11/11/2018
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
