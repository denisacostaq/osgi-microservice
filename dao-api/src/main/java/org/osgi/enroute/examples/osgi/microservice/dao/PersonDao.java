package org.osgi.enroute.examples.osgi.microservice.dao;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.enroute.examples.osgi.microservice.dao.dto.PersonDTO;

@ProviderType
public interface PersonDao {
    
    public List<PersonDTO> select();

    public PersonDTO findByPK(Long pk) ;

    public Long save(PersonDTO data);

    public void update(PersonDTO data);

    public void delete(Long pk) ;
}
