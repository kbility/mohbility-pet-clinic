package com.mohbility.sfgpetclinic.services;

import com.mohbility.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
