package com.jcoh.petclinic.services;

import com.jcoh.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
