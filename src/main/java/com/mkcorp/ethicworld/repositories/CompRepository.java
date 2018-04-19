package com.mkcorp.ethicworld.repositories;

import com.mkcorp.ethicworld.beans.Comp;
import org.springframework.data.repository.CrudRepository;

public interface CompRepository extends CrudRepository<Comp,Long>{

    Comp findById(long id);

    Comp findByName(String name);

    //List<Comp> searchByName(String name);
}
